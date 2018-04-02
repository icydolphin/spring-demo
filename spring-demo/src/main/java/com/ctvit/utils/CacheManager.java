package com.ctvit.utils;


public interface CacheManager {
	
	public String set(String key,String value);
	
	public String get(String key);

}
