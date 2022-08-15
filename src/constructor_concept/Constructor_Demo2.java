package constructor_concept;

public class Constructor_Demo2 {

    //declare class vars
    String name;
    int age;

    public Constructor_Demo2() {
        System.out.println("Default Constructor");//0 parameter  constructor
    }
    public Constructor_Demo2(int i) {
        System.out.println("1 parameter Constructor=");//1 parameter constructor
        System.out.println(i);
    }
    public Constructor_Demo2(int i, int j) {
        System.out.println("2 parameter Constructor=");//2 parameter constructor
        System.out.println(i+" "+j);
    }
    public Constructor_Demo2(String name, int age) {
        this.name=name;//this.class vars = local vars
        this.age=age;
    }
    public static void main(String[] args) {
        Constructor_Demo2 cDemo = new Constructor_Demo2();
        Constructor_Demo2 cDemo2 = new Constructor_Demo2(10);
        Constructor_Demo2 cDemo3 = new Constructor_Demo2(25, 35);
        Constructor_Demo2 cDemo4 = new Constructor_Demo2("Mahmud", 35);

        System.out.println(cDemo4.name+" "+cDemo4.age);
    }
}
