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
  private PWMTalonSRX leftFlyWheel;
  private PWMTalonSRX rightFlyWheel;
  private PWMTalonSRX rightTransMotor;
  private PWMTalonSRX leftTransMotor;
  private PWMTalonSRX load;
  

  public Shooter(PWMTalonSRX leftShooterMotor, PWMTalonSRX rightShooterMotor, PWMTalonSRX load, PWMTalonSRX rightTransMotor, PWMTalonSRX leftTransMotor) {
    this.leftFlyWheel = leftShooterMotor;
    this.rightFlyWheel = rightShooterMotor;
    this.rightTransMotor = rightTransMotor;
    this.leftTransMotor = leftTransMotor;
    this.load = load;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void shootWithInput(double speed) {
    leftFlyWheel.set(-speed); // Clockwise Spin
    rightFlyWheel.set(speed); // Counterclockwise Spin
  }

  public void spinWheels(double speed) {
    leftFlyWheel.set(-speed); // Clockwise Spin
    rightFlyWheel.set(speed); // Counterclockwise Spin
  }

  public void loadBall(double speed) {
    load.set(speed);
  }

  public void translateFly(String name, double speed) {

    if (name == "Baseball") {
      rightTransMotor.set(speed);
      leftTransMotor.set(-speed);
      
    } else if (name == "Tennis") {
      rightTransMotor.set(speed);
      leftTransMotor.set(-speed);

    } else if (name == "Softball") {
      rightTransMotor.set(speed);
      leftTransMotor.set(-speed);

    }
}

}
