package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Arm;
import frc.robot.subsystems.Drivetrain;

public class BasicAuto extends SequentialCommandGroup{
    public BasicAuto(Drivetrain drivetrain, Arm arm){
        addCommands(
            new DriveAuto(drivetrain, 0.25, 0.25 ).withTimeout(1.5)
    
                new LiftArm(arm, 0).withTimeout(0),
                //Arm Speed lift and stuff idk
                new DriveAuto(drivetrain, 1, 1).withTimeout(0),
                //Tune this into go foward
                new DriveAuto(drivetrain, -1, -1).withTimeout(0),
                //Tune this to go back
                new DriveAuto(drivetrain, -1, 1).withTimeout(0),
                //Tune to turn right
                new DriveAuto(drivetrain, 1, -1).withTimeout(0)
                //Tune to turn left

        );
    }
}
