package test.com.teqbridgeltd.explore;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.teqbridgeltd.explore.SimpleOne;

public class SimpleOneTest2 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	private SimpleOne so;
	@Before
	public void setUp() throws Exception {
		so = new SimpleOne();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testComputeAreaRectangle() {
		assertEquals(so.computeAreaRectangle(2, 3), 6);
	}

	@Test
	public void testComputeAreaCircle() {
		double ca = so.computeAreaCircle(7);
		assertEquals(Math.round(ca), 154);
	}

}
