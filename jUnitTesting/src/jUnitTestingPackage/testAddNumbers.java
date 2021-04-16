package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumbers {

	@Test
	void test()
	{ 
		jUnitFunction junit = new jUnitFunction();
		int result = junit.addNumbers(100,200);
		assertEquals(300,result);
		
	}

}
