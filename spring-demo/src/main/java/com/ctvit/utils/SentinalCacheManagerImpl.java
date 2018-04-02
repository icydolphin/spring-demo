package com.ctvit.utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisSentinelPool;

public class SentinalCacheManagerImpl implements CacheManager {
	
	private JedisSentinelPool jedisSentinelPool;
	
	public SentinalCacheManagerImpl(JedisSentinelPool jedisSentinelPool){
		this.jedisSentinelPool = jedisSentinelPool;
	}

	@Override
	public String set(String key, String value) {
		String result = null;
		Jedis jedis = null;
		try{
			jedis = jedisSentinelPool.getResource();
			result = jedis.set(key, value);
		}catch(Exception e){
			e.printStackTrace();			
		}finally{
			if(jedis!=null)
				jedis.close();
		}
		
		return result;
	}

	@Override
	public String get(String key) {
		String result = null;
		Jedis jedis = null;
		try{
			jedis = jedisSentinelPool.getResource();
			result = jedis.get(key);
		}catch(Exception e){
			e.printStackTrace();			
		}finally{
			if(jedis!=null)
				jedis.close();
		}
		
		return result;
	}

}
