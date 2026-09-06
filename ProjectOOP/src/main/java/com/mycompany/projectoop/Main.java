
package com.mycompany.projectoop;


import java.awt.Graphics; 
import java.io.File; 
import java.io.PrintWriter; 
import java.util.Scanner; 
import javax.swing.JFrame;
import javax.swing.JPanel; 

public class Main { 

    public static void main(String[] args) { 
       File f; 
       Scanner k; 
       PrintWriter pw; 

        try {
            f = new File("input.txt"); 
            k = new Scanner(f); 

            int n = Integer.parseInt(k.next()); 
            Drawable[] ar = new Drawable[n]; 

            double sum = 0; 
            String type;
            double len; 

            for (int i = 0; i < ar.length; i++) {
                type = k.next(); 
                len = Double.parseDouble(k.next()); 

                switch (type) { 
                    case "Circle":
                    case "circle":
                        ar[i] = new Circle(len);
                        break;

                    case "Cube":
                    case "cube":
                        ar[i] = new Cube(len); 
                        break;
                }

                sum += ar[i].getArea(); 
            }

            drawGUI(ar); 

            pw = new PrintWriter("output.txt");
            pw.println("Sum of Areas = " + sum); 
            pw.close(); 

            System.out.println("Done️"); 

        } 
        catch (Exception e) {
            e.printStackTrace(); 
        }
    }
    
    //======================= GUI =======================//
    
   
    public static void drawGUI(Drawable[] arr) { 
        JFrame frame = new JFrame("Shapes Drawer"); 
        frame.setSize(600, 400); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        JPanel panel = new JPanel() { 
            protected void paintComponent(Graphics g) { 
                super.paintComponent(g); 

                int x = 140; 
                int y = 100; 

                for (Drawable d : arr) { 
                    if (d instanceof Circle) {  
                        ((Circle) d).draw(g, x, y); 
                    } 
                    else if (d instanceof Cube) {
                        ((Cube) d).draw(g, x, y); 
                    }
                    x += 200; 
                }
            }
        };

        frame.add(panel); 
        frame.setVisible(true); 
    }
}
