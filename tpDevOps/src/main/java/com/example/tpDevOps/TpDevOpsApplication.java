package com.example.tpDevOps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class TpDevOpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpDevOpsApplication.class, args);
	}

}

@RestController
class HelloWorldController{
	@GetMapping("/")
	public  String sayHello(''){
		return "Hello World";
	}
}