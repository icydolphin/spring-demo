package com.ctvit.utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class CacheManagerImpl implements CacheManager{
	
	JedisPool jedisPool;
	
	public CacheManagerImpl(JedisPool jedisPool){
		this.jedisPool = jedisPool;
	}
	
	public String set(String key,String value){
		String result = null;
		Jedis jedis = null;
		try{
			jedis = jedisPool.getResource();
			result = jedis.set(key, value);
		}catch(Exception e){
			e.printStackTrace();			
		}finally{
			if(jedis!=null)
				jedis.close();
		}
		
		return result;
	}
	
	public String get(String key){
		String result = null;
		Jedis jedis = null;
		try{
			jedis = jedisPool.getResource();
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
