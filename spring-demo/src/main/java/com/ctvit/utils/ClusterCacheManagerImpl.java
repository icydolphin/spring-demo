package com.ctvit.utils;

import redis.clients.jedis.JedisCluster;

public class ClusterCacheManagerImpl implements CacheManager {
	
	private JedisCluster jedisCluster;
	
	public ClusterCacheManagerImpl(JedisCluster jedisCluster){
		this.jedisCluster = jedisCluster;
	}

	@Override
	public String set(String key, String value) {
		String result = null;
		try{
			result = jedisCluster.set(key, value);
		}catch(Exception e){
			e.printStackTrace();			
		}
		
		return result;
	}

	@Override
	public String get(String key) {
		String result = null;
		try{
			result = jedisCluster.get(key);
		}catch(Exception e){
			e.printStackTrace();			
		}
		
		return result;
	}

}
