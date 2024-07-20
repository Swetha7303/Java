import java.util.*;

abstract class Shape{

protected double length;

protected double width;

protected double radius;

protected double side1;

protected double side2;

protected double side3;

public Shape(){

this.length=0;

this.width=0;

this.radius=0;

this.side1=0;

this.side2=0;

this.side3=0;

}

public abstract double calculateArea();

public abstract double calculatePerimeter() ;

}

class Square extends Shape{

public Square (double side){

this.length=side;

}

public double calculateArea(){

return length*length;

}

public double calculatePerimeter(){ return 4*length;

}

}
class Rectangle extends Shape{

public Rectangle(double length, double width){ this.length=length;

this.width=width;

}

public double calculateArea(){

return length+ width;

}

public double calculatePerimeter(){ return 2*(length+width);

}

}

class Circle extends Shape{

public Circle(double radius) { this.radius=radius;

} public double calculateArea(){ return Math.PI*radius* radius;

}

public double calculatePerimeter(){

return 2*Math.PI*radius;

}

} class Triangle extends Shape{

public Triangle(double side1, double side2, double side3){

this.side1=side1;

this.side2=side2;

this.side3=side3;

}

public double calculateArea(){

double s=(side1+side2+side3)/2;

return 
Math.sqrt(s*(s-side1)(s-side2)(s-side3));


}

public double calculatePerimeter(){

return side1+side2+side3;

}
}

public class Shapes{

public static void main(String swe[]){

Scanner sc=new Scanner(System.in); char shapeType=sc.next().charAt(0);

Shape shape=null;

switch(shapeType) {

case 'S':

double side=sc.nextDouble(); shape=new Square(side);

break;

case 'R':

double length=sc.nextDouble();

double width=sc.nextDouble();

 shape=new Rectangle(length, width);

break;

case 'C':

double radius=sc.nextDouble();

shape=new Circle(radius);

break;

case 'T':

double side1=sc.nextDouble();

double side2=sc.nextDouble();

double side3=sc.nextDouble();

shape=new Triangle (side1, side2, side3);

break;

default:

System.out.println("Invalid");
}

if (shapeType!='C')

System.out.printf("Perimeter: %.2f\n",shape.calculatePerimeter());

else

System.out.printf("Circumference: %.2f\n", shape.calculatePerimeter()) ;

System.out.printf("Area: %.2f", shape.calculateArea());

}

}