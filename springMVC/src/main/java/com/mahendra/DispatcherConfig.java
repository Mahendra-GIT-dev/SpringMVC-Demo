package com.mahendra;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.mahendra"})
public class DispatcherConfig {
	
	@Bean
	public InternalResourceViewResolver viewResource() {
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		vr.setPrefix("\\WEB-INF\\");
		vr.setSuffix(".jsp");
	
		return vr;
	}
	
	
}
