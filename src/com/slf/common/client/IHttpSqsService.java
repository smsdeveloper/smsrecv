package com.slf.common.client;

import java.util.Map;

public interface IHttpSqsService {

	public boolean putIntoSqs(String httpUrl,String name,String httpAuth,Map<String, String> obj);
	
	public Map<String, String> getFromSqs(String httpUrl,String name,String httpAuth);
}
