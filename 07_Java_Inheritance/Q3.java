// Write a program to create an Account class containing acc_no, balance as data
// members and disp() to display the details. Inherit it in Person class with all mentioned
// data members and functions. Person class also has name and aadhar_no as extra data
// members of its own. Override disp() function. Create
// 5 persons‟ details.

class Account{
    int acc_no;
    int balance;
    Account(int x,int y){
        acc_no=x;
        balance=y;
    }

    void disp(){
        System.out.println("Account no : " + acc_no);
        System.out.println("Balance : " + balance);
    }
}

class Person extends Account{
    String name = "";
    int adhar_no;

    Person(int a,int b,String c,int d){
        super(a,b);
        name=c;
        adhar_no=d;

    }

    void disp(){
        super.disp();
        System.out.println("Name  : " + name);
        System.out.println("Adhar No : " + adhar_no + "\n");
    }
}

public class Q3 {
    public static void main(String args[]){
        Person P1= new Person(567,500,"Bipin",186532345);
        Person P2= new Person(56712,234500,"Raman",123458653);
        Person P3= new Person(56127,502340,"Sita",123865345);
        Person P4= new Person(51267,523400,"Rahul",123865345);
        Person P5= new Person(12567,502340,"Badar",128653345);


        P1.disp();
        P2.disp();
        P3.disp();
        P4.disp();
        P5.disp();
    }
    
}
