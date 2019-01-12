/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * Add your docs here.
 */
public class OI {
    public XboxController xboxController;
    public JoystickButton hatchButton;
    public JoystickButton bigButton;

    public OI() {
        xboxController = new XboxController(1);
        hatchButton = new JoystickButton(xboxController, 1);
        bigButton = new JoystickButton(xboxController, 2);

        hatchButton.whenPressed(new HatchToggle());
        bigButton.whenPressed(new BigToggle());
    }

}
