package com.ss.demo;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.util.thread.QueuedThreadPool;
import org.eclipse.jetty.webapp.WebAppContext;

public class test {

	public static void main(String[] args) {
		Server server=new Server(8888);

		QueuedThreadPool qp = new QueuedThreadPool();
		qp.setMaxThreads(180);
		qp.setMinThreads(10);
		qp.setDetailedDump(false);
		server.setThreadPool(qp);
		WebAppContext webapp =new WebAppContext();
		webapp.setDefaultsDescriptor("./web/WEB-INF/web.xml");
		webapp.setResourceBase("./web/");
		server.setHandler(webapp);

		try {
			server.start();
			server.join();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
