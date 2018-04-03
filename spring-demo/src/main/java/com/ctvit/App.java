package com.ctvit;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;

import com.ctvit.bussiness.property.AuthorSettings;
import com.ctvit.bussiness.property.PropertyReadService;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ImportResource(locations={"classpath:spring-redis.xml"})
@RestController("/")
public class App extends SpringBootServletInitializer
{
		
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        SpringApplication springApplication = new SpringApplication(App.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        ConfigurableApplicationContext context = springApplication.run(App.class, args);
        PropertyReadService propertyReadService = (PropertyReadService)context.getBean("propertyReadService");
        AuthorSettings authorSettings = propertyReadService.getAuthorSettings();
        System.out.println(authorSettings.getId());
    }
    //SpringBootServletInitializer是打war时使用外部Tomcat
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(App.class);
    }
}
