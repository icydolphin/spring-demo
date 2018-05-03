package com.ctvit.bussiness.angular;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.templateresolver.TemplateResolver;

//@Configuration
public class HtmlResolverConfig {
	
	//@Bean
	public TemplateResolver templateResolver(){
		TemplateResolver templateResolver =  new TemplateResolver();
		templateResolver.setPrefix("/WEB-INF/templates");
		return templateResolver;
	}

}
