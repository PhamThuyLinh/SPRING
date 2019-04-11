package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Bai1Controller {

	@RequestMapping("")
	public String demo(){
		return"index";
	}
}
