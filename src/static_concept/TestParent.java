package static_concept;

public class TestParent {

    public static void main(String[] args) {

        ParentClass pClass = new ParentClass();
        ParentClass pClass2 = new ChildClass();
        pClass.display();
        pClass2.display();
    }
}
