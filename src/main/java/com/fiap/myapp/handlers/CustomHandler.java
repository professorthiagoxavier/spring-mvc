
package com.fiap.myapp.handlers;



public class CustomHandler {

	public void handleRequest(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws Exception {
		response.getWriter().write("Handled by CustomHandler");
	}
}
