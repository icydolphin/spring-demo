package com.ctvit.bussiness.aop;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Action(name = "add")
	public void add(){
		System.out.println("执行新增方法");
	}

}
