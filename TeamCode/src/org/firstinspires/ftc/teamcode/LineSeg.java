package org.firstinspires.ftc.teamcode;

public class LineSeg {

    private Point P;
    private Point Q;

    public LineSeg(Point P, Point Q) {
        this.P = P;
        this.Q = Q;
    }

    public double getLength() {return P.distFrom(Q);}

    // returns array of points,
    // containing the non-endpoint points
    // in the (strict) interior of the segment
    public Point[] subdivide(int numSegs) {

        // array to return
        Point[] fencePosts = new Point[numSegs - 1];
        // increments
        double dDeltaX = (Q.getX() - P.getX()) / numSegs;
        double dDeltaY = (Q.getY() - P.getY()) / numSegs;
        // placeholder coordinates, for making new points
        double dXTemp = P.getX();
        double dYTemp = P.getY();

        for (int i = 0; i < numSegs - 1; i++) {
            dXTemp += dDeltaX;
            dYTemp += dDeltaY;
            fencePosts[i] = new Point(dXTemp, dYTemp);
        }

        return fencePosts;

    }

}
