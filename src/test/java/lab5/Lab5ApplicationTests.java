package lab5;

import lab5.config.Lab5Application;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Lab5Application.class)
@WebAppConfiguration
public class Lab5ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
