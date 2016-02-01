package com.saferich.business.log;

import org.junit.Before;
import org.junit.Test;

import com.saferich.api.log.ILogRemoteBusiness;
import com.saferich.core.factory.RemoteServiceFactory;
import com.saferich.dao.log.user.model.User;

public class LogRemoteServiceTest {

    private ILogRemoteBusiness logRemoteService;

    @Before
    public void setUp() throws Exception {
        System.setProperty("business.log.url", "http://127.0.0.1:8080/business-log/remote");

        logRemoteService = RemoteServiceFactory.getInstance().service(ILogRemoteBusiness.class);
    }

    @Test
    public void testActivityBars() {
        User user = new User();
        user.setName("lisi");
        user.setAge(11);
        logRemoteService.addUser(user);
        System.out.println("ok!!!");
    }
}
