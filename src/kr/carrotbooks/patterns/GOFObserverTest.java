package kr.carrotbooks.patterns;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.carrotbooks.patterns.observer.*;

public class GOFObserverTest {

	public GOFObserverTest() {
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
	public void testGOFObserver() {
		GOFConcreateSubject subject = new GOFConcreateSubject();

		GOFConcreteObjerver o1 = new GOFConcreteObjerver("MINI");
		GOFConcreteObjerver o2 = new GOFConcreteObjerver("MAINI");
		GOFConcreteObjerver o3 = new GOFConcreteObjerver("MOO");
		
		assertNotNull("Subject not created", subject);
		assertNotNull("Object 1 not created", o1);
		assertNotNull("Object 2 not created", o2);
		assertNotNull("Object 3 not created", o3);
		
		assertTrue(subject.attach(o1));
		assertTrue(subject.attach(o2));
		assertTrue(subject.attach(o3));
		
		assertTrue(o1.onUpdate());

		try {
			subject.broadcast();
		} catch (Exception e) {
			fail("Exception raised: " + e.getMessage());
		}
		
		assertTrue(subject.detach(o1));
		assertTrue(subject.detach(o2));
		assertTrue(subject.detach(o3));
	}

	@Test
	public void testObservableObserver() {
		ObservableSubject subject = new ObservableSubject();
		
		ObservableObserver o1 = new ObservableObserver("Mini");
		ObservableObserver o2 = new ObservableObserver("Maini");
		ObservableObserver o3 = new ObservableObserver("Moo");
		
		assertNotNull(subject);
		
		assertNotNull(o1);
		assertNotNull(o2);
		assertNotNull(o3);
		
		try {
			subject.addObserver(o1);
			subject.addObserver(o2);
			subject.addObserver(o3);
		} catch (Exception e) {
			fail("Exception raised: " + e.getMessage());
		}
		
		subject.broadcast();
		
		subject.deleteObservers();
	}
}
