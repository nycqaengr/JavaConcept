package constructor_overloading;

public class Test {

    public static void main(String[] args) {

        Teacher t1= new Teacher();
        t1.name = "Nurul Mahmud";
        t1.gender = "Male";
        t1.age = 10;
        System.out.println(t1.name);
        System.out.println(t1.gender);
        System.out.println(t1.age);
    }
}
