
package com.mycompany.projectoop;

import java.awt.Graphics;


public class Circle extends Shape {
    
    private double radius;
    
     public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }
     public Circle(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }

    public double getRadius() {
        return radius;00
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

   

    
    @Override
    public double getArea() {
        
        return Math.PI * radius * radius;
    }

    @Override
    public double getPeremiter() {
        
        return 2 * Math.PI * radius ;
    }

    @Override
    public String howToDraw() {
        
        return "Circle";
    }
    
    
    
     public void draw(Graphics g, int x, int y) {
         
         int r = (int) (radius * SCALE);

         g.drawOval(x, y, r , r );
         // Draw text
         g.drawString("Circle of radius = " + radius, x, y + r  + 15);
      
    }
}
