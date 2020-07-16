package com.jn.drone;

public class NoriEngine {

	private static String engineSize = null;
	private static String engineStatus = "OFF";
	
	private static NoriEngine instance = new NoriEngine(engineSize); 
	
	public NoriEngine(String engineSize) {
		this.engineSize = engineSize;
	}
	
	public static NoriEngine getInstance(){ 
	       return instance; 
	} 
	  
	
	public void setEngineSize(String engineSize) {
		this.engineSize = engineSize;
	}

	public String getEngineSize() {
		return engineSize;
	}

	
	public String getEngineStatus() {
		return engineStatus;
	}
	
	public void startEngine() {
		
		this.engineStatus = "ON";
		System.out.println("Starting Engine");
	}

	public void shutOffEngineEngine() {
		this.engineStatus = "OFF";
		System.out.println("Shutting Off Engine");

	}

	public String toString() {
		return "Engine Size: " + engineSize;
	}


}
