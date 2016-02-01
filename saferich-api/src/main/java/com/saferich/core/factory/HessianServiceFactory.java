package com.saferich.core.factory;

import java.net.MalformedURLException;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.saferich.core.Context;
import com.saferich.core.Hessian;
import com.saferich.core.Product;
import com.saferich.core.RemoteService;
import com.saferich.core.hessian.SaferichHessianProxyFactory;

public class HessianServiceFactory {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	public <T extends RemoteService> T service(Hessian h, Class<T> clazz, Product product) {
		if (StringUtils.isEmpty(h.uri())) {
			logger.error("Can not find the url in the annotation of Type " + clazz.getName());
			return null;
		}
		Context context = h.context();
		if (context == null) {
			logger.error("Can not find the context in the annotation of Type " + clazz.getName());
			return null;
		}
		return create(context.getRemoteUrl() + h.uri(), clazz, product);
	}

	@SuppressWarnings("unchecked")
	private <T> T create(String url, Class<T> clazz, Product product) {
		SaferichHessianProxyFactory factory = new SaferichHessianProxyFactory(product);
		T t = null;
		try {
			t = (T) factory.create(clazz, url);
		} catch (MalformedURLException e) {
			logger.error("create hessian bean error.", e);
		}
		return t;
	}

}
