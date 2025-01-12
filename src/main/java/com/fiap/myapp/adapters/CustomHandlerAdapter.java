
package com.fiap.myapp.adapters;


import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.ModelAndView;
import com.fiap.myapp.handlers.CustomHandler;

public class CustomHandlerAdapter implements HandlerAdapter {

	@Override
	public boolean supports(Object handler) {
		return handler instanceof CustomHandler;
	}


	@Override
	public ModelAndView handle(jakarta.servlet.http.HttpServletRequest request,
			jakarta.servlet.http.HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getLastModified(jakarta.servlet.http.HttpServletRequest request, Object handler) {
		// TODO Auto-generated method stub
		return 0;
	}
}
