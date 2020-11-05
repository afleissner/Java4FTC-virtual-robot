package org.firstinspires.ftc.teamcode;

import java.util.Objects;

public class Point {

    private double dX;
    private double dY;

    // constructor method
    public Point(double dX, double dY) {
        this.dX = dX;
        this.dY = dY;
    }

    // getter methods
    public double getX() {return dX;}
    public double getY() {return dY;}

    // overriding toString()
    public String toString() {
        return "(" + dX + ", " + dY + ")";
    }

    public double distFrom(Point P) {

        double dXDist = dX - P.getX();
        double dYDist = dY - P.getY();
        double dDist = Math.sqrt(dXDist*dXDist + dYDist*dYDist);

        return dDist;
    }

    public double distFromOrigin() {
        return Math.sqrt(dX*dX + dY*dY);
        // alternative, dependent on preceding method:
        // return distFrom(new Point(0, 0));
    }

    public String getQuadrant() {
        if (dX == 0 || dY == 0) {return "ON AXIS";}
        else if (dY > 0) {
            if (dX > 0) {return "I";}
            else {return "II";}
        }
        else {
            if (dX < 0) {return "III";}
            else {return "IV";}
        }
    }

    public Point midpointWith(Point P) {

        double dXMid = (dX + P.getX()) / 2;
        double dYMid = (dY + P.getY()) / 2;

        return new Point(dXMid, dYMid);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.dX, dX) == 0 &&
                Double.compare(point.dY, dY) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dX, dY);
    }
}
