package string_problem;

import java.util.LinkedHashMap;

//Java program to check occurence of each vowel in String
/*To count occurence of vowels in a string again use Map utility of java as used in calculating
        occurence of each character in string.Put each vowel as key in Map and put initial value
        as 1 for each key.Now compare each character with key of map if a character matches with
        a key then increase its corresponding value by 1.*/
public class Problem8_OccuranceEachVowel {
    public static void main(String[] args) {
        String str = "AEAIOG";
        LinkedHashMap<Character, Integer> hMap = new LinkedHashMap();
        hMap.put('A', 0);
        hMap.put('E', 0);
        hMap.put('I', 0);
        hMap.put('O', 0);
        hMap.put('U', 0);
        for (int i = 0; i <= str.length() - 1; i++) {
            if (hMap.containsKey(str.charAt(i))) {
                int count = hMap.get(str.charAt(i));
                hMap.put(str.charAt(i), ++count);
            }
        }
        System.out.println(hMap);
    }
}
