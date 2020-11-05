package org.firstinspires.ftc.teamcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distFromOrigin() {
        assertEquals(5, new Point(3, 4).distFromOrigin(), 0.00001);
        assertEquals(13, new Point(5, -12).distFromOrigin(), 0.00001);
        assertEquals(25, new Point(-7, 24).distFromOrigin(), 0.00001);
        assertEquals(Math.sqrt(2), new Point(-1, -1).distFromOrigin(), 0.00001);
    }

    @Test
    public void getQuadrant() {
        assertEquals("I", new Point(3, 4).getQuadrant());
        assertEquals("II", new Point(-4.5, 6).getQuadrant());
        assertEquals("III", new Point(-1, -1).getQuadrant());
        assertEquals("IV", new Point(19, -3.2215).getQuadrant());
        assertEquals("ON AXIS", new Point(0, -7).getQuadrant());
        assertEquals("ON AXIS", new Point(12, 0).getQuadrant());
        assertEquals("ON AXIS", new Point(0, 0).getQuadrant());
    }
}