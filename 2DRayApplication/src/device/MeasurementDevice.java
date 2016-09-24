package device;
/**
 * Created by FrankZhao on 9/23/16.
 */
public class MeasurementDevice {
	Position position; 
	Double offsetAngle; // measure in degree
	Double facingAngle;	// angle offset between x-axis (counter-clockwise) measure in degree
	
	public MeasurementDevice(Double positionX, Double positionY, Double offsetAngle, Double facingAngle) {
		position = new Position(positionX, positionY);
		this.offsetAngle = offsetAngle;
		this.facingAngle = facingAngle;
	}
	
	public Double getPositionX() {
		return position.getX();
	}
	public void setPositionX(Double positionX) {
		position.setX(positionX);
	}
	public Double getPositionY() {
		return position.getY();
	}
	public void setPositionY(Double positionY) {
		position.setY(positionY);
	}
	public Double getOffsetAngle() {
		return offsetAngle;
	}
	public void setOffsetAngle(Double offsetAngle) {
		this.offsetAngle = offsetAngle;
	}
	public Double getFacingAngle() {
		return facingAngle;
	}
	public void setFacingAngle(Double facingAngle) {
		this.facingAngle = facingAngle;
	}

}
