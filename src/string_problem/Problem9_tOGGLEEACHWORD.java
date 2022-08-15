package string_problem;
    //Write a java program to tOGGLE each word in string?

//You can change the cases of the letters of a word using toUpperCase() and toLowerCase() methods.
//Split each word in the string using the split() method, change the first letter of each word to
// lower case and remaining letters to upper case.

public class Problem9_tOGGLEEACHWORD {
    public static void main(String[] args) {
        String sample = "Hello How are you";
        String[] words = sample.split(" ");
        String result = "";
        for(String word:words){
            String firstSub = word.substring(0, 1);//return H H a u
            String secondSub = word.substring(1);//return ello ow re ou
            result = result+firstSub.toLowerCase()+secondSub.toUpperCase()+" ";

        }System.out.println(result);
    }
}
