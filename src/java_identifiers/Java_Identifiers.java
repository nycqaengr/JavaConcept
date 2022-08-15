package java_identifiers;

//                            Java Identifiers
//All Java variables must be identified with unique names.
//These unique names are called identifiers.
//Identifiers can be short names (like x and y) or more descriptive names (age, sum, totalVolume).
//Note: It is recommended to use descriptive names in order to create understandable and maintainable code:

//The general rules for constructing names for variables (unique identifiers) are:

//1. Names can contain letters, digits, underscores, and dollar signs
//2. Names must begin with a letter
//3. Names should start with a lowercase letter and it cannot contain whitespace
//4. Names can also begin with $ and _ (but we will not use it in this tutorial)
//5. Names are case sensitive ("myVar" and "myvar" are different variables)
//6. Reserved words (like Java keywords, such as int or boolean) cannot be used as names

public class Java_Identifiers {
    public static void main(String[] args) {
        // Good
        int minutesPerHour = 60;

        // OK, but not so easy to understand what m actually is
        int m = 60;

        System.out.println(minutesPerHour);
        System.out.println(m);

    }
}
