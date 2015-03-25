package lab5.controller.hello;

import lab5.business.HelloBusiness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {
	@Autowired
	private HelloBusiness business;
}
