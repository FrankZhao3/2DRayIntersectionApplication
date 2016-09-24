package device;
/**
 * Created by FrankZhao on 9/23/16.
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class RayIntersectionSolverTest {

	@Test
	public void testCalculateRayIntersection() {
		// Test the example measurement
		MeasurementDevice m1 = new MeasurementDevice(0.0, 2.0, 10.0, 0.0);
		MeasurementDevice m2 = new MeasurementDevice(3.0, 0.0, 24.0, 90.0);
		assertEquals(true, compareMeasurement(new Position(1.9, 2.6), 
						RayIntersectionSolver.calculateRayIntersection(m1, m2)));
		
	}
	
	/**
	 * Return if the two position are off by distance 0.5
	 *
	 * @param p1    p1's position
	 * @param p2    p2's position
	 * @return      boolean
	 */
	private boolean compareMeasurement(Position p1, Position p2) {
		System.out.println("Measurement Results: " + "X: " + Double.toString(p2.getX()) + " Y: " +  Double.toString(p2.getY()));
		if(Math.abs(p1.getX() - p2.getX()) < 0.5 && Math.abs(p1.getY() - p2.getY()) < 0.5) {
			return true;
		} else {
			return false;
		}
	}
}
