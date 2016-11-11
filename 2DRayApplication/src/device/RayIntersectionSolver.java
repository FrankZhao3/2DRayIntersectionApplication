package device;
/**
 * Created by FrankZhao on 9/22/16.
 */
public class RayIntersectionSolver {
	
	public static Position calculateRayIntersection(MeasurementDevice d1, MeasurementDevice d2) {
		Position res = new Position();
		double coordinateAngle1 = d1.facingAngle + d1.offsetAngle;
		double coordinateAngle2 = d2.facingAngle + d2.offsetAngle;

		// set constraint
		int constraint_d1 = setConstraint(coordinateAngle1);
		int constraint_d2 = setConstraint(coordinateAngle2);
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
			System.out.println("The object's position can not be measure because two rays are parallel.");
		}
		// constraint checking
		if(checkConstraint(constraint_d1, res, d1.getPosition()) && checkConstraint(constraint_d2, res, d2.getPosition())) {
			return res;
		} else {
			System.out.println("Two ray do not have an intersection because they are uncrossable");
			return new Position();
		}
	}
	
	
	
	private static int setConstraint(double coordinateAngle1) {
		if(coordinateAngle1 <= 90) {
			return 1;
		} else if(coordinateAngle1 <= 180) {
			return 2;
		} else if(coordinateAngle1 <= 270) {
			return 3;
		} else {
			return 4;
		}
	}
	
	
	private static boolean checkConstraint(int constraint, Position res, Position p) {
//		System.out.println("constraint: " + String.valueOf(constraint) + " " + res + p);
		switch(constraint) {
			case 1:
				return res.getX() >= p.getX() && res.getY() >= p.getY();
			case 2:
				return res.getX() <= p.getX() && res.getY() >= p.getY();
			case 3:
				return res.getX() <= p.getX() && res.getY() <= p.getY();
			case 4:
				return res.getX() >= p.getX() && res.getY() <= p.getY();
		}
		return false;
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
