package com.example.additioneurREST;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.controller.AdderController;
import com.example.services.AddService;

@SpringBootTest
class AdditioneurRestApplicationTests {
	AdderController AdderController;
	@BeforeAll
	public void init() {
		AdderController = new AdderController(new AddService());
	}
	@Test
	void contextLoads() {
		int sum=AdderController.currentNum();
		assertEquals(0, sum);
	}

}
