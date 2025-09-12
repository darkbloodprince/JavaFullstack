package classesandobjects;

public class Demo {

    public int abc=100; // non-static variable - object is required
    public static int mno=900; // static variable  - object is not required


    public void demo1(){ // if non static method then we can use both static and non static variables inside it
        mno =800;
        abc=700;
        System.out.println("demo1 - this is a non static method, which uses object");
    }

    public static void demo2(){ // if static method then we can use only static variables inside it
        //abc =600; since it is non static we cannot use it here
        mno=800;
        System.out.println("demo2 - this is a static method, which does not uses object");
    }
}
