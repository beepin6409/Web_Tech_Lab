// Write a program in Java to define a class Number with appropriate data
// members and member functions to input n number of integers and swap the biggest
// and smallest elements. Use member functions read(), swap() and display().

import java.util.*;

public class Q4 {
    int arr[] = new int[10];

    void read(){
        Scanner sc=new Scanner(System.in);
    
        System.out.println("ENter numbers : ");
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
    }
    void swap(){
        int max_ind=0;
        int min_ind=0;
        int max_num=arr[0];
        int min_num=arr[0];
        for(int i=0;i<10;i++){
            if(arr[i] > max_num){
                max_num=arr[i];
                max_ind=i;
            }
            if(min_num > arr[i]){
                min_num=arr[i];
                min_ind=i;
            }
        }
        int temp=arr[max_ind];
        arr[max_ind]=arr[min_ind];
        arr[min_ind]=temp;

    }
    void display(){
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }

    }
    public static void main(String args[]){
        Q4 q= new Q4();
        q.read();
        q.swap();
        q.display();
    }
    
}
