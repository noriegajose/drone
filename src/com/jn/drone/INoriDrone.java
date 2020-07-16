
package com.jn.drone;


import com.jn.drone.MissionControl;


public interface INoriDrone {

	public MissionControl getCommand();

	
	public void startEngine();
	public void stopEngine();
	
	
	public void land();
	public void takeOff();
	public void moveForward();
	public void moveBackward();
	public void moveRight();
	public void moveLeft();
	public void moveUp();
	public void moveDown();
	public void hover();
	public void getDroneStatus();

	//getter
	public int getSpeed();
	public void setSpeed(int speed);

		
}
