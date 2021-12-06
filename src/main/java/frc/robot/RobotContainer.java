package frc.robot;


import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.TestMotorCommands;
import frc.robot.subsystems.NeoTest;

public class RobotContainer {
    private static RobotContainer m_instance = null;
    
    private final XboxController TestController = new XboxController(0);

    private final JoystickButton TestControllerBumper = new JoystickButton(TestController, XboxController.Button.kBumperLeft.value);


    private final NeoTest neoTest = new NeoTest();

    private final TestMotorCommands testMotorCommands = new TestMotorCommands();


    public RobotContainer(){
        neoTest.setDefaultCommand(testMotorCommands);
    }






}
