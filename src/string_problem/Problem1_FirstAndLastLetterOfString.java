package string_problem;

public class Problem1_FirstAndLastLetterOfString {

    public static void main(String[] args) {
        String s = "MAHMUD";
        char firstLetter = s.charAt(0);
        char lastLetter =s.charAt(s.length()-1);
        System.out.println("First Letter is :" +firstLetter);
        System.out.println("Last Letter is :" +lastLetter);
    }
}
