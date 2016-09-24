package device;

public class MeasurementDevice {
	Position position; 
	Double offsetAngle;
	Double facingAngle;	// angle offset between x-axis (counter-clockwise)
	
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
