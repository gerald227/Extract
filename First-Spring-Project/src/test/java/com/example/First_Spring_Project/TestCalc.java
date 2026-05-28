package com.example.First_Spring_Project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalc {

	@Test
	void test() {
		Calculate calc = new Calculate();
		assertEquals(calc.Square(2),4);
	}

}
