package springbootapps.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class welcomecontroller {
	
	@RequestMapping("/welcome")
	public String hello() {
		return "Hi! Hello Welocome Gradle Project";
	}
	

}
