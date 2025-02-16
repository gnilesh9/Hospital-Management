package com.hospital.management.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.management.service.UserService;
import com.hospital.management.userdto.UserDto;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping(path = "/user")
@Slf4j
public class UserController{
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping
	public ResponseEntity<String> createUser(@RequestBody UserDto userDto) {
		String msg= userService.addUser(userDto);
		
		return new ResponseEntity<String>(msg,HttpStatus.OK);
		
		
	}
	
	
	
	

}
