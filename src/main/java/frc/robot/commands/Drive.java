package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drivetrain;

public class Drive extends Command {
    // Challenge: declare 3 members, 1 is a Drivetrain object (the one we just made) the ohter two are just Joystick objects
    private Drivetrain drivetrain;
    private Joystick leftStick, rightStick;

    // Challenge: create a constructor, which takes 3 parameters, a drivetrain, a left joystick, and a right joystick
    // set the members to the parameters
    // example:
    // public class example {
    //  int myInteger;
    //  public ExampleConstructor(int myInteger) {
    //      this.myInteger = myInteger;
    //  }
    // }
    // the addRequirements(Subsystem) function must also be used, with the subsystems used by the command
    // joysticks are not subsystems and do not need to be included in addRequirements
    public Drive(Drivetrain drivetrain, Joystick leftStick, Joystick rightStick) {
        this.drivetrain = drivetrain;
        this.leftStick = leftStick;
        this.rightStick = rightStick;
        addRequirements(drivetrain);
    }
    //public void initialize()
    // Challenge: execute is a function inherited from the Command class
    // it is called periodically while the command is runing
    // in execute, all the drivetrain subsystem's drive function
    // for the double parameters, use the getY() function form the joysticks
    // an example would be double input = leftStick.getY();
    @Override
    public void execute() {
        double leftInput = leftStick.getY();
        double rightInput = rightStick.getY();
        drivetrain.drive(leftInput, rightInput);
    }
    //public boolean isFinished()
    // for the end function(called when the command ends) use the drivetrain stop function.
    // for this application, the boolean value interrupt is not important and can be ignored.
    @Override
    public void end(boolean interrupted) {
        drivetrain.stop();
    }
}
