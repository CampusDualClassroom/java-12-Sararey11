package com.campusdual.classroom;

public class Car {

    int tachometer = 0;
    int speedometer = 0;
    final int MAX_SPEED = 200;
    int wheelsAngle = 0;
    String gear = "N";

    public Car() {
    }

    public Car(String toyota, String corolla, String gasoline) {

    }


    void start() {
        tachometer = 1000;
    }
    void stop() {
        if (speedometer == 0) tachometer = 0;
    }

    void accelerate() {
        if (speedometer < MAX_SPEED) {
            speedometer += 10;
        }
    }

    void brake() {
        if (speedometer > 0) {
            speedometer -= 10;
        }

    }

    void setReverse(Boolean reverse) {
        if (reverse && speedometer == 0) {
            gear = "R";
        }
        else {
            gear = "N";
        }
    }

    void turnAngleOfWheels(int angle) {
        if (angle + wheelsAngle > 45) {
            wheelsAngle = 45;
        }
        else if (angle + wheelsAngle < -45) {
            wheelsAngle = -45;
        }
        else
            wheelsAngle = angle;
    }
    boolean isTachometerGreaterThanZero() {
        return tachometer > 0;
    }
    boolean isTachometerEqualToZero() {
        return tachometer == 0;
    }
}
