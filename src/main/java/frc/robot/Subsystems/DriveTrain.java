package frc.robot.Subsystems;

import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
    public DriveTrain(CANSparkMax FrontRightMtr, CANSparkMax FrontLeftMtr, CANSparkMax BackRightMtr,
        CANSparkMax BackLeftMtr) {
        MotorControllerGroup LeftGroup = new MotorControllerGroup(FrontLeftMtr, BackLeftMtr);
        MotorControllerGroup RightGroup = new MotorControllerGroup(FrontRightMtr, BackRightMtr);
        DifferentialDrive Differential1 = new DifferentialDrive​()
    }

    public TankDrive () {

    }
}
