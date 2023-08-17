package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;


@com.qualcomm.robotcore.eventloop.opmode.TeleOp(name = "TeleOp")
public class BrainSTEMTele extends LinearOpMode {

    private ElapsedTime runtime = new ElapsedTime();




    @Override
    public void runOpMode() throws InterruptedException {

        BrainSTEMRobot brainSTEMrobot = new BrainSTEMRobot(this.hardwareMap, this.telemetry, this);


        waitForStart();


        while (!opModeIsActive()) {

            telemetry.addData("Opmode Status :", "Init");

            telemetry.update();
        }



        while (opModeIsActive()) {


            double y = -gamepad1.left_stick_y;
            double x = gamepad1.left_stick_x;
            double rx = gamepad1.right_stick_x;

            brainSTEMrobot.frontLeft.setPower(y + x + rx);
            brainSTEMrobot.backLeft.setPower(y - x + rx);
            brainSTEMrobot.frontRight.setPower(y - x - rx);
            brainSTEMrobot.backRight.setPower(y + x - rx);


            if (gamepad1.right_bumper){
                brainSTEMrobot.BrainSTEMServo.setPosition(0.99);
            }

            if (gamepad1.left_bumper){
                brainSTEMrobot.BrainSTEMServo.setPosition(0.01);
            }


            telemetry.addLine("Tele Running");
            telemetry.update();
        }
    }
}
