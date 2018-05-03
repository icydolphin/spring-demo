package com.ctvit.bussiness.angular;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	public Person search(String personName){
		return new Person(personName,31,"xinpeilu");
	}

}
