package string_problem;

public class Problem2_ReverseAString {

    public static void main(String[] args) {
        String s = "SOFTWARE";
        int len = s.length();
        String rev = "";
        for(int i=len-1; i>=0; i--){
            rev = rev+s.charAt(i);
        }
        System.out.println("Reverse is :"+rev);
    }
}
