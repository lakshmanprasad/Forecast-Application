package com.lakshman.logger;

import java.io.IOException;
import java.util.logging.*;


public class ForecastLogger {

	private static Logger LOGGER = null;
	private static FileHandler logFile = null;
	
	public static Logger getLogger(String className)
	{
		try {
			LOGGER = Logger.getLogger(className);
			logFile  = new FileHandler("C:\\Log\\ForecastLog.txt",true);
			logFile.setFormatter(new SimpleFormatter());
			LOGGER.addHandler(logFile);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return LOGGER;
	}
}
