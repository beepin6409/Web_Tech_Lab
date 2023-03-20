// Illustrate the execution of constructors in multi-level inheritance with three
// Java classes – plate(length, width), box(length, width, height), wood box
// (length, width, height, thick)

import java.util.*;

class Plate{
    int length;
    int width;
    Plate(int x,int y){
        length=x;
        width=y;
    }

}
class Box extends Plate{
    int height;
    Box(int x,int y,int z){
        super(x,y);
        height=z;
    }
}
class WoodBox extends Box{
    int thick;
    WoodBox(int x,int y,int z,int r){
        super(x,y,z);
        thick=r;
    }
    void display(){
        System.out.println("Length : " + length + "\nWidth : " + width + "\nHeight : "+ height + "\nThick : "+ thick  );
    }
}
public class Q1{
    public static void main(String args[]){
        WoodBox w = new WoodBox(10,15,20,25);
        w.display();
    }

}