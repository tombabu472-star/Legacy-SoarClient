package me.eldodebug.soar.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SoarLogger {
	
    public static final Logger logger = LogManager.getLogger("Aztro Client");
    
    public static void info(String message) {
    	logger.info("[AZ/INFO] " + message);
    }
    
    public static void warn(String message) {
    	logger.warn("[AZ/WARN] " + message);
    }

    public static void error(String message) {
    	logger.error("[AZ/ERROR] " + message);
    }
    
    public static void error(String message, Exception e) {
    	logger.error("[AZ/ERROR] " + message, e);
    }

	public static Logger getLogger() {
		return logger;
	}
}
