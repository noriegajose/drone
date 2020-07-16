package com.jn.drone;

public class ChartFlight
{

	public static void main(String[] args)
	{
		INoriDrone noriDrone = null;
		try
		{

			noriDrone = new NoriDrone();
			noriDrone.startEngine();
			
			noriDrone.getCommand().moveForward(60);
			noriDrone.getCommand().takeOff();
			noriDrone.getCommand().moveUp(70);
			noriDrone.getCommand().moveDown(50);
			noriDrone.getCommand().moveRight(30);
			noriDrone.getDroneStatus();
			noriDrone.getCommand().hover();
			noriDrone.getDroneStatus();
			noriDrone.getCommand().moveForward(80);
			noriDrone.getCommand().moveLeft(60);
			noriDrone.getCommand().moveUp(90);
			noriDrone.getDroneStatus();
			noriDrone.getCommand().landing();

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if (noriDrone != null)
				noriDrone.stopEngine();

			System.exit(0);
		}
	}
}
