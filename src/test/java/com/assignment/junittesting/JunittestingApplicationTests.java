package com.assignment.junittesting;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JunittestingApplicationTests {
	
	private Calculator c = new Calculator();

	@Test
	void contextLoads() {
	}

	@Test
	void testsum() {		
		int expectedResult = 15;		
		int actualResult = c.sum(10, 5);
		assertThat(actualResult).isEqualTo(expectedResult);
		
	}
	@Test
	void testsub() {
		int expectedResult = 5;		
		int actualResult = c.sub(10, 5);
		assertThat(actualResult).isEqualTo(expectedResult);
		
	}
	@Test
	void testmul() {
		int expectedResult = 50;		
		int actualResult = c.mul(10, 5);
		assertThat(actualResult).isEqualTo(expectedResult);
	
}
	@Test
	void testdiv() {
		int expectedResult = 2;		
		int actualResult = c.div(10, 5);
		assertThat(actualResult).isEqualTo(expectedResult);
	
}
	
}
