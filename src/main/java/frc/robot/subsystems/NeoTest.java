package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.ControlType;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.CANEncoder;
import com.revrobotics.CANPIDController;

import frc.robot.Constants;

public class NeoTest extends SubsystemBase{
    private static NeoTest m_instance;

    //Initlailize motors, Encoders, PID loops 
    private CANSparkMax m_testmotor = new CANSparkMax(Constants.kNeoTestID, MotorType.kBrushless);
    private CANEncoder m_testmotorencoder; 
    private CANPIDController m_testPIDcontroller; 

    public NeoTest() {
        super();
        m_testmotor.restoreFactoryDefaults();
        m_testPIDcontroller = m_testmotor.getPIDController();
        m_testmotorencoder = m_testmotor.getEncoder();




        m_testPIDcontroller.setP(Constants.kNeoTestP);
        m_testPIDcontroller.setI(Constants.kNeoTestI);
        m_testPIDcontroller.setD(Constants.kNEoTestD);
        m_testPIDcontroller.setIZone(Constants.kNeoTestIz);
        m_testPIDcontroller.setFF(Constants.kNeoTestFF);
        m_testPIDcontroller.setOutputRange(Constants.kNeoTestMinOut, Constants.kNeoTestMaxOut);





    }

    public void RunTestMotor(double RunCommand){
        m_testPIDcontroller.setReference(RunCommand, ControlType.kVelocity);
    }




    


    //Identify PID controller as controlling NEO Motor
    //m_TestPIDController = TestMotor.getPIDController();
    //m_TestPIDController = TestMotor.getPIDController();

















}
