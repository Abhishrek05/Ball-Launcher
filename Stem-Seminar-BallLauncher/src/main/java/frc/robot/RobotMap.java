// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.PWMTalonSRX;
import frc.robot.subsystems.Drive;

/** Add your docs here. */
public class RobotMap {
    public WPI_TalonSRX m_leftDriveMotor = new WPI_TalonSRX(Constants.DriveConstants.LEFT_DRIVE_MOTOR_ID);
    public WPI_TalonSRX m_rightDriveMotor = new WPI_TalonSRX(Constants.DriveConstants.RIGHT_DRIVE_MOTOR_ID);
    public DifferentialDrive m_drive = new DifferentialDrive(m_rightDriveMotor, m_leftDriveMotor);
    public Drive m_driveTrain = new Drive(m_leftDriveMotor, m_rightDriveMotor, m_drive);

    public WPI_TalonSRX m_leftShooterMotor = new WPI_TalonSRX(Constants.ShooterConstants.LEFT_SHOOTER_MOTOR_ID);
    public WPI_TalonSRX m_rightShooterMotor = new WPI_TalonSRX(Constants.ShooterConstants.RIGHT_SHOOTER_MOTOR_ID);
    public WPI_TalonSRX m_leftTransMotor = new WPI_TalonSRX(Constants.ShooterConstants.LEFT_TRANS_MOTOR_ID);
    public WPI_TalonSRX m_rightTransMotor = new WPI_TalonSRX(Constants.ShooterConstants.RIGHT_TRANS_MOTOR_ID);
    public WPI_TalonSRX m_load = new WPI_TalonSRX(Constants.ShooterConstants.LOAD_ID);

    public RobotMap() {}

    
}
