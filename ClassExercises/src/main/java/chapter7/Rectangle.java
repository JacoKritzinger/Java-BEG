/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7;

/**
 *
 * @author Jaco
 */
public class Rectangle extends TwoDShape {   
  // A default constructor.  
  Rectangle() {  
    super();  
  }  
  
  // Constructor for Rectangle.  
  Rectangle(double w, double h) {  
    super(w, h, "rectangle"); // call superclass constructor  
  }  
  
  // Construct a square.  
  Rectangle(double x) {  
    super(x, "rectangle"); // call superclass constructor  
  }  
  
  // Construct an object from an object.  
  Rectangle(Rectangle ob) {  
    super(ob); // pass object to TwoDShape constructor  
  }  
  
  boolean isSquare() {   
    if(getWidth() == getHeight()) return true;   
    return false;   
  }   
     
  // Override area() for Rectangle. 
  double area() {   
    return getWidth() * getHeight();   
  }   
}  
  
class DynShapes {  
  public static void main(String args[]) {  
    TwoDShape shapes[] = new TwoDShape[5];  
  
    shapes[0] = new Triangle("outlined", 8.0, 12.0);  
    shapes[1] = new Rectangle(10);  
    shapes[2] = new Rectangle(10, 4);  
    shapes[3] = new Triangle(7.0);  
    shapes[4] = new TwoDShape(10, 20, "generic"); 
  
    for(int i=0; i < shapes.length; i++) {  
      System.out.println("object is " + shapes[i].getName());  
      System.out.println("Area is " + shapes[i].area());  
  
      System.out.println();    
    }  
  }  
} 
