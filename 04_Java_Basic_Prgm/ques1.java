import java.util.*;

class Grade{
    {
        public static void main(String args[])
        {
            int marks;
            Scanner in=new Scanner(System.in);
            System.out.println("Enter the marks : ");
            marks=in.nextInt();
            if(marks>=90){
                System.out.println("O Grade");
            }
            else if(marks>=80){
                System.out.println("E Grade");
            }
            else if(marks>=70){
                System.out.println("A Grade");
            }
            else if(marks>=60){
                System.out.println("B Grade");
            }
            else if(marks>=50){
                System.out.println("C Grade");
            }
            else{
                System.out.println("D Grade");
            }

        }
    }

}