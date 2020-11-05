package org.firstinspires.ftc.teamcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LineSegTest {

    @Test
    public void subdivide() {

        // first set of tests

        Point[] subdExpect = new Point[2];
        subdExpect[0] = new Point(1, 1);
        subdExpect[1] = new Point(2, 2);

        LineSeg subdTest = new LineSeg(new Point(0, 0), new Point(3, 3));
        Point[] subdActual = subdTest.subdivide(3);

        // i takes on values 0, then 1 (total of 2 values)
        // tests a total of 2 points here
        for (int i = 0; i < subdActual.length; i++) {
            // tests point versus point
            assertEquals(subdExpect[i], subdActual[i]);
        }


        // second set of tests

        subdTest = new LineSeg(new Point(-4, 1), new Point(8, 7));
        subdActual = subdTest.subdivide(3);

        subdExpect[0] = new Point(0, 3);
        subdExpect[1] = new Point(4, 5);

        for (int i = 0; i < subdActual.length; i++) {
            assertEquals(subdExpect[i], subdActual[i]);
        }

    }

}