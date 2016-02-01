package com.saferich.api.log;

import com.saferich.core.Context;
import com.saferich.core.Hessian;
import com.saferich.core.RemoteService;
import com.saferich.dao.log.user.model.User;

@Hessian(context = Context.LOG, uri = "/logBusiness")
public interface ILogRemoteBusiness extends RemoteService {
    /**
     * 测试
     */
    void printOut();

    void addUser(User user);
}
