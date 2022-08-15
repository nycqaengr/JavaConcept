package string_concept;

public class String1_CharAt {
    //charAt() returns a char value at the given index number
    //index number start from 0 and goes to n-1. n is the length of the string.
    public static void main(String[] args) {
        String s1 = "sout";
        char ch = s1.charAt(2);
        System.out.println(ch);
        System.out.println(s1.charAt(s1.length()-1));

        System.out.println("\n*****odd index****");
        String s2 = "welcome to java world";
        for(int i=0; i<s2.length()-1; i++){
            if(i%2 !=0){
                System.out.println("Char at"+" "+i+" place "+"is "+s2.charAt(i));
            }
        }

        System.out.println("\n*****counting frequency of a character in the string****");
        String s3 = "welcome to java website";
        int count =0;
        for(int i = 0; i<s3.length()-1;i++){
           if(s3.charAt(i)== 't'){
               count++;
           }
        }
        System.out.println("Frequency of t is :"+count);
    }

}
