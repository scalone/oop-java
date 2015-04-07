package list4.e2;

import org.junit.*;
import java.util.*;
import static org.junit.Assert.*;

import br.edu.fatecfranca.list4.e2.*;

public class PassengerTest {
	private Passenger station;

	@Before public void setUp() {
		station = new Passenger();
	}

	@Test public void testCreationPlace() {
		assertEquals(10, station.getPlace());
	}

	@Test public void testCreationName() {
		assertEquals("Daniel", station.getName());
	}
}

