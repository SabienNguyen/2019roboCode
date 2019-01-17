/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * Add your docs here.
 */
public class OI {
    public XboxController xboxController;
    public JoystickButton hatchButtonFire;
    public JoystickButton hatchButtonRetract;

    public OI() {
        xboxController = new XboxController(3);
        hatchButtonFire = new JoystickButton(xboxController, 2);
        hatchButtonRetract = new JoystickButton(xboxController, 1);

        hatchButtonFire.whenPressed(new HatchForward());
        hatchButtonRetract.whenPressed(new HatchRetract());

    }

}
