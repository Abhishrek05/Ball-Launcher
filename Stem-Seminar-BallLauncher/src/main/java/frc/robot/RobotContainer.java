// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.RunCommand;
import frc.robot.Constants.OIConstants;
import frc.robot.subsystems.Drive;
import frc.utility.DeadbandedXboxController;

/** Add your docs here. */
public class RobotContainer {
    public final RobotMap m_robotMap = new RobotMap();
    public final Drive m_robotDiffDrive= new Drive(m_robotMap.m_leftDriveMotor, m_robotMap.m_rightDriveMotor);

    private final DeadbandedXboxController m_driverXbox = new DeadbandedXboxController(OIConstants.XBOX_DRIVER_ID);
    private final DeadbandedXboxController m_operaterXbox = new DeadbandedXboxController(OIConstants.XBOX_OPERATOR_ID);

    public RobotContainer() {
        m_robotDiffDrive.setDefaultCommand(new RunCommand(() -> {
            m_robotDiffDrive.driveWithInput(getDeadbandedDriverController().getLeftY(), getDeadbandedDriverController().getRightX()); 
        }, m_robotDiffDrive));
    }


    public DeadbandedXboxController getDeadbandedDriverController() {
        return this.m_driverXbox;
    }

    public DeadbandedXboxController getDeadbandedOperatorController() {
        return this.m_operaterXbox;
    }

}
