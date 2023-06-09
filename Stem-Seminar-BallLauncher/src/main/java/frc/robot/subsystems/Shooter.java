// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.motorcontrol.PWMTalonSRX;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
  /** Creates a new Shooter. */
  private WPI_TalonSRX leftFlyWheel;
  private WPI_TalonSRX rightFlyWheel;
  private WPI_TalonSRX rightTransMotor;
  private WPI_TalonSRX leftTransMotor;
  private WPI_TalonSRX load;
  

  public Shooter(WPI_TalonSRX leftShooterMotor, WPI_TalonSRX rightShooterMotor /*, WPI_TalonSRX load, WPI_TalonSRX rightTransMotor, WPI_TalonSRX leftTransMotor */) {
    this.leftFlyWheel = leftShooterMotor;
    this.rightFlyWheel = rightShooterMotor;
  /*  this.rightTransMotor = rightTransMotor;
    this.leftTransMotor = leftTransMotor;
    this.load = load; */
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

  // public void loadBall(double speed) {
  //   load.set(speed);
  // }

//   public void translateFly(String name, double speed) {

//     if (name == "Baseball") {
//       rightTransMotor.set(speed);
//       leftTransMotor.set(-speed);
      
//     } else if (name == "Tennis") {
//       rightTransMotor.set(speed);
//       leftTransMotor.set(-speed);

//     } else if (name == "Softball") {
//       rightTransMotor.set(speed);
//       leftTransMotor.set(-speed);

//     }
// }

}
