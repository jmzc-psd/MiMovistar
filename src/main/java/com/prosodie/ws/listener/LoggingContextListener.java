package com.prosodie.ws.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;

public class LoggingContextListener implements ServletContextListener
{

	public void contextDestroyed(ServletContextEvent event)
	{
		LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
		lc.stop();
	}

	public void contextInitialized(ServletContextEvent event){}
	
	
}
