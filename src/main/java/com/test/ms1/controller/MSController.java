/**
 * 
 */
package com.test.ms1.controller;

import java.util.logging.Logger;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Arunraja
 *
 */
@RestController
@RequestMapping("/api/ms/test")
public class MSController {

	private final Logger logger = Logger.getLogger("MSController");
	@GetMapping("/name/{name}")
	public ResponseEntity<String> getName(@PathVariable String name){
		logger.info("Entering into the method getname : {}"+name);
		return ResponseEntity.ok("Hai "+ name +". How are you today ?");
	}
	
	
	@GetMapping("/names")
	public ResponseEntity<String> getNames(){
		logger.info("Entering into the method getnames ");
		return ResponseEntity.ok("Arunraja Jayavel");
	}
}
