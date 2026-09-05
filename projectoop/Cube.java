
package com.mycompany.projectoop;

import java.awt.Graphics;

public class Cube extends ThreeDShape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }
     public Cube(String color,double side) {
        super(color);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Cube{" + "side=" + side + '}';
    }
     
     
    @Override
    public double getVolume() {
        return side * side * side;
    }

    @Override
    public double getArea() {
       return  side * side;
    }

    @Override
    public double getPeremiter() {
       return  side * 4;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String howToDraw() {
        return "Cube";
    }

    public void draw(Graphics g, int x, int y) {//ميثود رسم المكعب
        int s = (int) (side* SCALE);
        
        int offset = (int)(10* SCALE);//* SCALE عشان يدي شكل مكعب مش مربع

        
        g.drawRect(x, y, s, s);// 1

        g.drawRect(x + offset, y - offset, s, s);// 2

       
        g.drawLine(x, y, x + offset, y - offset);
        g.drawLine(x + s, y, x + s + offset, y - offset);
        g.drawLine(x, y + s, x + offset, y + s - offset);
        g.drawLine(x + s, y + s, x + s + offset, y + s - offset);

        // Draw text
        g.drawString("Cube of side = " + side, x, y + s + 20);
    }
}
