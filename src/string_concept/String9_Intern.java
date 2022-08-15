package string_concept;

public class String9_Intern {
    //if we want to store any heap object inside the String Constant Pool area forcefully then we will use intern() method.
    //Java String intern() method is used for getting the string from the memory if it is already present.
    //This method ensures that all the same strings share the same memory.
    //It can be used to return string from memory, if it is created by new keyword. It creates exact copy of heap string object in string constant pool.
    //For example, creating a string “hello” 10 times using intern() method would ensure that
    //there will be only one instance of “hello” in the memory and all the 10 references point to the same instance.
    public static void main(String[] args) {

        //String s1= "javatpoint";
        //String s2= s1.intern();
        //String s3= new String("javatpoint");
        //String s4= s3.intern();
        //System.out.println(s1==s2);
        //System.out.println(s1==s3);
        //System.out.println(s1==s4);
        //System.out.println(s2==s3);
        //System.out.println(s2==s4);
        //System.out.println(s3==s4);

        String s1= "javatpoint";
        String s2= s1.intern();
        String s3= new String("javatpoint");
        String s4= s3.intern();

        if (s1==s2) {
            System.out.println("String s1 and s2 are same");
        }
        if (s1==s3) {
            System.out.println("String s1 and s3 are same");
        } else {
            System.out.println("String s1 and s3 are not same");
        }
        if (s1==s4) {
            System.out.println("String s1 and s4 are same");
        }

    }
}
