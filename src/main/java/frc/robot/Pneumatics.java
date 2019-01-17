/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class Pneumatics extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public static final DoubleSolenoid hatchSolenoid1 = new DoubleSolenoid(1, 0, 1),
      hatchSolenoid2 = new DoubleSolenoid(1, 2, 3);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void fireHatchPiston() {
    hatchSolenoid1.set(DoubleSolenoid.Value.kForward);
    hatchSolenoid2.set(DoubleSolenoid.Value.kForward);
  }

  public void retractHatchPiston() {
    hatchSolenoid1.set(DoubleSolenoid.Value.kReverse);
    hatchSolenoid2.set(DoubleSolenoid.Value.kReverse);
  }

  public void HatchPistonOff() {
    hatchSolenoid1.set(DoubleSolenoid.Value.kOff);
    hatchSolenoid2.set(DoubleSolenoid.Value.kOff);
  }


}
