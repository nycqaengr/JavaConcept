package string_problem;

import java.util.HashMap;

//Java program to check occurrence of each character in String

/*In order to find occurrence of each character in a string we can use Map utility of Java.
        In Map, a key could not be duplicate so make each character of the string as the key of Map
        and provide an initial value corresponding to each key as 1 if this character does not insert
        in the map before. Now when a character repeats during insertion as key in Map increase
        its value by one. Continue this for each character until all characters of string get inserted.*/
public class Problem6_CountFrequecyOfAllChar {

    public static void main(String[] args) {
        String str = "SSDRRRTTYYTYTR";
        HashMap<Character, Integer> hMap = new HashMap<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (hMap.containsKey(str.charAt(i))) {
                int count = hMap.get(str.charAt(i));
                hMap.put(str.charAt(i), ++count);
            } else {
                hMap.put(str.charAt(i),1);
            }
        }
        System.out.println(hMap);
    }
}
