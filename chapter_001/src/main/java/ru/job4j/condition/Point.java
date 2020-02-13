package ru.job4j.condition;

import static java.lang.Math.*;

public class Point {
    /**
     * field X point
     */
    private int x;
    /**
     * field Y point
     */
    private int y;
    /**
     * field Z point
     */
    private int z;

    /**
     * Constructor for two coordinates
     * @param x - X
     * @param y - Y
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructor for three coordinates
     * @param x -X
     * @param y -Y
     * @param z -Z
     */
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     *
     * @param that - point 2D
     * @return distance between two points
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    /**
     *
     * @param that - point 3D
     * @return distance between three points
     */
    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }
    public void info3d() {
        System.out.println(String.format("Point[%s, %s, %s]", this.x, this.y, this.z));
    }
}
