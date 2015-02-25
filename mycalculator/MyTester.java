package mycalculator;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 *  Edited by: Ero E. Castillo
 *  date: 02-25-2015
 *
 */


public class MyTester {

	@Test
	public void testAdd() {
		MyCalculator mc = new MyCalculator();	//MyCalculator instance
		float actual = mc.add(5, 3);		//function call
		
		assertEquals("5 + 3 = 8", 8, actual, 0.0 );
		System.out.println(" "+ actual);
	}

	@Test
	public void testSubtract() {
		MyCalculator mc = new MyCalculator();	//MyCalculator instance
		float actual = mc.subtract(5, 3);		//function call
		
		assertEquals("5 - 3 = 2", 2, actual, 0.0 );
		System.out.println(" "+ actual);
	}

	@Test
	public void testMultiply() {
		MyCalculator mc = new MyCalculator();	//MyCalculator instance
		float actual = mc.multiply(5, 3);		//function call
		
		assertEquals("5 * 3 = 15", 15, actual, 0.0 );
		System.out.println(" "+ actual);
	}

	@Test
	public void testDivide() {
		MyCalculator mc = new MyCalculator();	//MyCalculator instance
		float actual = mc.divide(15, 3);		//function call
		
		assertEquals("15 / 3 = 5", 5, actual, 0.0 );
		System.out.println(" "+ actual);
	}

	@Test
	public void testSquare() {
		MyCalculator mc = new MyCalculator();	//MyCalculator instance
		float actual = mc.square(5);		//function call
		
		assertEquals("5^2 = 25", 25, actual, 0.0 );
		System.out.println(" "+ actual);
	}

	@Test
	public void testCube() {
		MyCalculator mc = new MyCalculator();	//MyCalculator instance
		float actual = mc.cube(5);		//function call
		
		assertEquals("5^3 = 125", 125, actual, 0.0 );
		System.out.println(" "+ actual);
	
	}

	@Test
	public void testNfactorial() {
		MyCalculator mc = new MyCalculator();	//MyCalculator instance
		int actual = mc.nfactorial(0);		//function call
		int actual1 = mc.nfactorial(9);		//function call
		int actual2 = mc.nfactorial(11);	//function call
		int actual3 = mc.nfactorial(1);		//function call
		
		assertEquals("0! = 1", 1, actual, 0.0 );
		System.out.println(" "+ actual);
		
		assertEquals("9! = 362880", 362880, actual1, 0.0 );
		System.out.println(" "+ actual1);
	
		assertEquals("11! = 39916800", 39916800, actual2, 0.0 );
		System.out.println(" "+ actual2);
	
		assertEquals("1! = 1", 1, actual3, 0.0 );
		System.out.println(" "+ actual3);
	
	
	}

	@Test
	public void testBinarySearch() {
		MyCalculator mc = new MyCalculator();	//MyClaculator instance
		int array[] = new int[] {10,20,30,40,50,60,71,80,90,91 };	//initialized array of integers for testing
		int x = 71;		//number to be searched using BinarySearch method
		int y = 20;		//number to be searched using BinarySearch method
		int n = 60;		//number to be searched using BinarySearch method
		int m = 90;		//number to be searched using BinarySearch method
		int actual = mc.binarySearch(array, x);		//function call
		int actual1 = mc.binarySearch(array, y);	//function call
		int actual2 = mc.binarySearch(array, n);	//function call
		int actual3 = mc.binarySearch(array, m);	//function call
		
		assertEquals("71 is at index", 6, actual, 0.0 );
		System.out.println(" "+ actual);
		
		assertEquals("20 is at index", 1, actual1, 0.0 );
		System.out.println(" "+ actual1);
		
		assertEquals("60 is at index", 5, actual2, 0.0 );
		System.out.println(" "+ actual2);
		
		assertEquals("90 is at index", 8, actual3, 0.0 );
		System.out.println(" "+ actual3);
	
	}

}
