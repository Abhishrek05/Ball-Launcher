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
    public final Drive m_robotDiffDrive= new Drive(m_robotMap.m_leftDriveMotor, m_robotMap.m_rightDriveMotor, m_robotMap.m_driveTrain);
    public final Shooter m_robotShooter = new Shooter(m_robotMap.m_leftShooterMotor, m_robotMap.m_rightShooterMotor, m_robotMap.m_load, m_robotMap.m_leftTransMotor, m_robotMap.m_rightTransMotor);

    private Command interrupt = new InstantCommand(() -> {}, m_robotDiffDrive, m_robotShooter);

    private Command stopShooter = new InstantCommand(() -> {}, m_robotShooter);

    private final DeadbandedXboxController m_driverXbox = new DeadbandedXboxController(OIConstants.XBOX_DRIVER_ID);

    public RobotContainer() {

        configButtonBindings();


        /* Drive Default Commands */
        m_robotDiffDrive.setDefaultCommand(new RunCommand(() -> {
            m_robotDiffDrive.driveWithInput(getDeadbandedDriverController().getLeftY(), getDeadbandedDriverController().getLeftX());
        }, m_robotDiffDrive));

        /* Shooter Default Commands */
        m_robotShooter.setDefaultCommand(new InstantCommand(() -> m_robotShooter.shootWithInput(0), m_robotShooter));

        m_robotShooter.setDefaultCommand(new InstantCommand(() -> m_robotShooter.translateFly("Baseball", 0.5), m_robotShooter));


    }

    private void configButtonBindings() {




        /* Shooter Buttons */
        new JoystickButton(getDeadbandedDriverController(), frc.utility.XboxController.RIGHT_TRIGGER_AXIS) // ! Shoots balls
            .onTrue(new InstantCommand(() -> m_robotShooter.shootWithInput(0.5)));

        new JoystickButton(getDeadbandedDriverController(), frc.utility.XboxController.LEFT_BUMPER_BUTTON) // ! Spins wheels
            .whileTrue(new InstantCommand(() -> m_robotShooter.spinWheels(0.5)))
            .whileFalse(new InstantCommand(() -> stopShooter.asProxy()));

        new JoystickButton(getDeadbandedDriverController(), frc.utility.XboxController.A_BUTTON)           // ! Sets to Baseballs
            .onTrue(new InstantCommand(() -> m_robotShooter.translateFly("Baseball", 0.5)));

        new JoystickButton(getDeadbandedDriverController(), frc.utility.XboxController.B_BUTTON)           // ! Sets to Tennis Balls
            .onTrue(new InstantCommand(() -> m_robotShooter.translateFly("Tennis", 0.5)));

        new JoystickButton(getDeadbandedDriverController(), frc.utility.XboxController.Y_BUTTON)           // ! Sets to Softballs
            .onTrue(new InstantCommand(() -> m_robotShooter.translateFly("Softball", 0.5)));

        








        new JoystickButton(getDeadbandedDriverController(), frc.utility.XboxController.X_BUTTON) // ! Interrupt Button
            .onTrue(new InstantCommand(() -> interrupt.asProxy()));





    }


    public DeadbandedXboxController getDeadbandedDriverController() {
        return this.m_driverXbox;
    }



}
