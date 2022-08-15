package string_problem;

public class Problem3_RemoveAChar {
    public static void main(String[] args) {
        String s = "I Love Java";
        System.out.println(charRemoveAt(s,2));
    }
    public static String charRemoveAt(String s, int index){
        return s.substring(0,index)+s.substring(index+1);
    }
}
