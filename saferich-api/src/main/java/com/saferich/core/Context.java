package com.saferich.core;

public enum Context {

	LOG("business.log.url");
	
    private String remoteUrlConfigKey;

    private Context(String remoteUrlConfigKey) {
        this.remoteUrlConfigKey = remoteUrlConfigKey;
    }

    public String getRemoteUrl() {
        return System.getProperty(remoteUrlConfigKey, "http://127.0.0.1/remote");
    }
}
