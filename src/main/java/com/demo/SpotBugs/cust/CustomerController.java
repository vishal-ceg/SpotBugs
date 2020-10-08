package com.demo.SpotBugs.cust;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {
	
	@GetMapping("/customer")
	public Customer getCostomer() {
		return new Customer("vishal", "kumar");
	}

}
