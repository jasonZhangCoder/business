package com.saferich.business.log;

import org.junit.Before;
import org.junit.Test;

import com.saferich.api.log.ILogRemoteBusiness;
import com.saferich.core.factory.RemoteServiceFactory;

public class LogRemoteServiceTest {
	
	private ILogRemoteBusiness logRemoteService;
	
	@Before
    public void setUp() throws Exception {
        System.setProperty("business.log.url", "http://127.0.0.1:8080/business-log/remote");
        logRemoteService = RemoteServiceFactory.getInstance().service(ILogRemoteBusiness.class);
    }

    @Test
    public void testActivityBars() {
    	logRemoteService.printOut();
        System.out.println("okok");
    }
}
