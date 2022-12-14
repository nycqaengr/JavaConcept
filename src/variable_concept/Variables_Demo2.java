package variable_concept;

//Types of Variables
//There are three types of variables in Java:
//1. local variable 2. instance variable and 3. static variable

//1) Local Variable
//A variable declared inside the body of the method is called local variable.
//You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.
//A local variable cannot be defined with "static" keyword.

//2) Instance Variable
//A variable declared inside the class but outside the body of the method, is called instance variable. It is not declared as static.
//It is called instance variable because its value is instance specific and is not shared among instances.

//3) Static variable
//A variable which is declared as static is called static variable. It cannot be local.
//You can create a single copy of static variable and share among all the instances of the class.
//Memory allocation for static variable happens only once when the class is loaded in the memory.

public class Variables_Demo2 {

    int data = 50;// Instance variable
    static int number= 100;//Static variable

    public void method() {
        int n= 99;//Local variable
    }
}
