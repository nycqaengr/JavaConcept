package constructor_concept;

public class Constructor_Demo1 {

//   								CONSTRUCTOR
//A constructor in Java is a special method that is used to initialize objects.
//The constructor is called when an object of a class is created.
//It can be used to set initial values for object attributes.
//Constructor is nothing just like a function but it does not return any value.
//Constructor(s) of a class must has same name as the class name in which it resides.
//and all classes have constructors by default.
//i.e. if you do not create a class constructor yourself, Java creates one for you.
//A constructor in Java cannot be abstract, final, static and synchronized.
//Duplicate constructor are not allowed. Constructor can be overloaded.
//Access modifiers can be used in constructor declaration to control its access
//i.e. which other class can call the constructor.
//When A constructor calls another constructor of same class then this is called constructor chaining.
//Constructor overloading is possible but overriding is not possible.
//Which means we can have overloaded constructor in our class but we can’t override a constructor.
//Constructors can not be inherited.
//Interfaces do not have constructors.
//A constructor can also invoke another constructor of the same class – By using this().
//Private constructor---Singleton Class

            //How constructors are different from methods in Java?
//1.Constructor(s) must have the same name as the class within which it is defined.
//while it is not necessary for the method in Java.
//2.Constructor(s) do not return any type while method (s) have the return type
//or void if does not return any value.

           //When is a constructor called?
//Each time an object is created using new() keyword at one constructor (it could be default constructor)
//is invoke to assign initial values to the data members of the same class.

//What if you implement only parameterized constructor in class?
//It will throw a compilation error.
}
