import java.sql.SQLOutput;

public class JavaBasics_1 {
    String n;
    int i= 5;
    boolean b= true;
    double d= 4.25678;
    float f1= 5.4f;
    char character = 'c';
    String s= "hi";
    int my_Number = 6;
    int my_number2= 15;

     JavaBasics_1(String s)
    {
        System.out.println(s);
    }
    JavaBasics_1(){

    }
    public void my_requirement(){
        System.out.println("I am working hard to get job"); // this is the method and method signature
    }
    public void declaringLocalVariable(){
        int my_Number= 5;
        int my_number2= 12;
        int x=  my_Number+ my_number2;
        System.out.println(x);

    }
    public  int declaringLocalVariable1(){
        int my_Number= 5;
        int my_number2= 12;
        int x= my_Number+my_number2;
        return x;
        //System.out.println(my_Number+ my_number2);
        }
    public void call_MY_Name(String n1){
        this.n= n1;
        System.out.println("Hi My name is "+ n); //this is a single line comment
    }

    public void differentMethods(){
        System.out.println("creting this method to show multi line comments and java can ignore this");
    }

    public static void main(String[] args) {
        JavaBasics_1 basics= new JavaBasics_1();// this is how we crete object
        JavaBasics_1 basics1= new JavaBasics_1();
        basics.my_requirement();
        basics.call_MY_Name("bhawna");
        System.out.println(basics.s + "," + basics.b+ "," + basics.f1+ ", " + basics.d+ ","  + basics.n+ ", " + basics.i+ ", " + basics.character);
        System.out.println(basics.my_Number+ basics.my_number2);
        System.out.println(basics.declaringLocalVariable1());
        basics.declaringLocalVariable();

    }


}
