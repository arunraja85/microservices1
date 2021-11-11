/**
 * 
 */
package com.test.ms1.controller;

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
@RequestMapping("/")
public class MSController {

	@GetMapping("/{name}")
	public ResponseEntity<String> getName(@PathVariable String name){
		return ResponseEntity.ok("Hai "+ name +". How are you today ?");
	}
	
}
