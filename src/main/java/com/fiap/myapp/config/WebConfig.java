package com.fiap.myapp.config;

import java.util.Collections;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import com.fiap.myapp.adapters.CustomHandlerAdapter;
import com.fiap.myapp.handlers.CustomHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
	// Configurações personalizadas

	@Bean
	public CustomHandler customHandler() {
		return new CustomHandler();
	}

	@Bean
	public CustomHandlerAdapter customHandlerAdapter() {
		return new CustomHandlerAdapter();
	}
	
    @Bean
    public SimpleUrlHandlerMapping customHandlerMapping() {
        SimpleUrlHandlerMapping mapping = new SimpleUrlHandlerMapping();
        mapping.setUrlMap(Collections.singletonMap("/custom", customHandler()));
        mapping.setOrder(0); 
        return mapping;
    }
}
