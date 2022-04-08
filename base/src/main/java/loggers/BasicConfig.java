package loggers;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class BasicConfig {

static Logger logger =Logger.getLogger(BasicConfig.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PropertyConfigurator.configure("log4j.properties");

logger.info("this is debug");
	}
 
}
