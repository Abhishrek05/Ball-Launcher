// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants.OIConstants;
import frc.robot.subsystems.Drive;
import frc.robot.subsystems.Shooter;
import frc.utility.DeadbandedXboxController;

/** Add your docs here. */
public class RobotContainer {
    public final RobotMap m_robotMap = new RobotMap();
    public final Drive m_robotDiffDrive= new Drive(m_robotMap.m_leftDriveMotor, m_robotMap.m_rightDriveMotor);
    public final Shooter m_robotShooter = new Shooter(m_robotMap.m_leftShooterMotor, m_robotMap.m_rightShooterMotor);

    private Command interuppt = new InstantCommand(() -> {}, m_robotDiffDrive, m_robotShooter);

    private final DeadbandedXboxController m_driverXbox = new DeadbandedXboxController(OIConstants.XBOX_DRIVER_ID);

    public RobotContainer() {

        configButtonBindings();


        /* Drive Default Commands */
        m_robotDiffDrive.setDefaultCommand(new RunCommand(() -> {
            m_robotDiffDrive.tankDriveWithInput(getDeadbandedDriverController().getLeftY(), getDeadbandedDriverController().getRightX()); // ! logically doesn't make sense, review this
        }, m_robotDiffDrive));

        /* Shooter Default Commands */
        m_robotShooter.setDefaultCommand(new RunCommand(() -> {
            m_robotShooter.shootWithInput(0);
        }, m_robotShooter));


    }

    private void configButtonBindings() {





        new JoystickButton(getDeadbandedDriverController(), frc.utility.XboxController.RIGHT_TRIGGER_AXIS)
            .whileTrue(new InstantCommand(() -> m_robotShooter.shootWithInput(0.5)));

        new JoystickButton(getDeadbandedDriverController(), frc.utility.XboxController.X_BUTTON)
            .onTrue(new InstantCommand(() -> interuppt.asProxy()));





    }


    public DeadbandedXboxController getDeadbandedDriverController() {
        return this.m_driverXbox;
    }



}
