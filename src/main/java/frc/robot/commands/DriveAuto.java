package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drivetrain;

public class DriveAuto extends Command{
    Drivetrain drivetrain;
    double leftSpeed;
    double rightSpeed;
    public DriveAuto(Drivetrain traindrive, double speedleft, double speedright){
        drivetrain = traindrive; 
        leftSpeed = speedleft ;
        rightSpeed = speedright;
        addRequirements(drivetrain);

    }
    @Override
    public void execute(){
        drivetrain.drive(leftSpeed, rightSpeed);
    }
    @Override
    public void end(boolean Auto){
        drivetrain.stop();
    }

}