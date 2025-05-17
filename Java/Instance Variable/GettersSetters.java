import java.util.Scanner;
class GettersSetters {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int x = sc.nextInt();
        System.out.println("Enter b value: ");
        int y = sc.nextInt();
        Values v = new Values();
        v.setValuea(x);
        v.setValueb(y);
        Add a = new Add(v.getValuea(),v.getValueb());
        Sub s = new Sub(v.getValuea(),v.getValueb());
        Mul m = new Mul(v.getValuea(),v.getValueb());
        Div d = new Div(v.getValuea(),v.getValueb());
        Mod mo = new Mod(v.getValuea(),v.getValueb());
    }
}
public class Values{
    private int a;
    private int b;
    public int getValuea(){
        return a;
    }
    public void setValuea(int x){
        this.a = x;
    }
    public int getValueb(){
        return b;
    }
    public void setValueb(int y){
        this.b = y;
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