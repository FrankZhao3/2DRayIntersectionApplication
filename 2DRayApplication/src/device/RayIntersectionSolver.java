package device;
/**
 * Created by FrankZhao on 9/22/16.
 */
public class RayIntersectionSolver {
	
	public static Position calculateRayIntersection(MeasurementDevice d1, MeasurementDevice d2) {
		Position res = new Position();
		double coordinateAngle1 = d1.facingAngle + d1.offsetAngle;
		double coordinateAngle2 = d2.facingAngle + d2.offsetAngle;

		// To obtain b = y - tan(theta) x
		double tanTheta1 = Math.tan(toRadius(coordinateAngle1));
		double tanTheta2 = Math.tan(toRadius(coordinateAngle2));
		double b1 = d1.getPositionY() - tanTheta1 * d1.getPositionX();
		double b2 = d2.getPositionY() - tanTheta2 * d2.getPositionX();
		
		// tan(theta1)x + b1 = tan(theta2)x + b2
		// x = (b2 - b1) / (tan(theta1) - tan(theta2))
		if(tanTheta1 - tanTheta2 != 0) {
			double x = (b2 - b1) / (tanTheta1 - tanTheta2);
			res.setX(x);
			// y = tan(theta1)x + b
			res.setY(tanTheta1 * x + b1);
		} else {
			System.out.println("The object's distance can not be measure.");
		}
		return res;
	}
	/**
	 * change degree to radius
	 *
	 * @param degreeAngle   	 degree
	 * @return      			 radius(double)
	 */
	private static double toRadius(double degreeAngle) {
		return degreeAngle * Math.PI / 180.0; 
	}
	/**
	 * Main function
	 */
	public static void main(String[] args) {
		//
	}
}
