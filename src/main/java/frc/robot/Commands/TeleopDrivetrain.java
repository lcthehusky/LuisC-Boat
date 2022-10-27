package frc.robot.Commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Subsystems.DriveTrain;

public class TeleopDrivetrain extends CommandBase {
    DriveTrain drivetrain;
    XboxController xboxcntrl;

    public TeleopDrivetrain(DriveTrain drivetrain, XboxController xboxcntrl) {
        this.drivetrain = drivetrain;
        this.xboxcntrl = xboxcntrl;
    }

    @Override
    public void execute() {
        drivetrain.tankdrive(left, right);
    }
}
