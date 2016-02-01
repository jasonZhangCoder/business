package com.saferich.core.hessian;

import java.lang.reflect.Method;
import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.caucho.hessian.client.HessianConnection;
import com.caucho.hessian.client.HessianProxy;
import com.caucho.hessian.client.HessianProxyFactory;
import com.saferich.core.Product;

public class SaferichHessianProxy extends HessianProxy {

	private static final long serialVersionUID = -4339052573669593483L;

	private final Logger logger = LoggerFactory.getLogger(getClass());

	private Product product;

	public SaferichHessianProxy(URL url, HessianProxyFactory factory, Class<?> type, Product product) {
		super(url, factory, type);
		this.product = product;
	}

	@Override
	protected void addRequestHeaders(HessianConnection conn) {
		super.addRequestHeaders(conn);
		if (null != product) {
			conn.addHeader("Hunteron-Product", product.name());
		}
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		StringBuilder sb = new StringBuilder();
		sb.append("Hessian Invoke----------->Object ");
		sb.append(proxy != null ? proxy.getClass().getInterfaces()[0].getName() : "null");
		sb.append(" invoke ");
		sb.append(method != null ? method.getName() : "null");
		sb.append(" with args[");
		if (args != null && args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				Object arg = args[i];
				sb.append(arg == null ? "null" : arg.toString());
				if (i < args.length - 1) {
					sb.append(",");
				}
			}
		}
		sb.append("].");
		logger.debug(sb.toString());
		Object result = super.invoke(proxy, method, args);
		logger.debug("Hessian Invoke----------->Result: " + (result == null ? "null" : result.toString()));
		return result;
	}
}
