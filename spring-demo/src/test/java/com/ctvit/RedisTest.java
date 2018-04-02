package com.ctvit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ctvit.utils.ClusterCacheManagerImpl;

public class RedisTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-redis.xml");
		ClusterCacheManagerImpl cacheManager = (ClusterCacheManagerImpl)ctx.getBean("cacheManager");
		//cacheManager.set("test", "specialTest111");
		System.out.println(cacheManager.get("test"));
	}

}
