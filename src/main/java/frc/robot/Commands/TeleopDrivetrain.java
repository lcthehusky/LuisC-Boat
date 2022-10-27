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
        // These are our joystick inputs
        drivetrain.tankdrive(xboxcntrl.getLeftY(), xboxcntrl.getRightY());
    }
}
