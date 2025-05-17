import java.util.Scanner;
class ParameterizedConstructor {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int x = sc.nextInt();
        System.out.println("Enter b value: ");
        int y = sc.nextInt();
        Add a = new Add(x,y);
        Sub s = new Sub(x,y);
        Mul m = new Mul(x,y);
        Div d = new Div(x,y);
        Mod mo = new Mod(x,y);
    }
}
class Add{
    Add(int a, int b){
        int sum;
        sum = a+b;
        System.out.println("Addition: "+sum);
    }
}
class Sub{
    Sub(int a, int b){
        int dif;
        dif = a-b;
        System.out.println("Subtraction: "+dif);
    }
}
class Mul{
    Mul(int a, int b){
        int pro;
        pro = a*b;
        System.out.println("Multiplication: "+pro);
    }
}
class Div{
    Div(int a, int b){
        int par;
        par = a/b;
        System.out.println("Division: "+par);
    }
}
class Mod{
    Mod(int a, int b){
        int modu;
        modu = a%b;
        System.out.println("Modulus: "+modu);
    }
}