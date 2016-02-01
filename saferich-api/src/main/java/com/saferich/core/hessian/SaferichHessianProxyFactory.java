package com.saferich.core.hessian;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.net.URL;

import com.caucho.hessian.client.HessianProxyFactory;
import com.caucho.hessian.io.HessianRemoteObject;
import com.saferich.core.Product;

public class SaferichHessianProxyFactory extends HessianProxyFactory {

	private Product product;

	public SaferichHessianProxyFactory(Product product) {
		super();
		this.product = product;
	}

	@Override
	public Object create(Class<?> api, URL url, ClassLoader loader) {
		if (api == null)
			throw new NullPointerException("api must not be null for HessianProxyFactory.create()");
		InvocationHandler handler = null;
		handler = new SaferichHessianProxy(url, this, api, product);
		return Proxy.newProxyInstance(loader, new Class[] { api, HessianRemoteObject.class }, handler);
	}

}
