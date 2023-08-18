# Variables
''Learning Objectives:
- Introduction to data types
- Introduction to primitive versus object types



A variable is a piece of memory to which we can assign data to make it easy to reuse. We want to use variables as tools to make our code more understandable. That means that we want to give our variables good names that represent the data they hold, not single letters (with a couple exceptions, like i and j for loops and x and y for coordinates).

## Type Declaration
Every variable requires a type declaration when we initialize it. This is to help with speed and safety. Speed, because all variables of the same type require the same amount of memory, and by declaring the type at initialization, Java is able to allocate only the proper amount. It helps with safety, in that if we try to assign a value of the wrong type to a variable, we will receive an error even before we try to run the code. This lets us catch our mistakes before the program even runs, removing one big source of bugs.

The pattern for declaring a variable in Java is type variableName;.

To assign a value to a variable, use variableName = value;

### Default Values if Uninitialized
If a variable is declared but not initialized with a value, the following default values are assigned:

int	0
double	0.0
boolean	false
String	null

## Naming Conventions
Some rules of thumb to follow when choosing a variable name:

Variable names should not be reserved keywords like char, class or int, for example.
Use camel case. Start the variable name with a lower-case letter and capitalize any words within the name, for example amountOfSale.
Variable names cannot begin with number or a whitespace, and generally you should not use _ (underscores).
Make your variables readable. Rather than using a or b or other inscrutable names like amtColl, instead use something clear and descriptive like amountCollected, for example.
[javaFun/Variables.java](./javaFun/Variables.java)

```java
public class Variables {
    public static void main(String[] args){
        int ourInt; // we can declare a variable without setting its value
        ourInt = 400; // we can assign a value to the variable later in our code
        double pi = 3.14159265; // we can also declare and assign on the same line
        boolean bool = true;
        char singleCharacter = 'A';
        
        String multipleCharacters = "ABC";
    }
}
```

## Data Types

### Primitive Types
Here are the most-used primitive types in Java:

- int: An int holds integers, like 4 or -51. It is limited to numbers between -2147483648 and 2147483647, or around 2 billion.
- long: These are for larger integers up to 2^63, or around 2 quintillion.
- boolean: A boolean represents one of two values: true or false.
- double: Doubles are for floating point numbers like 3.14159265. We will use double rather than float almost exclusively, because they are far more precise.
- char: The char data type is used to store a single character, like '$' or 'A'.

### Object Types & "Wrapper Classes"

In addition to primitive data types, Java also has object types. Some of these built-in object types in Java are what you might think of as wrapper classes. A wrapper class is a more robust version that adds functionality to a primitive type and makes it easier to use in conjunction with other object types or data structures like ArrayList (which you'll learn about later in this chapter.) You may already have used something similar to Object types in JavaScript or Python without knowing it! If you have ever used someString.length or someString.slice() in JavaScript, these are added features to strings, that can only be accomplished in Java using object types.

### Some examples:

Integer: The Integer class wraps a value of the primitive type int into an object.
Long: The Long class wraps a value of the primitive type long into an object.
Boolean: The Boolean class wraps a value of the primitive type boolean into an object.
Double: The Double class wraps a value of the primitive type double into an object.
Character: The Character class wraps a value of the primitive type char into an object.
Other object types built into Java are:

String: Represents a sequence of characters, much like a string in other languages.
BigInteger: Represents an integer that can be any size at all.
Notice that primitive typing is lowercase, while object wrapper typing is capitalized.

Useful Links:
[Java Wrapper Classes](https://www.w3schools.com/java/java_wrapper_classes.asp)