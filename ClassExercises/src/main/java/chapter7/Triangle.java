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
public class Triangle extends TwoDShape { 
//  String style; 
//   
//  double area() { 
//    return width * height / 2; 
//  } 
// 
//  void showStyle() { 
//    System.out.println("Triangle is " + style); 
//  } 
//}
//extends TwoDShape { 
//  String style; 
//   
//  double area() { 
//    return width * height / 2; // Error! can't access 
//  } 
// 
//  void showStyle() { 
//    System.out.println("Triangle is " + style); 
//  } 
//}

//7_4
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
//  private String style; 
//   
//  // Constructor 
//  Triangle(String s, double w, double h) { 
//    setWidth(w); 
//    setHeight(h); 
// 
//    style = s;  
//  } 
// 
//  double area() { 
//    return getWidth() * getHeight() / 2;  
//  } 
// 
//  void showStyle() { 
//    System.out.println("Triangle is " + style); 
//  } 
//} 

//7_6
//  private String style; 
//   
//  Triangle(String s, double w, double h) { 
//    super(w, h); // call superclass constructor 
// 
//    style = s;  
//  } 
// 
//  double area() { 
//    return getWidth() * getHeight() / 2; 
//  } 
// 
//  void showStyle() { 
//    System.out.println("Triangle is " + style); 
//  } 
//}

//7_7
//  private String style; 
//   
//  // A default constructor. 
//  Triangle() { 
//    super(); 
//    style = "none"; 
//  } 
// 
//  // Constructor 
//  Triangle(String s, double w, double h) { 
//    super(w, h); // call superclass constructor 
// 
//    style = s;  
//  } 
// 
//  // One argument constructor. 
//  Triangle(double x) { 
//    super(x); // call superclass constructor 
// 
//    style = "filled";  
//  } 
// 
//  double area() { 
//    return getWidth() * getHeight() / 2; 
//  } 
// 
//  void showStyle() { 
//    System.out.println("Triangle is " + style); 
//  } 
//}

//7_11

//  private String style; 
//   
//  // A default constructor. 
//  Triangle() { 
//    super(); 
//    style = "none"; 
//  } 
// 
//  Triangle(String s, double w, double h) { 
//    super(w, h); // call superclass constructor 
// 
//    style = s;  
//  } 
// 
//  // One argument constructor. 
//  Triangle(double x) { 
//    super(x); // call superclass constructor 
// 
//    style = "filled";  
//  } 
// 
//  double area() { 
//    return getWidth() * getHeight() / 2; 
//  } 
// 
//  void showStyle() { 
//    System.out.println("Triangle is " + style); 
//  } 
//} 

//7_15

//  private String style; 
//   
//  // A default constructor. 
//  Triangle() { 
//    super(); 
//    style = "none"; 
//  } 
// 
//  // Constructor for Triangle. 
//  Triangle(String s, double w, double h) { 
//    super(w, h); // call superclass constructor 
// 
//    style = s;  
//  } 
// 
//  // One argument constructor. 
//  Triangle(double x) { 
//    super(x); // call superclass constructor 
// 
//    style = "filled";  
//  } 
// 
//  // Construct an object from an object. 
//  Triangle(Triangle ob) { 
//    super(ob); // pass object to TwoDShape constructor 
//    style = ob.style; 
//  } 
// 
//  double area() { 
//    return getWidth() * getHeight() / 2; 
//  } 
// 
//  void showStyle() { 
//    System.out.println("Triangle is " + style); 
//  } 
//} 
// 

//7_20

  private String style;  
    
  // A default constructor.  
  Triangle() {  
    super();  
    style = "none";  
  }  
  
  // Constructor for Triangle.  
  Triangle(String s, double w, double h) {  
    super(w, h, "triangle");  
  
    style = s;   
  }  
  
  // One argument constructor. 
  Triangle(double x) {  
    super(x, "triangle"); // call superclass constructor  
  
    style = "filled";   
  }  
  
  // Construct an object from an object.  
  Triangle(Triangle ob) {  
    super(ob); // pass object to TwoDShape constructor  
    style = ob.style;  
  }  
  
  // Override area() for Triangle. 
  double area() {  
    return getWidth() * getHeight() / 2;  
  }  
  
  void showStyle() {  
    System.out.println("Triangle is " + style);  
  }  
} 