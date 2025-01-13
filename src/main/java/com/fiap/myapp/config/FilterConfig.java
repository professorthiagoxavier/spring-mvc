
package com.fiap.myapp.config;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

	//Exemplo de filtro para todas as rotas da aplicação
	@Bean
	public FilterRegistrationBean<LoggingFilter> loggingFilter() {
		FilterRegistrationBean<LoggingFilter> registrationBean = new FilterRegistrationBean<>(new LoggingFilter());
		registrationBean.addUrlPatterns("/*"); // intercepta todas as requisições
		return registrationBean;
	}

	//Exemplo de filtro para uma rota específica com autenticação
	//Para executar o teste da autenticação, basta executar o código abaixo em um terminal:
	//Invoke-WebRequest -Uri "http://localhost:8080/home" -Headers @{ Authorization = "valid-token" }
	//*******************************************************************************
    //Para testar no postman: 
	//curl -H "Authorization: valid-token" http://localhost:8080/home
	@Bean
	public FilterRegistrationBean<AuthenticationFilter> authenticationFilter() {
		FilterRegistrationBean<AuthenticationFilter> registrationBean = new FilterRegistrationBean<>(
				new AuthenticationFilter());
		registrationBean.addUrlPatterns("/home/*");
		return registrationBean;
	}
}

