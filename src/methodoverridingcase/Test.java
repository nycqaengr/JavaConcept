package methodoverridingcase;

public class Test {

    public void multiplication(int a, int b) {
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        Multiplication ml = new Multiplication();
        ml.multiplication(10, 20);
        ml.multiplication(10, 20, 30);

        Test test = new Test();
        test.multiplication(100, 200);

    }
}
