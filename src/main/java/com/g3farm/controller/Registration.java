package com.g3farm.controller;
import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;


import com.g3farm.model.G3FarmFarmer;
import com.g3farm.service.LoginService;
@Controller

@RequestMapping("/FarmerLogin")

public class Registration {

	
	@Autowired
	
	    private LoginService loginService;            // This will auto-inject the authentication service into the controller.
	
	 
	
	    private static Logger log = Logger.getLogger(Registration.class);
	
	 
	
	    // Checks if the user credentials are valid or not.
	
	    @RequestMapping(value = "/validate", method = RequestMethod.POST)
	
	    public ModelAndView validateUsr(@RequestParam("username")String username, @RequestParam("password")String password) {
	
	        String msg = "";
	
	        boolean isValid = loginService.findUser(username, password);
	
	        log.info("Is user valid?= " + isValid);
	
	 
	
	        if(isValid) {
	
	            msg = "Welcome " + username + "!";
	
	        } else {
	
	            msg = "Invalid credentials";
	
	        }
	
	 
	
	        return new ModelAndView("result", "output", msg);
	
	    }

	}


