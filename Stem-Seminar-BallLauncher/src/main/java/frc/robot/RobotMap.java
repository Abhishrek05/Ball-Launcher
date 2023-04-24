// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.PWMTalonSRX;

/** Add your docs here. */
public class RobotMap {
    public PWMTalonSRX m_leftDriveMotor = new PWMTalonSRX(Constants.DriveConstants.LEFT_DRIVE_MOTOR_ID);
    public PWMTalonSRX m_rightDriveMotor = new PWMTalonSRX(Constants.DriveConstants.RIGHT_DRIVE_MOTOR_ID);
    public DifferentialDrive m_driveTrain = new DifferentialDrive(m_rightDriveMotor, m_leftDriveMotor);

    public PWMTalonSRX m_leftShooterMotor = new PWMTalonSRX(Constants.ShooterConstants.LEFT_SHOOTER_MOTOR_ID);
    public PWMTalonSRX m_rightShooterMotor = new PWMTalonSRX(Constants.ShooterConstants.RIGHT_SHOOTER_MOTOR_ID);
    public PWMTalonSRX m_leftTransMotor = new PWMTalonSRX(Constants.ShooterConstants.LEFT_TRANS_MOTOR_ID);
    public PWMTalonSRX m_rightTransMotor = new PWMTalonSRX(Constants.ShooterConstants.RIGHT_TRANS_MOTOR_ID);
    public PWMTalonSRX m_load = new PWMTalonSRX(Constants.ShooterConstants.LOAD_ID);

    public RobotMap() {}

    
}
