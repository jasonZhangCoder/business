package com.saferich.business.log;

import org.springframework.stereotype.Service;

import com.saferich.api.log.ILogRemoteBusiness;

@Service
public class LogRemoteBusiness implements ILogRemoteBusiness {

	@Override
	public void printOut() {
		System.out.println("app run!--------------------------------");
	}

}
