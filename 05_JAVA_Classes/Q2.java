// 5.  Write a program in java to input and display the details of n number of
// students having roll, name and cgpa as data members. Also display the name of the
// student having lowest cgpa.

import java.util.*;

class Student{
    int roll;
    String name="";
    float cgpa;
    Student(int r,String s,float c){
        roll=r;
        name=s;
        cgpa=c;
    }
    void display(){
        System.out.println("NAME : " + name);
        System.out.println("Roll : " + roll);
        System.out.println("Cgpa : " + cgpa);
    }
    int lowest_Cgpa(int n,Student[] a){
        float min_cgpa=a[0].cgpa;
        int index=0;
        for(int i=0;i<n;i++){
            float temp=a[i].cgpa;
            if(min_cgpa > temp){
                min_cgpa=temp;
                index=i;
            }
        }
        System.out.println(min_cgpa);
        return index;  
    }      
}

public class Q2{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.println("ENter the number of students : ");
        n=sc.nextInt();
        Student[] s= new Student[n];
        for(int i=0;i<n;i=i+1){
            System.out.println("Enter the details " +  (i+1)  + ":  as roll, name and cgpa : ");
            int r;
            String na;
            float c;
            r=sc.nextInt();
            na=sc.nextLine();
            c=sc.nextFloat();
            s[i]= new Student(r,na,c);
        }

        int index;
        index=s[0].lowest_Cgpa(n,s);
        System.out.println("Lowest CGPA Student  name is : ");
        s[index].display();


    }
    
}
    
