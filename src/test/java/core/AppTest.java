package core;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AppTest {

	@BeforeClass
	public static void BeforeClass() throws Exception {
	}

	@AfterClass
	public static void AfterClass() throws Exception {
	}

	@Before
	public void BeforeTest() throws Exception {
	}

	@After
	public void AfterTest() throws Exception {
	}

	@Test
	public void test_01_assertEquals_pos() {
		System.out.println("test_01_assertEquals_pos");
	}

	@Test
	public void test_02_assertEquals_neg() {
		System.out.println("test_02_assertEquals_neg");
	}
	
	@Ignore
	@Test
	public void test_03_assertEquals_ign() {
		System.out.println("test_03_assertEquals_ign");
	}
	
	@Test
	public void test_04_assertSame_pos() {
		System.out.println("test_04_assertSame_pos");
	}

	@Test
	public void test_05_assertSame_neg() {
		System.out.println("test_05_assertSame_neg");
	}
	
	@Ignore
	@Test
	public void test_06_assertSame_ign() {
		System.out.println("test_06_assertSame_ign");
	}
	
	@Test
	public void test_07_assertFalse_pos() {
		System.out.println("test_07_assertFalse_pos");
	}

	@Test
	public void test_08_assertFalse_neg() {
		System.out.println("test_08_assertFalse_neg");
	}

	@Test
	public void test_09_assertTrue_pos() {
		System.out.println("test_09_assertTrue_pos");
	}

	@Test
	public void test_10_assertTrue_neg() {
		System.out.println("test_10_assertTrue_neg");
	}
	
}


