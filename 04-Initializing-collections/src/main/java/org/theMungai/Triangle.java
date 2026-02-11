package org.theMungai;

import java.util.List;

public class Triangle {

    private List<Point> points;

    public void setPoints(List<Point> points){
        this.points = points;
    }

    public List<Point> getPoints(){
        return this.points;
    }


    public void draw(){
        for (Point point: points){
            System.out.println("Point = (" + point.getX() + ", " + point.getY() + ")");
        }
    }
}
