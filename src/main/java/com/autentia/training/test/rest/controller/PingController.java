package com.autentia.training.test.rest.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.autentia.training.test.rest.model.PingResponse;

@RestController
@RequestMapping("/v1/ping")
public class PingController {

	@RequestMapping(method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseStatus(value = HttpStatus.OK)
	public PingResponse ping(@RequestParam(value = "input", required = true) String input) {
		return new PingResponse(new Date(), input);
	}
	
}
