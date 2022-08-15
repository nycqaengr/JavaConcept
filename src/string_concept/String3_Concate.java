package string_concept;

public class String3_Concate {

    public static void main(String[] args) {
        String s="Nurul"+" Mahmud";
        System.out.println(s);//Nurul Mahmud

        System.out.println("\n"+"Note: After a string literal, all the + will be treated as string concatenation operator."+"\n");
        String s1=50+30+"Nurul"+40+40;
        System.out.println(s1);//80Nurul4040

        //The String concat() method concatenates the specified string to the end of current string.
        System.out.println("\n"+"String Concatenation by concat() method"+"\n");
        String r1="Nurul ";
        String r2="Mahmud";
        String r3=r1.concat(r2);
        System.out.println(r3);//Nurul Mahmud


        System.out.println("\n Concating multiple string objects :");
        String m1= "Hello";
        String m2= "Javatpoint";
        String m3= "Reader";
        //concating one string
        String m4=m1.concat(m2);
        System.out.println(m4);
        //concate multiple strings
        String m5=m1.concat(m2).concat(m3);
        System.out.println(m5);
        String m6=m1.concat(" ").concat(m2).concat(" ").concat(m3);
        System.out.println(m6);
    }
}
