// Write a program in Java to define a class Number with appropriate data
// members and member functions to input n number of integers and swap the biggest
// and smallest elements. Use member functions read(), swap() and display().

import java.util.*;

class Number{
    int arr[];
    Number(){
        arr=new int[5];
    }
    void read(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 numbers : ");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
    }
    void swap(){
        int max=0;
        int min=100000;
        int min_index=-1;
        int max_index=-1;
        for(int i=0;i<5;i++){
            if(arr[i]>max){
                max=arr[i];
                max_index=i;
            }
            if(arr[i]<min){
                min=arr[i];
                min_index=i;
            }

        }

        int temp=arr[max_index];
        arr[max_index]=arr[min_index];
        arr[min_index]=temp;
    }
    void display(){
        System.out.println("The number are : ");
        for(int i=0;i<5;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");

    }



}
public class Q1{
    public static void main(String args[]){
        Number n=new Number();
        n.read();
        n.display();
        
        System.out.println("After Swapping : ");
        n.swap();
        n.display();
        
    }
}