package com.tomDemoSpring.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.tomDemoSpring.service.MainServicebyName;

@Service(value="test")
public class MainServicebyNameImpl implements MainServicebyName{

	private static final Logger LOGGER = LoggerFactory.getLogger(MainServicebyNameImpl.class);
	
	@Override
	public void mainFunction() {
		LOGGER.info("MainServicebyNameImpl，執行主方法");
	}

}
