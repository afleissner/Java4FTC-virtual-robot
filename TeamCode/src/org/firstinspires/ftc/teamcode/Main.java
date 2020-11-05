package org.firstinspires.ftc.teamcode;

public class Main {

    public static void main(String[] args) {

        Point a = new Point(1, 2);

        System.out.println("Point a: " + a);
        System.out.println("x: " + a.getX());
        System.out.println("y: " + a.getY());
        System.out.println("Distance from origin: " + a.distFromOrigin());
        System.out.println("Quadrant: " + a.getQuadrant());

        Point P1 = new Point(-4, 1);
        Point P2 = new Point(8, 7);
        LineSeg l = new LineSeg(P1, P2);

        Point[] subdivideList = l.subdivide(3);
        for (int i = 0; i < subdivideList.length; i++) {
            System.out.println("waypoint: " + subdivideList[i]);
        }

    }

}
