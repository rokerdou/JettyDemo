package com.ss.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SMNServlet extends HttpServlet {
	
	

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)  {
		// TODO Auto-generated method stub
		System.out.println("进来了");
		try {
			
			arg1.setStatus(HttpServletResponse.SC_OK);
			arg1.getWriter().println("Hello world,Doujia!");
			arg1.getWriter().flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
