package frc.robot;


import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.commands.TestMotorCommands;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.NeoTest;
import frc.robot.Constants;
import frc.robot.Constants.TestController;


public class RobotContainer {
  public static  NeoTest neoTest;
  public static XboxController TestController = new XboxController(Constants.TestController.TestcontrollerPort);
    private static RobotContainer m_instance = null;

   
    public static JoystickButton TestControllerBumper = new JoystickButton(TestController, XboxController.Button.kBumperLeft.value);

  

    //public static TestMotorCommands testMotorCommands;


    public static void init(){
      neoTest = new NeoTest();
      //testMotorCommands = new TestMotorCommands(neoTest, TestController);
      
      ;

      neoTest.setDefaultCommand(new TestMotorCommands());
    }





    public static RobotContainer getInstance(){
        if (m_instance == null){
          m_instance = new RobotContainer(); 
        }
        return m_instance;
      }






}
