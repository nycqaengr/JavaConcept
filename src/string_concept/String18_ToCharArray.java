package string_concept;

public class String18_ToCharArray {
    //The java string toCharArray() method converts this string into character array.
    // It returns a newly created character array, its length is similar to this string and
    // its contents are initialized with the characters of this string.
    public static void main(String[] args) {
        String s = "Welcome to Coding World";

        char[] ch= s.toCharArray();

        System.out.println("The lenth :"+ch.length);

        System.out.println("Contain letter as under:");

        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
    }
}
