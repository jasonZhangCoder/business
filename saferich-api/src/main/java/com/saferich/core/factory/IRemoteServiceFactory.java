package com.saferich.core.factory;

import com.saferich.core.Product;
import com.saferich.core.RemoteService;

public interface IRemoteServiceFactory {

	/**
	 * 创建服务接口
	 * 
	 * @param clazz
	 *            接口类
	 * @return
	 */
	<T extends RemoteService> T service(Class<T> clazz);

	/**
	 * 创建服务接口
	 * 
	 * @param clazz
	 *            接口类
	 * @param product
	 *            产品线
	 * @return
	 */
	<T extends RemoteService> T service(Class<T> clazz, Product product);
}
