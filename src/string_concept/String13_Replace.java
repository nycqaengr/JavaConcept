package string_concept;

public class String13_Replace {
    //The Java String class replace() method returns a string replacing all the old char or
    //CharSequence to new char or CharSequence.
    public static void main(String[] args) {
        String s1="javatpoint is a very good website";
        String replaceString=s1.replace('a','e');//replaces all occurrences of 'a' to 'e'
        System.out.println(replaceString);
    }
}
