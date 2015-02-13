package org.mot.web;

import javax.servlet.ServletContext;

import org.apache.log4j.PropertyConfigurator;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;
import org.mot.common.tools.PropertiesFactory;

/**
 * Application object for your web application.
 * If you want to run this application without deploying, run the Start class.
 * 
 * @see org.mot.web.server.EmbeddedWebServer#main(String[])
 */
public class MyOpenTraderWeb extends WebApplication
{
	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	@Override
	public Class<? extends WebPage> getHomePage()
	{
		return HomePage.class;
	}

	/**
	 * @see org.apache.wicket.Application#init()
	 */
	@Override
	public void init()
	{
		super.init();
		
		// Check the properties
		PropertiesFactory pf = PropertiesFactory.getInstance();
		ServletContext context = this.getServletContext();
		String configDir = pf.getConfigDir();
		
		// If the configDir is already set, use this one otherwise get the context
		if (configDir == null) {
			configDir = context.getRealPath("/WEB-INF/conf");
			pf.setConfigDir(configDir);
		}

		System.out.println("*** STARTING NEW MYOPENTRADER WEB INSTANCE ***");
		System.out.println("Using Config directory: " + configDir);
		System.out.println("Using context path: " + context.getContextPath());
		System.out.println("**********");
		
		// Configure the log4j properties		
		PropertyConfigurator.configure(pf.getConfigDir()+ "/log4j.properties");

	}
	

}
