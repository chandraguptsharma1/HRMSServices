package com.ucs.hrms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ucs.hrms.service.HRMSService;


@RestController
@RequestMapping(value = "lm/v1/")
public class HRMSController {

	@Autowired 
	HRMSService lmService;

	@GetMapping("test")
	public ResponseEntity<?> test() {
		return new ResponseEntity<String>("{\"message\":"+lmService.getValue()+"}", HttpStatus.OK);
	}

	@GetMapping("testwel")
	public String welcome() {
		return "WELCOMME";
	}
}
