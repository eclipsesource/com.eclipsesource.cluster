package com.eclipsesource.cluster.jetty.demo.webbundle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ClusterJettyDemoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setStatus(HttpServletResponse.SC_OK);
		response.getWriter().println("<h1>Hello Clustered World</h1>");
		response.getWriter().println("<br>session=" + request.getSession(true).getId());
		response.getWriter().println("<br>creation time=" + request.getSession().getCreationTime());
		response.getWriter().println("<br>last accessed=" + request.getSession().getLastAccessedTime());
	}

}
