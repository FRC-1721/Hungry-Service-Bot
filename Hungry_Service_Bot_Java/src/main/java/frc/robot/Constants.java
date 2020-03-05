/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.NeutralMode;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other
 * purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity.
 */
public final class Constants {

    public static final class CANIds{
        // TalonSRX
        public static final int TalonSRX_Port_Address = 0;              // Configured 1/25/2020
        public static final int TalonSRX_Starboard_Address = 1;         // Configured 1/25/2020
    }
    
    public static final class RobotOperatingSystem{
        public static double rosUpdateFrequency = 0.02;

        public static final class Names{
            public static String rosTablename = "ROS";
            public static String starboardEncoderName = "Starboard";
            public static String portEncoderName = "Port";
            public static String rosIndexName = "rosIndex";
            public static String turretEncoderName = "Turret";
            public static String robotModeEntryName = "RobotMode";

            public static String ROSShooterTable = "enable_shooter";
            public static String DrivetrainTable = "ros_drivetrain";
            public static String ResetEncoders = "reset_encoders";
            public static String ShiftUp = "shift_up";
            public static String ShiftDown = "shift_down";
            public static String ZeroTurret = "zero_turret";
            public static String gameMessageEntryName = "game_message";
            public static String driverStationEntryName = "starting_station";
            public static String eventNameAndMatch = "event_name_and_match";
        }
    }

    public static final class DrivetrainPID{

        public static int kPIDLoopIdx = 0; // The loop Index
        public static int kTimeoutMs = 30; // The timeout to wait when writing variables to the motors
        public static boolean portSensorPhase = true; // The phase of the sensor
        public static boolean portMotorInvert = true; // The inversion of the motor
        public static NeutralMode drivetrainBrakeMode = NeutralMode.Coast; // The brake mode of the motor
        public static boolean starboardSensorPhase = false;
        public static boolean starboardMotorInvert = false;
        public static final Gains kGains = new Gains(0.15,  // kP TODO
                                                     0.0,   // kI
                                                     1.0,   // kD
                                                     0.0,   // kF
                                                     0,     // kIzone
                                                     1.0);  // kPeakoutput
        // Measurements and other
        public static int ticksPerMeter = 10000;        // Calibrated 12/16/2019
    }
}