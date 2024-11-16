package com.fortune.ecommerce.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class productController {

 @RequestMapping("/")
public String greet(){
    return "Hello their this is my new app";
}
    
}
