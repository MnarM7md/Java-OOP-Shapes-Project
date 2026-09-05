
package com.mycompany.projectoop;

// Abstract class for all 3D shapes

public abstract class ThreeDShape extends Shape {

     public ThreeDShape() {
    }
     
    public ThreeDShape(String color) {
        super(color);
    }
    
    public abstract double getVolume();
    
}