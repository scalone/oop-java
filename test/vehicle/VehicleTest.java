package vehicle;

import static org.junit.Assert.*;

import org.junit.Test;

import br.edu.fatecfranca.vehicle.Vehicle;

public class VehicleTest {
	@Test
	public void testCreation() {
		Vehicle vehicle  = new Vehicle();
		//vehicle.type     = JOptionPane.showInputDialog("Type: ");
		//vehicle.color    = JOptionPane.showInputDialog("Color: ");
		//vehicle.year     = Integer.parseInt(JOptionPane.showInputDialog("Year: "));
		//vehicle.wheels   = Integer.parseInt(JOptionPane.showInputDialog("Wheels: "));

		//vehicle.setType(JOptionPane.showInputDialog("Type: "));

		assertEquals(2004, vehicle.year);
		//JOptionPane.showMessageDialog(null, vehicle.show());
	}
}

