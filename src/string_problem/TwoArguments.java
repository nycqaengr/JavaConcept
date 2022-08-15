package string_problem;

import java.util.ArrayList;

public class TwoArguments {

    //Create a function that takes two numbers as arguments
    // (num, length) and returns an array of multiples of num until the array length reaches length
    // Examples
    //arrayOfMultiples(7, 5) ➞ [7, 14, 21, 28, 35]
    //arrayOfMultiples(12, 10) ➞ [12, 24, 36, 48, 60, 72, 84, 96, 108, 120]
    //arrayOfMultiples(17, 6) ➞ [17, 34, 51, 68, 85, 102].

    public static ArrayList<Integer> arguments(int a, int b){
        ArrayList<Integer> multi = new ArrayList<Integer>();
        for (int i=1;i<b+1;i++ ){
            multi.add(a*i);
        }
        return multi;
    }

    public static void main(String[] args) {
        System.out.println(arguments(6,7));
    }




}
