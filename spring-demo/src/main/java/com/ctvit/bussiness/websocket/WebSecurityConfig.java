package com.ctvit.bussiness.websocket;

import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableWebSecurity
public class WebSecurityConfig //extends WebSecurityConfigurerAdapter 
{
	
	/*@Override
	protected void configure(HttpSecurity http) throws Exception{
		  http
		  .authorizeRequests()
          .antMatchers("/","/login").permitAll()//1根路径和/login路径不拦截
          .anyRequest().authenticated()
          .and()
          .formLogin()
          .loginPage("/login") //2登陆页面
          .defaultSuccessUrl("/chat") //3登陆成功转向该页面
          .permitAll()
          .and()
          .logout()
          .permitAll();
	}
	
	@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
            .inMemoryAuthentication()
            .withUser("xpl").password("xpl").roles("USER")
            .and()
            .withUser("cyt").password("cyt").roles("USER");
    }
	
	*//**
	 * 忽略静态资源的拦截
	 *//*
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/resources/static/**")
        .antMatchers("/resources/templates/**");
    }*/
	
	
		
}
