package list4.e1;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

import br.edu.fatecfranca.list4.e1.*;

public class ReserveTest {
	private Reserve reserve;

	@Before public void setUp() {
		reserve = new Reserve();
	}

	@Test public void testCreationId() {
		assertEquals(1, reserve.getId());
	}

	@Test public void testCreationFlightId() {
		assertEquals(1, reserve.getFlightId());
	}

	@Test public void testShow() {
		assertEquals("Reserve Id: 1 Flight Id: 1", reserve.show());
	}
}

