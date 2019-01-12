/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.command.Command;

public class HatchToggle extends Command {
  public HatchToggle() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.pneumatics);
  }

  boolean isPressed = false;
  boolean hatchToggle = true;
  boolean button = Robot.oi.xboxController.getAButtonPressed();

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    if (hatchToggle && button) {
      hatchToggle = false;
      Robot.pneumatics.retractHatchPiston();
      isPressed = true;
    } else if (isPressed && button) {
      hatchToggle = true;
      Robot.pneumatics.fireHatchPiston();
    } else {
      Robot.pneumatics.HatchPistonOff();
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
