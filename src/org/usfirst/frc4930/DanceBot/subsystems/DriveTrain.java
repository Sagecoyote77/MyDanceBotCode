package org.usfirst.frc4930.DanceBot.subsystems;



import org.usfirst.frc4930.DanceBot.Robot;
import org.usfirst.frc4930.DanceBot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {

	public void initDefaultCommand() {
	       
    }


    public void move(double left, double right) {
    	 RobotMap.driveTank;
    }

    public void tankDrive() {
    	double left = Robot.oi.j0.getY();
    	double right = Robot.oi.j0.getY();
    	move(left, right);
    }
    
    public void stop() {
    	RobotMap.driveTank.stopMotor();
    }
}