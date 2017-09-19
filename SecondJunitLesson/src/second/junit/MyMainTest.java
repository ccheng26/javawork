package second.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMainTest {
	@BeforeClass
	public static void beforeClassTest() {
		//static, takes no params, runs before all
		//initializing variables, after all variables available
		System.out.println("before everyone");
	}
	@AfterClass
	public static void afterClassTest() {
		//static, takes no params, runs after all
		//invoke garbage collector
		System.out.println("before everyone");
	}
	@Test
	public void test() {
		//assert value and name of function
		//JUnitLesson juni= new JUnitLesson();
		//assertEquals("Connie",juni.myName());
		//name of test is included in class
		System.out.println("I'm in the first test");
	}
	@Test
	public void secondTest() {
		System.out.println("I'm in second test");
	}
	@Before
	public void beforeTest() {//runs before each test
		System.out.println("before method");
	}
	@After
	public void afterTest() {//runs after each test
		System.out.println("after method");
	}
}