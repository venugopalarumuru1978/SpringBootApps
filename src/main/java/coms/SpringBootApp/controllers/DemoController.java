package coms.SpringBootApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	
	@GetMapping("/testinfos")
	public String Page()
	{
		return "This is Docker with Jenkins App Deployment";
	}
	
}
