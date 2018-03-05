package com.spring;

import org.apache.log4j.Logger;

public class LogApp {
	final static Logger logger = Logger.getLogger(LogApp.class);

	public static void main(String[] args) {
		LogApp obj = new LogApp();
		obj.runMe("Harish Manana");

		try {
			int no = 1/0;
		} catch(ArithmeticException ae) {
			logger.error("Exception in division", ae);
		}
	}

	private void runMe(String parameter){
		if(logger.isDebugEnabled()){
			logger.debug("This is debug : " + parameter);
		}

		if(logger.isInfoEnabled()){
			logger.info("This is info : " + parameter);
		}

		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.fatal("This is fatal : " + parameter);
	}
}
