package com.ctvit.bussiness.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/query")
	public String query(){
		return "This is a User!!!!";
	}
}
