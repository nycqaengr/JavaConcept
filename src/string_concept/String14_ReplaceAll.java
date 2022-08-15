package string_concept;

public class String14_ReplaceAll {
    //The Java String class replaceAll() method returns a string replacing
    //all the sequence of characters matching regex and replacement string.
    public static void main(String[] args) {
        String s1="javatpoint is a very good website";
        String replaceString=s1.replaceAll("a","e");//replaces all occurrences of "a" to "e"
        System.out.println(replaceString);
    }
}
