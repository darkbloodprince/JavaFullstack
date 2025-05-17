import java.util.Scanner;
class WithInClass {
    public static void main(String args[]){
        System.out.println("Enter two numbers: ");
        WithInClass c = new WithInClass();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int a = sc.nextInt();
        System.out.println("Enter b value: ");
        int b = sc.nextInt();
        System.out.println("Addition: "+c.add(a,b));
        System.out.println("Subtraction: "+c.sub(a,b));
        System.out.println("Multiplication: "+c.mul(a,b));
        System.out.println("Division: "+c.div(a,b));
        System.out.println("Modulus: "+c.mod(a,b));
    }
    public int add(int a, int b){
        int sum;
        sum = a+b;
        return sum;
    }
    public int sub(int a, int b){
        int dif;
        dif = a-b;
        return dif;
    }
    public int mul(int a, int b){
        int pro;
        pro = a*b;
        return pro;
    }
    public int div(int a, int b){
        int par;
        par = a/b;
        return par;
    }
    public int mod(int a, int b){
        int modu;
        modu = a%b;
        return modu;
    }
}