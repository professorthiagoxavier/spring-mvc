
package com.fiap.myapp.interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class CustomInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws java.lang.Exception {
		// Aqui pdoemos gerar log de request, verificar se o usuário está logado, etc.
		System.out.println("Pre Handle method chamado... ");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws java.lang.Exception {
		// Aqui podemos adicionar atributos ao modelAndView
		System.out.println("Post Handle method is Calling");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			java.lang.Exception exception) throws java.lang.Exception {
		// Aqui podemos gerar log de response, limpar, etc.
		System.out.println("Request and Response is completed");
	}
}
