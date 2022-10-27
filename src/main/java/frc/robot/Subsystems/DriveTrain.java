package frc.robot.Subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {

    CANSparkMax FrontRightMtr =
        new CANSparkMax(Constants.Motors.FrontRightMtrID, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax FrontLeftMtr =
        new CANSparkMax(Constants.Motors.FrontLeftMtrID, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax BackRightMtr =
        new CANSparkMax(Constants.Motors.BackRightMtrID, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax BackLeftMtr =
        new CANSparkMax(Constants.Motors.BackLeftMtrID, CANSparkMaxLowLevel.MotorType.kBrushless);

    public DriveTrain() {
        MotorControllerGroup LeftGroup = new MotorControllerGroup(FrontLeftMtr, BackLeftMtr);
        MotorControllerGroup RightGroup = new MotorControllerGroup(FrontRightMtr, BackRightMtr);
        DifferentialDrive Differential1 = new DifferentialDrive(LeftGroup, RightGroup);
    }

    public void TankDrive(dobule left, double right) {
        Differential1.TankDrive(left, right);
    }
}
