// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.PWMTalonSRX;

/** Add your docs here. */
public class RobotMap {
    public PWMTalonSRX m_leftDriveMotor = new PWMTalonSRX(0);
    public PWMTalonSRX m_rightDriveMotor = new PWMTalonSRX(1);
    public DifferentialDrive m_driveTrain = new DifferentialDrive(m_rightDriveMotor, m_leftDriveMotor);

    public PWMTalonSRX m_leftShooterMotor = new PWMTalonSRX(11);
    public PWMTalonSRX m_rightShooterMotor = new PWMTalonSRX(12);
    public PWMTalonSRX m_leftTransMotor = new PWMTalonSRX(13);
    public PWMTalonSRX m_rightTransMotor = new PWMTalonSRX(14);
    public PWMTalonSRX m_load = new PWMTalonSRX(15);

    public RobotMap() {}

    
}
