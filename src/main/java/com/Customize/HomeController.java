package com.Customize;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home")
	public String Home() {
		return "welcome to SBI bank...!";
	}
	
	@GetMapping("/about")
	public String about() {
		return "you can save your money here...";
	}
	
	@GetMapping("/send")
	public String transfer() {
		return "send money...";
	}
	
	@GetMapping("/saving")
	public String check() {
		return "your saving amout is 100000";
	}
}
