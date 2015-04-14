package list4.e2;

import org.junit.*;
import java.util.*;
import static org.junit.Assert.*;

import br.edu.fatecfranca.list4.e2.*;

public class BusTest {
	private Bus bus;

	@Before public void setUp() {
		bus = new Bus();
	}

	@Test public void testCreationPassengerQuantity() {
		assertEquals(0, bus.getPassengerQuantity());
	}

	@Test public void testCreationNumber() {
		assertEquals("1020-10", bus.getNumber());
	}

	@Test public void testCreatePassenger() {
		bus.createPassenger(2, "Luis");
		ArrayList<Passenger> passengers = bus.getPassengers();
		Passenger passenger = passengers.get(0);

		assertEquals("Luis", passenger.getName());
		assertEquals(2, passenger.getPlace());
	}
}

