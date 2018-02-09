package com.viraj.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Executed before Class");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Executed after Class");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Executed before each test");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Executed after each test");
	}

	@Test
	void test() {
		System.out.println("Executed test0");
	}
	
	@Test
	void test1() {
		System.out.println("Executed test1");
	}


}
