
package com.fiap.myapp.handlers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomHandler {

	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.getWriter().write("Handled by CustomHandler");
	}
}
