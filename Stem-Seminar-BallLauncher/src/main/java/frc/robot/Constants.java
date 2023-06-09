// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

/** Add your docs here. */
public final class Constants {

    public static final class DriveConstants{
        /* Drive Motor IDs */
        public static final int LEFT_DRIVE_MOTOR_ID = 0; // TODO
        public static final int RIGHT_DRIVE_MOTOR_ID = 1; // TODO
    }

    public static final class ShooterConstants{
        /* Shooter Motor IDs */
        public static final int LEFT_SHOOTER_MOTOR_ID = 7; // TODO
        public static final int RIGHT_SHOOTER_MOTOR_ID = 8; // TODO


        public static final int LEFT_TRANS_MOTOR_ID = 15; // TODO
        public static final int RIGHT_TRANS_MOTOR_ID = 16; // TODO
        public static final int LOAD_ID = 17; // TODO
    }

    public static final class OIConstants {
        public static final int XBOX_DRIVER_ID = 0;
        //public static final int XBOX_OPERATOR_ID = 1;
        public static final double LEFT_AXIS_DEADBAND = 0.1;
        public static final double RIGHT_AXIS_DEADBAND = 0.6;
        public static final boolean SKEW_STICKS = true;
      }


    

}
