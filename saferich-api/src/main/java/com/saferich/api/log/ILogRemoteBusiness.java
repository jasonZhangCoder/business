package com.saferich.api.log;

import com.saferich.core.Context;
import com.saferich.core.Hessian;
import com.saferich.core.RemoteService;

@Hessian(context = Context.LOG, uri = "/logBusiness")
public interface ILogRemoteBusiness  extends RemoteService {
	/**
	 * 测试
	 */
	void printOut();
}
