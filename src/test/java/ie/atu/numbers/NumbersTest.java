package ie.atu.numbers;

import junit.framework.*;
import ie.atu.numbers.Numbers;

@SuppressWarnings("unused")
public class NumbersTest extends TestCase{
	
	Numbers numbers = new Numbers();
   
	//test add method test added test
	public void testAdd() {
		int sum = numbers.sum(9,10);
		assertEquals(sum, 19);
	}
	
	public void testSubtract() {
		int subtract = numbers.subtract(10,1);
		assertEquals(subtract, 9);
	}
	
	public void testLargest() {
		int large = numbers.largest(10,1);
		assertEquals(large, 10);
	}
//
//	public void testSmallest() {
//		fail("Not yet implemented");
//	}
}
