package JavaSamples12;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import org.apache.logging.log4j.LogManager;

public class HelloWorld {
	//final static Logger LOG = LogManager.getLogger(HelloWorld.class);
	final static Logger LOG = Logger.getLogger(HelloWorld.class.getName());

	public static void main(String[] args) throws SecurityException,IOException {

		int a = 5;
		int b = 6;

		FileHandler fileHandler = new FileHandler("applog.log", true);
		LOG.addHandler(fileHandler);
		int c = a + b;
		LOG.info("Addition =" + c);
		LOG.log(java.util.logging.Level.WARNING, "Addition =" +c);

		// TODO Auto-generated method stub
		String message = "Hello World";
	   // LOG.debug("This Will Be Printed On Debug");
		LOG.info(message + "This Will Be Printed On Info");
		LOG.warning(message + "This Will Be Printed On Warn");
	  //   LOG.error(message + "This Will Be Printed On Error");
	   // LOG).fatal(message + "This Will Be Printed On Fatal");

		LOG.info("Appending string: {}."+ message);
		System.out.println(message);

	}

}
