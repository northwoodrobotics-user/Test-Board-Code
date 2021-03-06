package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.ControlType;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.CANEncoder;
import com.revrobotics.CANPIDController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import frc.robot.Constants;

public class NeoTest extends SubsystemBase{
    private static NeoTest m_instance;

    double CommandedPercent;

    //Initlailize motors, Encoders, PID loops 
    private CANSparkMax m_testmotor;
    private CANEncoder m_testmotorencoder; 
    private CANPIDController m_testPIDcontroller; 


    public NeoTest() {
        m_testmotor = new CANSparkMax(Constants.kNeoTestID, MotorType.kBrushless);

        m_testmotor.restoreFactoryDefaults();
        m_testPIDcontroller = m_testmotor.getPIDController();
        m_testmotorencoder = m_testmotor.getEncoder();




        m_testPIDcontroller.setP(Constants.kNeoTestP);
        m_testPIDcontroller.setI(Constants.kNeoTestI);
        m_testPIDcontroller.setD(Constants.kNEoTestD);
        m_testPIDcontroller.setIZone(Constants.kNeoTestIz);
        m_testPIDcontroller.setFF(Constants.kNeoTestFF);
        
    }


    public static NeoTest getInstance(){
        if(m_instance == null){
            m_instance = new NeoTest();
        }
        return m_instance;
    }
    public void initialize(){
        m_testPIDcontroller.setOutputRange(Constants.kNeoTestMinOut, Constants.kNeoTestMaxOut);
        double CommandedSpeed = CommandedPercent*Constants.kNeoTestMaxRPM;
        double RealPercentOutput = m_testmotorencoder.getVelocity()/Constants.kNeoTestMaxRPM;
        SmartDashboard.putNumber("Percent Commanded", CommandedPercent);
        SmartDashboard.putNumber("Real RPM",m_testmotorencoder.getVelocity() );
        SmartDashboard.putNumber("Commanded RPM", CommandedSpeed);
        SmartDashboard.putNumber("Real Motor Percent Output", RealPercentOutput);
       
        


    }

    public void RunTestMotor(double RunCommand){
        RunCommand =CommandedPercent;
        double PIDSpeed = RunCommand*Constants.kNeoTestMaxRPM;
        
        
        
        m_testPIDcontroller.setReference(PIDSpeed, ControlType.kVelocity);
    }
    




    


    //Identify PID controller as controlling NEO Motor
    //m_TestPIDController = TestMotor.getPIDController();
    //m_TestPIDController = TestMotor.getPIDController();

















}
