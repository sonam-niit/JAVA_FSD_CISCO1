package com.cisco.estore;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	public String homePage() {
		return "home";
	}
	
	@RequestMapping(value = "/welcome",method = RequestMethod.GET)
	public String welcomePage(Model model) {
		Date date= new Date();
		SimpleDateFormat format= new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		String dateTimeStamp= format.format(date);
		model.addAttribute("welcomeDateTime",dateTimeStamp);
		return "welcome";
	}
}
