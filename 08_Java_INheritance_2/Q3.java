// Illustrate the usage of abstract class with following Java classes –
// i)An abstract class „student‟ with data member roll no, reg no and a
// abstract method course()
// ii)A subclass „kiitian‟ with course() method implementation

abstract class Student{
    int roll;
    int reg_no;

    abstract void course(int roll,int reg_no,String sub);
}
class Kiitian extends Student{
    void course(int roll,int reg_no,String sub){
        System.out.println("\nStudent with roll : " +roll +" and reg no : "+ reg_no+" has chosen "+ sub + "Course\n");

    }

}

public class Q3 {
    public static void main(String args[]){
        Student kiit= new Kiitian();
        kiit.course(21,112,"Machine Learning");
    }
    
}
