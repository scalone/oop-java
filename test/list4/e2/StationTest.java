package list4.e2;

import org.junit.*;
import java.util.*;
import static org.junit.Assert.*;

import br.edu.fatecfranca.list4.e2.*;

public class StationTest {
	private Station station;

	@Before public void setUp() {
		station = new Station();
	}

	@Test public void testCreationBusQuantity() {
		assertEquals(0, station.getBusQuantity());
	}

	@Test public void testCreationName() {
		assertEquals("Principal Station", station.getName());
	}

	@Test public void testCreationCity() {
		assertEquals("Washington/DC", station.getCity());
	}
}
