package com.fannie.log4j;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.ConsoleAppender;

public class Hippo {
	static Logger logger = Logger.getLogger(Hippo.class);

	public static void main(String args[]) {
		String pattern = "Milliseconds since program start: %r %n";
		pattern += "Classname of caller: %C %n";
		pattern += "Date in ISO8601 format: 	%d{ISO8601} %n";
		pattern += "Location of log event: %l %n";
		pattern += "Message: %m %n %n";
		PatternLayout layout = new PatternLayout(pattern);
		ConsoleAppender appender = new ConsoleAppender(layout);
		logger.addAppender(appender);
		logger.setLevel((Level) Level.DEBUG);
		logger.debug("Here is some DEBUG");
	}
}
