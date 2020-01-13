package com.fetchrewards.emailchecker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fetchrewards.emailchecker.bean.DataStruct;
import com.fetchrewards.emailchecker.service.EmailCheckService;

@RestController
public class EmailCheckController {

@Autowired
EmailCheckService service;
	
@RequestMapping("/hello")	
 public String uniqueEmails(){
	 return "Hello";
 }

  @RequestMapping("/getUniqueEmails")
  public String getUniqueEmails(@RequestBody DataStruct structure){
	  return "Number of unique email entries = "+service.uniqueEmails(structure);
  }
}
