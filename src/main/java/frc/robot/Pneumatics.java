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
  public static final DoubleSolenoid hatchSolenoid1 = new DoubleSolenoid(1, 2),
      hatchSolenoid2 = new DoubleSolenoid(3, 4), bigSolenoid1 = new DoubleSolenoid(5, 6),
      bigSolenoid2 = new DoubleSolenoid(7, 8);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void fireHatchPiston() {
    hatchSolenoid1.set(DoubleSolenoid.Value.kForward);
    hatchSolenoid1.set(DoubleSolenoid.Value.kForward);
  }

  public void fireBigPiston() {
    bigSolenoid1.set(DoubleSolenoid.Value.kForward);
    bigSolenoid1.set(DoubleSolenoid.Value.kForward);
  }

  public void retractHatchPiston() {
    hatchSolenoid1.set(DoubleSolenoid.Value.kReverse);
    hatchSolenoid1.set(DoubleSolenoid.Value.kReverse);
  }

  public void retractBigPiston() {
    bigSolenoid1.set(DoubleSolenoid.Value.kReverse);
    bigSolenoid1.set(DoubleSolenoid.Value.kReverse);
  }

  public void HatchPistonOff() {
    hatchSolenoid1.set(DoubleSolenoid.Value.kOff);
    hatchSolenoid1.set(DoubleSolenoid.Value.kOff);
  }

  public void bigPistonOff() {
    bigSolenoid1.set(DoubleSolenoid.Value.kOff);
    bigSolenoid1.set(DoubleSolenoid.Value.kOff);
  }

}
