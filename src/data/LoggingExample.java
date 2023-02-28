package data;

import org.apache.log4j.Logger;

public class LoggingExample {

	public static void main(String[] args) {
		// add log4j.jar to the project - to build path
		//copy log4j.properties directly inside the src folder
		// create the object of Logger in the code
		
		Logger log = Logger.getLogger("devpinoyLogger");
		log.debug("hello");  //System.out.println("hello");
		log.debug("We are writing in to a log file");  //System.out.println("We are writing in to a log file");
		log.debug("starting the test case xyz test");
		log.debug("starting the test case xyz test1");
	}
}
