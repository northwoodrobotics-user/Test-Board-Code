package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.NeoTest;
import frc.robot.Constants;

import edu.wpi.first.wpilibj.GenericHID;
import frc.robot.Constants.TestController;
import frc.robot.RobotContainer;


public class TestMotorCommands extends CommandBase{


    

public TestMotorCommands(){
        addRequirements(RobotContainer.neoTest);
    
    
}


    @Override
    public void initialize() {
        SmartDashboard.putNumber("TestMotor Speed", 0);
    }

    @Override
    public void execute(){
        if  (RobotContainer.TestController.getRawAxis(Constants.TestController.TestControllerRightTrigger) > .1){
            double CommandedIntakeSpeed = RobotContainer.TestController.getRawAxis(Constants.TestController.TestControllerRightTrigger);
            RobotContainer.neoTest.RunTestMotor(CommandedIntakeSpeed);
        }else if (RobotContainer.TestController.getXButton()){
            RobotContainer.neoTest.RunTestMotor(.5);
        }else if(RobotContainer.TestController.getXButton()){
            RobotContainer.neoTest.RunTestMotor(.75);

        }else if(RobotContainer.TestController.getAButton()){
            RobotContainer.neoTest.RunTestMotor(1);
        }
        else if(RobotContainer.TestController.getRawAxis(3) > .2) {
            double TestSpeed = RobotContainer.TestController.getRawAxis(3);
            RobotContainer.neoTest.RunTestMotor(TestSpeed);
        } else {
            RobotContainer.neoTest.RunTestMotor(0);
        }
        
       
    }
    @Override
    public void end(boolean interrupted){
        RobotContainer.neoTest.RunTestMotor(0);
    }
    @Override
    public boolean isFinished(){
        return false;
    }



    


    
    


}
