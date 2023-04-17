// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.subsystems.Drive;

/** Add your docs here. */
public class RobotContainer {
    public final RobotMap m_robotMap = new RobotMap();
    public final Drive m_driveTrain= new Drive(m_robotMap.m_leftDriveMotor, m_robotMap.m_rightDriveMotor);


}
