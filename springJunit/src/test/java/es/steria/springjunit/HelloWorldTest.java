package es.steria.springjunit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
public class HelloWorldTest {

	private final static Logger LOGGER = LoggerFactory.getLogger(HelloWorldTest.class);

	@Autowired
	HelloWorld helloWorld;

	@Test
	public void testGreet() {
		LOGGER.debug(helloWorld.greet());
	    assertEquals(helloWorld.greet(), "Hello world, from Spring.");
	}

}
