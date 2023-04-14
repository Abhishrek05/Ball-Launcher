// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.motorcontrol.PWMTalonSRX;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
  /** Creates a new Shooter. */
  private PWMTalonSRX leftShooterMotor;
  private PWMTalonSRX rightShooterMotor;
  

  public Shooter(PWMTalonSRX leftShooterMotor, PWMTalonSRX rightShooterMotor) {
    this.leftShooterMotor = leftShooterMotor;
    this.rightShooterMotor = rightShooterMotor;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void shootWithInput(double speed) {
    leftShooterMotor.set(speed);
    rightShooterMotor.set(-speed);
  }
}
