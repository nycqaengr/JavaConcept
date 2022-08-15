package string_problem;

//Print character at ODD POSITION by chatAt()
public class Problem4_PrintCharAtOddPosition {

    public static void main(String[] args) {
        String s = "I Learn Java";
        for(int i=0; i<s.length()-1; i++){
            if(i%2 !=0){
                System.out.println(s.charAt(i));
            }
        }
    }
}
