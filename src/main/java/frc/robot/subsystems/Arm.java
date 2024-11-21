package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Arm extends SubsystemBase{
    // the Arm class is a lot like the Drivetrain clas
    // it only needs 1 motor instead of 2
    // the channel of the motor will be different
    // Challenge: write the Arm class
    // you can open the Drivetrain class to use for reference
    VictorSP armMotor;

    // Construction
    public Arm() {
        armMotor = new VictorSP(2);
    }

    // Methods
    public void liftArm(double armSpeed) {
        armMotor.set(armSpeed);
    }
    public void stop() {
        armMotor.stopMotor();
    }
}
