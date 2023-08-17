package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class BrainSTEMRobot {

    // Initializing the drivetrain
    public DcMotorEx frontLeft;
    public DcMotorEx backLeft;
    public DcMotorEx frontRight;
    public DcMotorEx backRight;

    // Example Motors and Servos

    public Servo BrainSTEMServo;


    // Don't touch these
    public Telemetry telemetry;
    public OpMode opMode;

    public BrainSTEMRobot(HardwareMap hwMap, Telemetry telemetry, OpMode opMode) {

        this.telemetry = telemetry;
        this.opMode = opMode;


        // Defining the Motors and servos
        frontLeft =  (DcMotorEx)hwMap.dcMotor.get("FL");
        frontRight = (DcMotorEx)hwMap.dcMotor.get("FR");
        backLeft =   (DcMotorEx)hwMap.dcMotor.get("BL");
        backRight =  (DcMotorEx)hwMap.dcMotor.get("BR");

        BrainSTEMServo = hwMap.servo.get("servo");


        // reverse these if needed
        frontLeft.setDirection(DcMotor.Direction.FORWARD);
        frontRight.setDirection(DcMotor.Direction.FORWARD);
        backLeft.setDirection(DcMotor.Direction.FORWARD);
        backRight.setDirection(DcMotor.Direction.FORWARD);


        // sets what the motor does when you don't tell it to do anything
        frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

    }


    





}
