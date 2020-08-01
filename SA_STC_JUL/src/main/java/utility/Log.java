package utility;

import org.apache.log4j.Logger;

public class Log {

	// Initialise Log4j logs
	private static Logger Log = Logger.getLogger(Log.class.getName());

	// log for startTestCase
	public static void startTestCase(String testCaseName) {

		Log.info("****************************************************************************************");
		Log.info("**                    START TEST EXECUTION " + testCaseName + "                       **");
		Log.info("****************************************************************************************");
	}

	public static void info(String message) {
		Log.info(message);
	}

	public static void warn(String message) {
		Log.warn(message);
	}

	public static void error(String message) {
		Log.error(message);
	}

	public static void fatal(String message) {
		Log.fatal(message);
	}

	public static void debug(String message) {
		Log.debug(message);
	}	

	// log for endTestCase
	public static void endTestCase(String testCaseName) {
		Log.info("****************************************************************************************");
		Log.info("**                    END OF TEST EXECUTION " + testCaseName + "                      **");
		Log.info("****************************************************************************************");
	}



}