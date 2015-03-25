package lab5.controller.home;

import lab5.business.HomeBusiness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
	@Autowired
	private HomeBusiness business;
}
