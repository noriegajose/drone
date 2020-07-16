
package com.jn.drone;

import com.jn.drone.NoriDrone;

public class MissionControl 
{
	private int pitch = 0;
	private int roll = 0;
	private int verticalSpeed = 0;
	private boolean hovering = false;


	public MissionControl() {
		init();
	}
	

	public void landing() {
		System.out.println("Landing");
	}

	public void takeOff() {
		System.out.println("Taking off");
	}

	public void hover() {
		this.pitch = 0;
		this.roll = 0;
		this.verticalSpeed = 0;
		this.hovering = true;
		System.out.println("Hovering ... ");
	}
	
	public boolean getHoverStatus() {
		return hovering;
		
	}
	
	public void moveForward(int speed) {
		this.roll = -speed;
		gyroscopeUpdate();
	}

	public void moveBackward(int speed) {
		this.roll = speed;
		gyroscopeUpdate();
	}

	public void moveRight(int speed) {
		this.pitch = speed;
		gyroscopeUpdate();
	}

	public void moveLeft(int speed) {
		this.pitch = -speed;
		gyroscopeUpdate();
	}

	public void moveUp(int speed) {
		this.verticalSpeed = speed;
		gyroscopeUpdate();
	}

	public void moveDown(int speed) {
		this.verticalSpeed = -speed;
		gyroscopeUpdate();
	}

	
	public int getPitch() {
		return this.pitch;
	}
	
	public int getRoll() {
		return this.pitch;
	}
	
	public int getVerticalSpeed() {
		return this.verticalSpeed;
	}
	
	
	public void gyroscopeUpdate() {
		if (this.pitch == 0 && this.roll == 0 && this.verticalSpeed == 0)
			this.hovering = true;
		else
			this.hovering = false;
		
		System.out.println("MissionControl: GyroscopeUpdate pitch=" + pitch + " roll=" + roll + " verticalSpeed=" + verticalSpeed);
		
	}
	

	private MissionControl init() 
	{
		
		return this;
	}



}
