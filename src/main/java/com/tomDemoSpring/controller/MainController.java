package com.tomDemoSpring.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("mainController")
public class MainController {
	
	/**
	 * @see 範例入口ByModelMap
	 * @return String
	 */
	@RequestMapping(value="mainActionByModelMap", method = RequestMethod.GET)
    public String mainActionByModelMap(ModelMap model) {
        model.addAttribute("responseType", "使用ModelMap方式回應請求");
        return "welcome";
    }
	
	/**
	 * @see 範例入口ByModelAndView
	 * @return ModelAndView
	 */
	@RequestMapping(value="mainActionByModelAndView", method = RequestMethod.GET)
    public ModelAndView mainActionByModelAndView() {
		ModelAndView modelAndView = new ModelAndView("welcome");
	    modelAndView.addObject("responseType", "使用ModelAndView方式回應請求");
	    return modelAndView;
    }
	
	/**
	 * @see 範例入口ByResponseBody
	 * @return Map
	 */
	@RequestMapping(value="mainActionByResponseBody", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> mainActionByResponseBody(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("responseType", "使用RequestMapping方式回應請求");
		return map;	
	}
}
