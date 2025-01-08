package com.example.project;

public class Point {
    private int x;
    private int y;
    
    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }

    public int getX(){
    return x;
    }

    public int getY(){
      return y;
    }
    
    // Returns distance between this Point object and another Point object
    public double distanceTo(Point other) {
     int disX = x - other.x;
     int disY = y - other.y;
     return Math.sqrt(disX * disX + disY * disY);
    }
  
    // Returns a string in the format: (x, y)
    public String pointInfo() {
      return "("+x+", "+y+")";
    }
  }
  