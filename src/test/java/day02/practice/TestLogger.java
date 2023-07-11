package day02.practice;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class TestLogger {

	public static void main(String[] args) {
		Logger logger = new Logger();
		
		logger.debug("found");
		logger.info("showed");
		logger.error("occured");
		
		logger.debug(0);
		logger.info(10);
		logger.error(100);
		
		logger.debug(10.35f);
		logger.info(40.8f);
		logger.error(35.6f);
		
		logger.debug(true);
		logger.info(true);
		logger.error(false);
		

	}
@Test
public void testGettersSetters() {
	Logger logger = new Logger();
	
	assertEquals("found",logger.debug("found"));
	assertEquals("showed",logger.info("showed"));
	assertEquals("occured",logger.error("occured"));
	
	assertEquals(0,logger.debug(0));
	assertEquals(10,logger.info(10));
	assertEquals(100,logger.error(100));
	
	assertEquals(10.35f,logger.debug(10.35f));
	assertEquals(40.8f,logger.info(40.8f));
	assertEquals(35.6f,logger.error(35.6f));
	
	assertEquals(true,logger.debug(true));
	assertEquals(true,logger.info(true));
	assertEquals(false,logger.error(false));
	
}


}
