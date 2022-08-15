package string_problem;

//Write a program to count FREQUENCY of characters.
public class Problem5_CountFrequencyOfChar {
    public static void main(String[] args) {
        String s = "welcome to interview";
        int count =0;
        for(int i=0; i<=s.length()-1;i++){
            if(s.charAt(i) == 't'){
                count++;
            }
        }
        System.out.println("Frequency of character t is :"+count);
    }
}
