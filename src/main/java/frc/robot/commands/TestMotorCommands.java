package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.NeoTest;
import frc.robot.Constants;
import frc.robot.Constants.TestController;


public class TestMotorCommands extends CommandBase{
    private final XboxController TestController = new XboxController(0);

    NeoTest neoTest; 



    public void initialize() {
        SmartDashboard.putNumber("TestMotor Speed", 0);
    }


    public void execute(){
        if  (TestController.getRawAxis(Constants.TestController.TestControllerRightTrigger) > .1){
            neoTest.RunTestMotor(TestController.getRawAxis(Constants.TestController.TestControllerRightTrigger));
        }





        if (TestController.getX()>.5){
            neoTest.RunTestMotor(.5);
        }

        if(TestController.getY()>.5){
            neoTest.RunTestMotor(.75);

        }
        if(TestController.getAButton()){
            neoTest.RunTestMotor(1);
        }
    }



    


    
    


}
