// Write a program in java using inheritance to show how to call the base class
// parameterized constructors from the derived class using super.

import java.util.*;

class Plate{
    int length;
    Plate(int x){
        length=x;
        System.out.println("\nBase class Parameterised constructor called \n");
        System.out.println("Value passed is : " + length);
    }

}
class Box extends Plate{
    Box(){
        super(5);
        System.out.println("\nYou are in derived class now\n");
    }
}


public class Q4 {

    public static void main(String args[]){
        Box b = new Box();
    }
    
}
