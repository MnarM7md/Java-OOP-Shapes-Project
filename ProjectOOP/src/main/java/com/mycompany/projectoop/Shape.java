
package com.mycompany.projectoop;


import java.util.Date;

public abstract class Shape implements Drawable {
    
    protected static final double SCALE = 3.0; //عشان اتحكم في الشكل SCALE
     
     
    protected Date dateCreated;
    protected String color;

    public Shape(){
    }
    public Shape(String color) {
        
        this.color = color;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract double  getArea();
     public abstract double  getPeremiter();
   

}
