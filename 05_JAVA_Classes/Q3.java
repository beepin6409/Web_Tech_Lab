// 6.  Write a program to calculate area according to user input, whether it is circle, square
// or triangle (Menu Driven).

import java.util.*;


public class Q3 {
    void area(float b,float h){
        float area;
        area =b*h;
        area=area/2;
        System.out.println("Area of triangle is : "+ area);
    }
    void area(float l){
        float area=l*l;
        System.out.println("Area of square is : "+ area);
    }
    void area(float l,char x){
        float area;
        area=3.14f * l * l;
        System.out.println("Area of triangle is : "+ area);
    }
    public static void main(String args[]){
        Q3 q=new Q3();
        Scanner sc=new Scanner(System.in);
        int choice;
        System.out.println("Enter 1 for triangle , 2 for square and 3 for circle : ");
        choice=sc.nextInt();
        if(choice==1){
            float b;
            float h;
            System.out.println("ENter base and height : ");
            b=sc.nextFloat();
            h=sc.nextFloat();
            q.area(b,h);
        }
        else if(choice==2){
            float h;
            System.out.println("ENter Length : ");
            h=sc.nextFloat();
            q.area(h);
        }
        else if(choice==3){
            float h;
            System.out.println("ENter Length : ");
            h=sc.nextFloat();
            q.area(h,'x');
        }
        else{
            System.out.println("Invalid Choice");

        }
    }
    
}
