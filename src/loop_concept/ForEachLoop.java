package loop_concept;

    //Java for-each Loop/enhanced for loop
    //The for-each loop is used to traverse array or collection in java. It is easier to use than simple for loop because we don't need to increment value and use subscript notation.
    //It works on elements basis not index. It returns element one by one in the defined variable.

public class ForEachLoop {

    public static void main(String[] args) {

        //Declaring an Array
        int [] i = {1, 4, 9, 10, 12, 14};

        for (int arr : i) {
            System.out.println(arr);
        }

    }
}
