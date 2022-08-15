package string_problem;
//Write a program to write a frequency of word in a String?
public class Problem7_CountFrequencyOfWord {

    public static int countOccurrences(String str, String word){
        //Split the string by spaces in a
        String a[] = str.split(" ");
        //search for pattern in a
        int count = 0;
        for (int i = 0; i < a.length; i++)
        {
            // if match found increase count
            if (word.equals(a[i]))
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "GeeksforGeeks A computer science portal for geeks ";
        String word = "portal";
        System.out.println(countOccurrences(str, word));
    }
}
