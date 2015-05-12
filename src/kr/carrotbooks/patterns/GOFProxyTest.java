package kr.carrotbooks.patterns;

import kr.carrotbooks.patterns.proxy.GOFProxy;
import kr.carrotbooks.patterns.proxy.IGOFProxySubject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GOFProxyTest {

	public GOFProxyTest() {
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGOFProxy() {
		IGOFProxySubject proxy1 = new GOFProxy("FIRST FILE");
		IGOFProxySubject proxy2 = new GOFProxy("SECOND FILE");
		
		proxy1.displayImage();	// loading necessary
		proxy1.displayImage();	// loading not necessary
		
		proxy2.displayImage();
		proxy2.displayImage();
		proxy2.displayImage();
	}
}
