package device;
/**
 * Created by FrankZhao on 9/23/16.
 */
public class Position {
	private double x = 0;
	private double y = 0;
	
	//default constructor
	public Position() {}
	// constructor takes in x, y positions
	public Position(double x, double y) {
		this.setX(x);
		this.setY(y);
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
}
