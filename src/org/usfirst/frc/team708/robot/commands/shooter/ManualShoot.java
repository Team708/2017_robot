package org.usfirst.frc.team708.robot.commands.shooter;
import org.usfirst.frc.team708.robot.Constants;
import org.usfirst.frc.team708.robot.RobotMap;
import org.usfirst.frc.team708.robot.util.Gamepad;
import org.usfirst.frc.team708.robot.Robot;
import org.usfirst.frc.team708.robot.OI;

//import org.team708.robot.OI;
//import org.team708.robot.subsystems.Loader;
//import org.team708.robot.util.Gamepad;
//import org.team708.robot.commands.shooter.Fire;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class ManualShoot extends Command {


    public ManualShoot() {
    	requires(Robot.feeder);
    	requires(Robot.intake_ball);
    	requires(Robot.drivetrain);
    	requires(Robot.shooter);
    }
    
// Called just before this Command runs the first time
    protected void initialize() {
		Robot.shooter.setFgain(Constants.SHOOTER_F);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
//    	boolean L_Shoulderpressed = OI.operatorGamepad.getButton(Gamepad.button_L_Shoulder);
    	
//    	if (L_Shoulderpressed == true){
    		Robot.shooter.manualSpeed(Constants.SHOOTER_MOTOR_SPEED_HIGH);
//    	}
//    	else
//    		Robot.shooter.manualSpeed(Constants.SHOOTER_MOTOR_OFF);		
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.shooter.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems are scheduled to run
    protected void interrupted() {
    	end();
    }
}
