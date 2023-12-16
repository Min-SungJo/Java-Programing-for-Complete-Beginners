package org.example.practise;

public class TriangleValidator {
    public boolean isValidTriangle(int angle1, int angle2, int angle3) {
        if(angle1 <= 0 || angle2 <= 0 || angle3 <= 0) return false;
        int sumOfAngles = angle1 + angle2 + angle3;
        return sumOfAngles == 180;
    }
    public boolean isRightAngled(int side1, int side2, int side3) {
        if(side1 <= 0 || side2 <= 0 || side3 <= 0) return false;
        int num1 = side1*side1;
        int num2 = side2*side2;
        int num3 = side3*side3;
        return num1 == num2 + num3 || num2 == num1 + num3 || num3 == num1 + num2;
    }
}
