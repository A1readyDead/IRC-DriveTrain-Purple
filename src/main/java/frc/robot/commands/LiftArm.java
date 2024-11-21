package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Arm;

public class LiftArm extends Command {
    // declare an arm object and a double varialbe. These are the members.
    Arm arm;
    double speed;

    // write a construtor that takes 1 Arm and 1 double as parameters
    // set the members equal to the parameters
    // call addRequirements() with the Arm object sa the parameter
    public LiftArm(Arm arm, double speed) {
        this.arm = arm;
        this.speed = speed;
        addRequirements(arm);
    }

    // for execute, use the liftArm function to set the arm speed to the double
    // remember to use member funcitons you need to use the . operator
    // ex.object.function where object is the name of the object
    @Override
    public void execute() {
        arm.liftArm(speed);
    }

    // call the arm stop() method
    // the boolean is unneccesary
    @Override
    public void end(boolean i) {
        arm.stop();
    }
}
