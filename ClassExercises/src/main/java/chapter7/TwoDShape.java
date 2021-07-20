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
public class TwoDShape {
//  double width; 
//  double height; 
// 
//  void showDim() { 
//    System.out.println("Width and height are " + 
//                       width + " and " + height); 
//  } 
//} 
//7_3
//  private double width;  // these are 
//  private double height; // now private  
// 
//  void showDim() { 
//    System.out.println("Width and height are " + 
//                       width + " and " + height); 
//  } 
//} 
//  private double width;  // these are 
//  private double height; // now private  
// 
//  // Accessor methods for width and height. 
//  double getWidth() { return width; } 
//  double getHeight() { return height; } 
//  void setWidth(double w) { width = w; } 
//  void setHeight(double h) { height = h; } 
// 
//  void showDim() { 
//    System.out.println("Width and height are " + 
//                       width + " and " + height); 
//  } 
//}

//7_5
//  private double width;  // these are 
//  private double height; // now private  
// 
//  // Accessor methods for width and height. 
//  double getWidth() { return width; } 
//  double getHeight() { return height; } 
//  void setWidth(double w) { width = w; } 
//  void setHeight(double h) { height = h; } 
// 
//  void showDim() { 
//    System.out.println("Width and height are " + 
//                       width + " and " + height); 
//  } 
//}
    
//7_6
    
//  private double width; 
//  private double height; 
// 
//  // Parameterized constructor. 
//  TwoDShape(double w, double h) { 
//    width = w; 
//    height = h; 
//  } 
// 
//  // Accessor methods for width and height. 
//  double getWidth() { return width; } 
//  double getHeight() { return height; } 
//  void setWidth(double w) { width = w; } 
//  void setHeight(double h) { height = h; } 
// 
//  void showDim() { 
//    System.out.println("Width and height are " + 
//                       width + " and " + height); 
//  } 
//}

//7_7
//  private double width; 
//  private double height; 
// 
//  // A default constructor. 
//  TwoDShape() { 
//    width = height = 0.0; 
//  } 
// 
//  // Parameterized constructor. 
//  TwoDShape(double w, double h) { 
//    width = w; 
//    height = h; 
//  } 
// 
//  // Construct object with equal width and height. 
//  TwoDShape(double x) { 
//    width = height = x; 
//  } 
// 
//  // Accessor methods for width and height. 
//  double getWidth() { return width; } 
//  double getHeight() { return height; } 
//  void setWidth(double w) { width = w; } 
//  void setHeight(double h) { height = h; } 
// 
//  void showDim() { 
//    System.out.println("Width and height are " + 
//                       width + " and " + height); 
//  } 
//}
    
    
//7_11
//private double width; 
//  private double height; 
// 
//  // A default constructor. 
//  TwoDShape() { 
//    width = height = 0.0; 
//  } 
// 
//  // Parameterized constructor. 
//  TwoDShape(double w, double h) { 
//    width = w; 
//    height = h; 
//  } 
// 
//  // Construct object with equal width and height. 
//  TwoDShape(double x) { 
//    width = height = x; 
//  } 
// 
//  // Accessor methods for width and height. 
//  double getWidth() { return width; } 
//  double getHeight() { return height; } 
//  void setWidth(double w) { width = w; } 
//  void setHeight(double h) { height = h; } 
// 
//  void showDim() { 
//    System.out.println("Width and height are " + 
//                       width + " and " + height); 
//  } 
//} 

//7_15

//  private double width; 
//  private double height; 
// 
//  // A default constructor. 
//  TwoDShape() { 
//    width = height = 0.0; 
//  } 
// 
//  // Parameterized constructor. 
//  TwoDShape(double w, double h) { 
//    width = w; 
//    height = h; 
//  } 
// 
//  // Construct object with equal width and height. 
//  TwoDShape(double x) { 
//    width = height = x; 
//  } 
// 
//  // Construct an object from an object. 
//  TwoDShape(TwoDShape ob) { 
//    width = ob.width; 
//    height = ob.height; 
//  } 
// 
//  // Accessor methods for width and height. 
//  double getWidth() { return width; } 
//  double getHeight() { return height; } 
//  void setWidth(double w) { width = w; } 
//  void setHeight(double h) { height = h; } 
// 
//  void showDim() { 
//    System.out.println("Width and height are " + 
//                       width + " and " + height); 
//  } 
//} 

//7_20

  private double width;  
  private double height;  
  private String name;  
  
  // A default constructor.  
  TwoDShape() {  
    width = height = 0.0;  
    name = "none";  
  }  
  
  // Parameterized constructor.  
  TwoDShape(double w, double h, String n) {  
    width = w;  
    height = h;  
    name = n;  
  }  
  
  // Construct object with equal width and height.  
  TwoDShape(double x, String n) {  
    width = height = x;  
    name = n;  
  }  
  
  // Construct an object from an object.  
  TwoDShape(TwoDShape ob) {  
    width = ob.width;  
    height = ob.height;  
    name = ob.name;  
  }  
  
  // Accessor methods for width and height.  
  double getWidth() { return width; }  
  double getHeight() { return height; }  
  void setWidth(double w) { width = w; }  
  void setHeight(double h) { height = h; }  
  
  String getName() { return name; }  
  
  void showDim() {  
    System.out.println("Width and height are " +  
                       width + " and " + height);  
  }  
  
  double area() {   
    System.out.println("area() must be overridden");  
    return 0.0;  
  }   
}