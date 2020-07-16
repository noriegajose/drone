package com.jn.drone;



import com.jn.drone.MissionControl;
import com.jn.drone.NoriEngine;


public class NoriDrone implements INoriDrone {

	private final String ENGINE_SIZE = "4";
	private String droneStatus = "OFF";
	
	
	private NoriEngine noriEngine = new NoriEngine(ENGINE_SIZE);
	
	
	private MissionControl missionControl = new MissionControl();
	private int speed = 0;
	
	
	/** constructor */
	public NoriDrone() {
//		this(IP_ADDRESS);
	}


	public MissionControl getCommand() {
		if (missionControl == null) {
			missionControl = new MissionControl();
		}
		return missionControl;
	}

	
	@Override
	public void stopEngine() {
		droneStatus="OFF";
		noriEngine.shutOffEngineEngine();
	}

	@Override
	public void startEngine() {
		droneStatus="ON";
		noriEngine.startEngine();
	}


	@Override
	public void land() {
		if (missionControl != null)
			missionControl.landing();
	}

	@Override
	public void takeOff() {
		if (missionControl != null)
		{
			missionControl.takeOff();
		}
	}


	@Override
	public void moveForward() {
		if (missionControl != null)
			missionControl.moveForward(speed);
	}

	@Override
	public void moveBackward() {
		if (missionControl != null)
			missionControl.moveBackward(speed);
	}

	@Override
	public void moveRight() {
		if (missionControl != null)
			missionControl.moveRight(speed);
	}

	@Override
	public void moveLeft() {
		if (missionControl != null)
			missionControl.moveLeft(speed);
	}

	@Override
	public void moveUp() {
		if (missionControl != null)
			missionControl.moveUp(speed);
	}

	@Override
	public void moveDown() {
		if (missionControl != null)
			missionControl.moveDown(speed);
	}

	

	public void hover() {
		if (missionControl != null)
			
			missionControl.hover();
	}
	

	
	@Override
	public void setSpeed(int speed) {
		this.speed = speed;
		
	}

	
	@Override
	public int getSpeed() {
		System.out.println(String.valueOf(speed));
		return this.speed;
	}
	


	public void getDroneStatus() {
		switch (droneStatus) {
        case "OFF":
            System.out.println("OFF");
            break;
                
        case "ON":
        	if (missionControl.getPitch() != 0 || missionControl.getRoll() != 0 || missionControl.getVerticalSpeed() != 0)
        		System.out.println("DRONE IS ON THE MOVE");
        	else if (missionControl.getPitch() == 0 && missionControl.getRoll() == 0 && missionControl.getVerticalSpeed() == 0){
        		System.out.println("DRONE IS HOVERING");
        	}
        	else {
        		System.out.println("DRONE IS WAITING FOR INSTRUCTIONS");
        	}
        		
            break;
                     
        }
	}


}