// A plastic manufacturer sells plastic in different shapes like 2D sheet and 3D
// box. The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per
// cubic ft. Implement it in Java to calculate the cost of plastic as per the
// dimensions given by the user where 3D inherits from 2D.

import java.util.*;

class D2{
    double length;
    double breadth;
    double cost=40;
    void calculate(int l,int b){
        length=l;
        breadth=b;

        double area=length * breadth;
        System.out.println("The total cost is : " + area*cost);
    }

}
class D3 extends D2{
    double height;
    double cost=60;
    void calculate(int l,int b, int h){
        length=l;
        breadth=b;
        height=h;

        double volume = length * breadth * height;
        System.out.println("Total cost is : "+ volume * cost);
    }
}

public class Q2{
    public static void main(String args[]){
        D3 plastic = new D3();
        int l,b,h;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimensions i.e length,breadth,height: ");
        l=sc.nextInt();
        b=sc.nextInt();
        h=sc.nextInt();

        if(h==0){
            plastic.calculate(l,b);
        }
        else{
            plastic.calculate(l,b,h);
        }
    }
    
}
