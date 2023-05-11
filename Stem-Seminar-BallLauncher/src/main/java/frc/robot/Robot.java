// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj.motorcontrol.PWMTalonSRX;
import frc.robot.subsystems.Drive;
import frc.utility.XboxController;

/**
 * This is a demo program showing the use of the DifferentialDrive class, specifically it contains
 * the code necessary to operate a robot with tank drive.
 */
public class Robot extends TimedRobot {
  // private DifferentialDrive m_myRobot;
  // private Joystick m_leftStick;
  // private Joystick m_rightStick;

  // private final PWMTalonSRX m_leftMotor = new PWMTalonSRX(0);
  // private final MotorController m_rightMotor = new PWMTalonSRX(1);

  private RobotContainer m_robotContainer;

  @Override
  public void robotInit() {
    // We need to invert one side of the drivetrain so that positive voltages
    // result in both sides moving forward. Depending on how your robot's
    // gearbox is constructed, you might have to invert the left side instead.
    // m_rightMotor.setInverted(true);

    // m_myRobot = new DifferentialDrive(m_leftMotor, m_rightMotor);
    // m_leftStick = new Joystick(0);
    // m_rightStick = new Joystick(1);
    m_robotContainer = new RobotContainer();
    m_robotContainer.m_robotDiffDrive.tankDriveWithInput(kDefaultPeriod, kDefaultPeriod);
    m_robotContainer.m_robotMap.m_leftDriveMotor.setSafetyEnabled(true);
    m_robotContainer.m_robotMap.m_rightDriveMotor.setSafetyEnabled(true);
    
  }

  @Override
  public void teleopPeriodic() {
    //m_myRobot.tankDrive(-m_leftStick.getY(), -m_rightStick.getY());
    m_robotContainer.m_robotMap.m_driveTrain.arcadeDrive(m_robotContainer.getDeadbandedDriverController().getLeftY(), 0);
    //💀
  }
}
