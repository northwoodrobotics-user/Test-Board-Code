package frc.robot;


import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.Joystick;
//import frc.robot.commands.TestMotorCommands;
//import frc.robot.subsystems.NeoTest;
import frc.robot.Constants;
import frc.robot.Constants.TestController;


public class RobotContainer {
    private static RobotContainer m_instance = null;
    
    private final XboxController TestController = new XboxController(Constants.TestController.TestcontrollerPort);

    //private final JoystickButton TestControllerBumper = new JoystickButton(TestController, XboxController.Button.kBumperLeft.value);


    //private final NeoTest neoTest = new NeoTest();

    //private final TestMotorCommands testMotorCommands = new TestMotorCommands(neoTest, TestController);


    public RobotContainer(){
        //neoTest.setDefaultCommand(new TestMotorCommands(neoTest, TestController));
        


    }  
    public static RobotContainer getInstance(){
        if (m_instance == null){
          m_instance = new RobotContainer(); 
        }
        return m_instance;
      }






}
