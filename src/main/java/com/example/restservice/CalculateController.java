package com.example.restservice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.*;


@RestController
public class CalculateController {

	//@CrossOrigin(origins = { "*" })
	//@GetMapping("/calculate")
	//public BarnRequestObject calculate() {
	//	return new BarnRequestObject(123, 1, 2, 3);
	//}

	@CrossOrigin(origins = { "*" })
	@PostMapping("/calculate-sum")
	public BarnResponseObject calculateSum(@RequestBody BarnRequestObject requestObject) {
		Calculator calculator = new Calculator();
		return calculator.calculate(requestObject);
	}
}