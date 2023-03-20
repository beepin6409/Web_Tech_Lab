// Write a program in java to define a class Shape which has data member „area‟ and a
// member function showArea(). Derive two classes Circle and Rectangle from Shape
// class. Add appropriate data members and member functions to calculate and display
// the area of Circle and Rectangle.


class Shape{
    int area;
    void showArea(){
        System.out.println("Area is : "+ area);
    }
}

class Circle extends Shape{
    int radius;
    Circle(int x){
        radius=x;
    }
    void calculateArea(){
        area = 22/7 *( radius * radius) ;
        showArea();
    }
}

class Rectangle extends Shape{
    int length;
    int breadth;
    Rectangle(int x,int y){
        length =x;
        breadth = y;
    }
    void calculateArea(){
        area = length * breadth ;
        showArea();
    }
}

public class Q2 {
    public static void main(String args[]){
        Circle c = new Circle(5);
        c.calculateArea();

        Rectangle r= new Rectangle(5,10);
        r.calculateArea();
    }
    
}
