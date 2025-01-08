package com.example.project;

public class Triangle {
    // array of Point objects
    private Point[] vertices = new Point[3];
    
    // Constructor: initializes the vertices array
    // to contain the three Point objects
    
    public Triangle(Point p1, Point p2, Point p3) {
       vertices[0] = p1;
       vertices[1] = p2;
       vertices[2] = p3;
    }

    public Point[] getVertices(){
      return vertices;
    }
    
    // Returns the perimeter of the Triangle
    // HINT: use the distanceTo method that you wrote in the Point class
    public double perimeter() {
      double firstDist = vertices[1].distanceTo(vertices[0]);
      double secondDist = vertices[1].distanceTo(vertices[2]);
      double thirdDist = vertices[2].distanceTo(vertices[0]);
      return firstDist + secondDist + thirdDist;
    }
  
    // Returns a String with the three vertices that make up the Triangle;
    // if the vertices are the points (6, 10), (11, 15), and (18, 7),
    // this method should return: "[(6, 10), (11, 15), (18, 7)]"
    public String triangleInfo() {
      String firstPoint = vertices[0].pointInfo();
      String secondPoint = vertices[1].pointInfo();
      String thirdPoint = vertices[2].pointInfo();
      return "[" + firstPoint + ", " + secondPoint + ", " + thirdPoint + "]";
    }
  }
  