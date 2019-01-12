/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.command.Command;

public class BigToggle extends Command {
  public BigToggle() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.pneumatics);
  }

  boolean bigToggle = true;
  boolean isPressed = false;
  boolean button = Robot.oi.xboxController.getBButtonPressed();

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {

  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {

    if (bigToggle && button) {
      bigToggle = false;
      Robot.pneumatics.retractBigPiston();
      isPressed = true;
    } else if (isPressed && button) {
      isPressed = false;
      Robot.pneumatics.retractBigPiston();
      bigToggle = true;
    } else {
      Robot.pneumatics.bigPistonOff();
    }
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
