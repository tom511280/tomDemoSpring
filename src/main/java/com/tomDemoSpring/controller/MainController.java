package com.tomDemoSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("mainController")
public class MainController {
	
	/**
	 * @see 範例入口
	 * @param model
	 * @return
	 */
	@RequestMapping(value="mainAction", method = RequestMethod.GET)
	//@RequestMapping(method = RequestMethod.GET)
    public String mainAction(ModelMap model) {
        model.addAttribute("greeting", "Hello World from Spring 4 MVC");
        return "welcome";
    }
}
