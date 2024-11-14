package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
    // Declare motor controllers
    VictorSP leftMotor;
    VictorSP rightMotor;

    // Constructor
    public Drivetrain() {
        // parameter channel is the port on your RoboRIO the motor controller is plugged into
        leftMotor = new VictorSP(0);
        rightMotor = new VictorSP(1);
        // one motor has to spin in reverse for the robot to go straight
        leftMotor.setInverted(true);
    }

    // Challenge: make a drive() method that takes two doubles as parameters and sets them as the speeds of the motors.
    // to set the speed of a motor, you can use the .set() function, which takes a double as a parameter.
    // an example would be leftMotor.set(1); which sets the left motor the maximum forward speed.
    public void drive(double leftSpeed, double rightSpeed) {
        leftMotor.set(leftSpeed);
        rightMotor.set(rightSpeed);
    }

    // for the stop() method, use the stopMotor() function on both motors
    public void stop() {
        leftMotor.stopMotor();
        rightMotor.stopMotor();
    }
}
