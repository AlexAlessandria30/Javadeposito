package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class homeCotroller {
 @RequestMapping("/")
 

 public String index() {
	 return "index";
 }
 
 @RequestMapping("/demo")
 
 @ResponseBody
 public String demo() {
	 return "Ciao a tutti sono un demo";
 }
}
