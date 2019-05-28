package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@GetMapping("/")
	public ModelAndView hi() {
		ModelAndView mav = new ModelAndView("hello");
		mav.addObject("name"," Bhagya ");
		return mav;
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
}
