package com.codewithmosh;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }



    //    @Override
//    public boolean equals(Object obj) {
//        // downcasting the object to the point class
//        // using conditionals to make sure that the obj passed is an instance of the Point class
//
//        if(this == obj) // checking if the current object and the obj parameter have the same reference
//            return true;
//
//        if (!(obj instanceof Point)) // if the object is not an instance of the point class return false.
//            return false;
//
//
//        var other = (Point)obj;
//        return other.x == x && other.y == y;
//    }
//    // when overriding the equal method you should also override the hasCode
//
//
//    @Override
//    public int hashCode() {
//        // want to generate hasCode based on the content of the obj based on the values of the x and y fields
//        return Objects.hash(x,y);
//    }

    // in order for intelliJ to do it for us hit command n then click on equals() and hashCode()
//
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
