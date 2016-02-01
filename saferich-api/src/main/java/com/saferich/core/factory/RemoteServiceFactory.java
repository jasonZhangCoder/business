package com.saferich.core.factory;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.saferich.core.Hessian;
import com.saferich.core.Product;
import com.saferich.core.RemoteService;

public class RemoteServiceFactory implements IRemoteServiceFactory {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	private static RemoteServiceFactory ourInstance = new RemoteServiceFactory();

	// TODO 以后扩展到ioc中
	private static final Map<String, RemoteService> CONTAINER = new HashMap<>();

	private HessianServiceFactory hessianServiceFactory = new HessianServiceFactory();

	public static RemoteServiceFactory getInstance() {
		return ourInstance;
	}

	private RemoteServiceFactory() {
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends RemoteService> T service(Class<T> clazz, Product product) {
		if (clazz == null) {
			logger.error("clazz is null");
			return null;
		}
		T remoteService = (T) CONTAINER.get(clazz.getName());
		if (remoteService != null) {
			return remoteService;
		}
		Hessian h = clazz.getAnnotation(Hessian.class);
		if (h != null) {
			remoteService = hessianServiceFactory.service(h, clazz, product);
			if (remoteService != null) {
				CONTAINER.put(clazz.getName(), remoteService);
			}
			return remoteService;
		}
		logger.error("Can not find the hessian annotation of Type " + clazz.getName());
		return null;
	}

	@Override
	public <T extends RemoteService> T service(Class<T> clazz) {
		return service(clazz, null);
	}

}
