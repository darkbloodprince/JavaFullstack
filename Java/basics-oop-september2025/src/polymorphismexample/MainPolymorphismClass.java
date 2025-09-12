package polymorphismexample;

public class MainPolymorphismClass {
    public static void main(String[] args) {
        PerformSum performSum = new PerformSum();
        performSum.sum(1,2);
        performSum.sum(3,4,5);
        performSum.sum(4.50,3.45);
        performSum.sum(2.34f, 1.23f);
        performSum.sum(2,3.4f);
        performSum.sum(4,3.45);
    }
}
