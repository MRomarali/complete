package com.example.restservice;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {

	@CrossOrigin(origins = { "*" })
	@PostMapping("/calculate-sum")
	public BarnResponseObject calculateSum(@RequestBody BarnRequestObject requestObject) {
		Calculator calculator = new Calculator();
		return calculator.calculate(requestObject);
	}
}