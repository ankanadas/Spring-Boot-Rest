package com.example.li.exploremicro.cont;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
@RequestMapping("/hellohii")
public String sayHi(){
	return "hello";
	}
}
