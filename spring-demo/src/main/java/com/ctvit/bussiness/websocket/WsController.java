package com.ctvit.bussiness.websocket;

import java.security.Principal;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WsController {
	
	SimpleMes
	
	@MessageMapping("/welcome")
	@SendTo("/topic/getResponse")
	public WiselyResponse say(WiselyMessage message) throws Exception{
		Thread.sleep(3000);
		return new WiselyResponse("Welcome "+message.getName()+"!");
	}
	
	@MessageMapping("/chat")
	public void handleChat(Principal principal ,String msg){
		if(principal.getName().equals("xpl")){
			
		}
	}

}
