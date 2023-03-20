// Write a program to overload subtract method with various parameters in a class in
// Java


import java.util.*;

public class Q1{

    void subtract(int a){
        a=-a;
        System.out.println("Value is : "+ a);

    }
    void subtract(int a,int b){
        a=a-b;
        System.out.println("Value is : "+ a);
        
    }
    void subtract(int a,int b,int c){
        a=a-b-c;
        System.out.println("Value is : "+ a);
        
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 number : ");

        int a;
        int b;
        int c;

        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        Q1 x=new Q1();


        x.subtract(a);
        x.subtract(a,b);
        x.subtract(a,b,c);

    }


    
}