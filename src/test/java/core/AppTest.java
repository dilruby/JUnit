package core;



import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AppTest {

	@BeforeClass
	public static void BeforeClass() throws Exception {
		//System.out.println("BeforeClass method will be executed before first test method starts");
	}

	@AfterClass
	public static void AfterClass() throws Exception {
		//System.out.println("AfterClass method will be executed after last test method completed");
	}

	@Before
	public void BeforeTest() throws Exception {
		//System.out.println("Before method will execute before every test method");
	}

	@After
	public void AfterTest() throws Exception {
		//System.out.println("After method will execute after every test method");
	}

	@Test
	public void test_01_assertEquals_pos() {
		//System.out.println("test_01_assertEquals_pos");
		assertEquals("Strings do not match", "Testing JUnit 4", App.str);
	}

	@Test
	public void test_02_assertEquals_neg() {
		//System.out.println("test_02_assertEquals_neg");
		assertEquals("Strings do not match", "Testing JUnit 3", App.str);
	}
	
	@Ignore
	@Test
	public void test_03_assertEquals_ign() {
		//System.out.println("test_03_assertEquals_ign");
		assertEquals("Strings do not match", "Testing JUnit 4", App.str);
	}
	
	@Test
	public void test_04_assertSame_pos() {
		//System.out.println("test_04_assertSame_pos");
		assertSame("Integers do not match", 55, App.in);
	}

	@Test
	public void test_05_assertSame_neg() {
		//System.out.println("test_05_assertSame_neg");
		assertSame("Integers do not match", 52, App.in);
		
	}
	
	@Ignore
	@Test
	public void test_06_assertSame_ign() {
		//System.out.println("test_06_assertSame_ign");
		assertSame("Integer do not match", 51, App.in);
	}
	
	@Test
	public void test_07_assertFalse_pos() {
		//System.out.println("test_07_assertFalse_pos");
		assertFalse("Boolean has to be false", App.bf);
	}

	@Test
	public void test_08_assertFalse_neg() {
		//System.out.println("test_08_assertFalse_neg");
		assertFalse("Boolean has to be false", App.bt);
		
	}

	@Test
	public void test_09_assertTrue_pos() {
		//System.out.println("test_09_assertTrue_pos");
		assertTrue("Boolean has to be true", App.bt);
	}

	@Test
	public void test_10_assertTrue_neg() {
		//System.out.println("test_10_assertTrue_neg");
		assertTrue("Boolean has to be true", App.bf);
	}
	
}


