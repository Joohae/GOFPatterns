package kr.carrotbooks.patterns;

import kr.carrotbooks.patterns.abstractFactory.AbstractFactoryClient;
import kr.carrotbooks.patterns.abstractFactory.FactoryGold;
import kr.carrotbooks.patterns.abstractFactory.FactorySilver;
import kr.carrotbooks.patterns.abstractFactory.IGOFAbstractFactory;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GOFAbstractFactoryTest {

	public GOFAbstractFactoryTest() {
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
	public void test() {
		IGOFAbstractFactory golden = new FactoryGold();
		IGOFAbstractFactory silver = new FactorySilver();
		
		AbstractFactoryClient client;
		
		client = new AbstractFactoryClient(golden);
		client.produceItem(3);
		
		client = new AbstractFactoryClient(silver);
		client.produceItem(2);

	}

}
