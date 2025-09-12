package classesandobjects;

public class MainClass {

    public static void main(String[] args) {

        System.out.println("Hello everyone, welcome to spring 1 module!!!");

        Student student1 = new Student();
        System.out.println("student1 before assigning the values : "+student1);

        // assigning the values to the student1 object
        student1.id = 123;
        student1.name = "Ajay";
        student1.dob = "12/12/2013";
        student1.grade = "7th grade";
        student1.email = "ajay111@gmail.com";

        System.out.println("student1 after assigning the values : "+student1);

        student1.email = "ajay333@gmail.com";
        System.out.println("student1 after changing email : "+student1);

        Demo demo1 = new Demo();
        demo1.demo1();
        System.out.println("demo abc value is : "+demo1.abc);

        Demo.demo2();
        System.out.println("demo mno value is : "+Demo.mno);

        int pqr = 200;
        final int xyz=300;
        System.out.println("pqr is : "+pqr+"------------"+"xyz is : "+xyz);

        pqr=400;
       // xyz=500; - we cannot change the value of xyz as it is final
        System.out.println("pqr is : "+pqr+"------------"+"xyz is : "+xyz);

    }
}
