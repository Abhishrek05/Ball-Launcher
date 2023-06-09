// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.PWMTalonSRX;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drive extends SubsystemBase {
  /** Creates a new Drive. */
  private WPI_TalonSRX leftDriveMotor;
  private WPI_TalonSRX rightDriveMotor;
  private DifferentialDrive driveTrain;
  

  public Drive(WPI_TalonSRX leftDriveMotor, WPI_TalonSRX rightDriveMotor, DifferentialDrive driveTrain) {
    this.leftDriveMotor = leftDriveMotor;
    this.rightDriveMotor = rightDriveMotor;
    this.driveTrain = driveTrain;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void driveWithInput(double move, double steer) {
    driveTrain.arcadeDrive(move, steer); // ! If this does not work, go to 2020 repo and use the math used there in the DriveWithJoystick class (Is a command)
    rightDriveMotor.set(-rightDriveMotor.get());
  }

  public void tankDriveWithInput(double leftMove, double rightMove) {
    leftDriveMotor.set(leftMove);
    rightDriveMotor.set(rightMove);
  }

  
  }
