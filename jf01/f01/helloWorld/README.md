# Hello World
## Learning Objectives:
- Be able to create a .java file with a main method
- Create and run a java program using the javac and java executable commands

## Launching Your Java Program
- create a folder in your Coding Dojo java assignments folder and name it [greetings](./greetings/Test.java). 
- Be sure to capitalize the first letter. Then type out the following code.

Test.java
```java
public class Test {
	public static void main(String[] args) {
	}
}
```
We’ll get into what each of these keywords are as we go forward, but in order to just start coding, any code you write initially will be in between these two inner curly brackets, inside the main method. In Java, all functions are written inside of classes, and are called methods.

## The Main Method

Every Java program will have one and only one class file that has a main method. We’ll dive deeper into classes, and OOP generally in the next section. But for now, we’ll be writing all of our procedural code inside of this main method. Think of the main as the launchpad for all your applications.

## File Naming
There are a few things to double check each time you create a .java file.

File and class names must match.
The file name and class name need to be exactly the same, or it won’t compile. In this case, Test.java and class Test
File and class names should be Pascal case.
The file name and class name should be written Pascal case. It should start with an uppercase letter and start each word with another capital letter. For example, a class file with all the methods (functions) for a bank account would be called BankAccount.java and class BankAccount
Getting Started
Alright! So let’s add some code. As always, we’ll start with printing “Hello world!” to the console. To debug, and in general, to print to your terminal, you can use this command:

```java
System.out.println("Hello world!");
```

You’ll notice very quickly as you progress and come across common errors that in Java semicolons are required syntax for ending any statement, unlike in JavaScript where it is optional.

```java
public class Test {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
```
## Compiling and Running Your Code
There are a few steps to running your Java program.

1. Compile it with the command `javac` NameOfFile.java
1. Fix any syntax errors that come up during compilation and re-compile (step 1) until there are no errors.
1. Run your program with the command java NameOfFile


If you run the `javac NameOfFile.java` command and nothing prints in the terminal, that's a good thing! It means the file compiled successfully. When you compile your Test.java file, you’ll notice that a Test.class file is now created. This is the bytecode file that your Java Virtual Machine will translate to machine code.


Notice that to run the code, while you will be executing the bytecode file, in this case `Test.class`, you do not need to include the extension `.class` when you run the java Test command.


## Mantra for today: Whenever you run a file, you gotta compile!

Every time you make a change to your code, you will need to re-compile it.