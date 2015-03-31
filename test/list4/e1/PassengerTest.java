package list4.e1;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

import br.edu.fatecfranca.list4.e1.*;

public class PassengerTest {
	private Passenger passenger;

	@Before public void setUp() {
		passenger = new Passenger();
	}

	@Test public void testCreationName() {
		assertEquals("Daniel", passenger.getName());
	}

	@Test public void testCreationReserveId() {
		assertEquals(1, passenger.getReserveId());
	}

	@Test public void testShow() {
		assertEquals("Passenger Name: Daniel Reserve Id: 1", passenger.show());
	}
}

