package com.ctvit.bussiness.websocket;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class WsController {
	
	@Autowired
	private SimpMessagingTemplate simpMessagingTemplate;
	
	
	@MessageMapping("/welcome")
	@SendTo("/topic/getResponse")
	public WiselyResponse say(WiselyMessage message) throws Exception{
		Thread.sleep(3000);
		return new WiselyResponse("Welcome "+message.getName()+"!");
	}
	
	@MessageMapping("/chat")
	public void handleChat(Principal principal ,String msg){
		if(principal.getName().equals("xpl")){
			simpMessagingTemplate.convertAndSendToUser("cyt", "/queue/notifications", msg);
		}
		if(principal.getName().equals("cyt")){
			simpMessagingTemplate.convertAndSendToUser("xpl", "/queue/notifications", msg);
		}
	}

}
