# Conditionals & Operators
''Learning Objective:
- Learn control flow in Java

Java uses conditionals like if-else statements and switch statements in conjunction with comparison operators and logical operators to control the flow of the program, in the same way all formal programming languages like JavaScript or Python do.

## If Statements
What if we have some code that we only want to execute under certain conditions? In computer programming, this is called a conditional statement. The syntax in Java looks like this:

```java
if (condition) {
    // what to do if condition is true
}
// continue with programcopy
boolean isRaining = true;
    
if(isRaining) {
    System.out.println("Bring an umbrella.");
}copy
```
## If-Else Chains
Likewise, we can chain multiple conditions in an if-else chain:
```java
if(condition) {
    // what to do if condition is true
}
else if(2nd condition) {        
    // what to do if 2nd condition is true
}
// ... can have 0 to many else-if statements ...
else {                           
    // what to do if none of the previous conditions are met
} // can have 1 or no else statementcopy
```
## If / Else Statements

```java
boolean isRaining = true;
    
if(isRaining) {
    System.out.println("Bring an umbrella.");
}
else {
    System.out.println("Have fun!");
}
```

## If /Else If / Else Statements
```java
boolean isRaining = true;
boolean isCold = true;
    
if(isRaining) {
    System.out.println("Bring an umbrella.");
}
else if(isCold) {
    System.out.println("Wear a coat.");
}
else {
    System.out.println("Have fun!");
}
```

## A few things to remember:
A condition must always evaluate to a boolean value, true or false
If the condition is true, it will execute the block of code between the curly braces { ... } , then skip any other else if or else statements in that chain and keep going.
If the condition is false, it will skip that block of code { ... } but continue to the code immediately following that block which may be another else if or else statement.
Assignment Operator vs Comparison Operators
As a programmer, you will often mistakenly type a = where you meant to type a == , but don't feel bad, seasoned developers do this from time to time, they just get faster and faster at catching it when things break. Let's review the assignment operator, = or what you might call the SET AS operator vs. all the comparison operators.

Operator	Description	Example
=	assignment operator	int count = 1; // assigns a value
Comparison Operators
Remember, conditional statements evaluate to boolean values (true or false). Here is a table of the comparison operators you can use.

Operator	Description	Examples
==	equal	int count = 1; // assigns a value
count == 1; // evaluates to true
count == 2; // evaluates to false
!=	not equal	count != 2; // true
count != 1; // false
>	greater than	count > 2; // false
count > 0; // true
<	less than	count < 2; // true
count < 1; // false
>=	greater than or equal to	count >= 2; // false;
count >= 1; // true
<=	less than or equal to	count <= 2; // true;
count <= 1; // true
Logical Operators
Operator	Description	Example
&&	AND - Both conditions must be true to be true	
int age = 45;
    
age < 65 && age > 17; 
// evaluates to true
//(Would pay adult price)
    
age < 110 && age > 65; 
// false
// (Is not a senior, nor immortal)copy
||	OR - One of the conditions must be true	
int age = 77;
age < 10 || age > 65;
// true
// (Doesn't care what people think!)copy
!	NOT	
int age = 16;
!(age < 16)
// true
// (May obtain a drivers license)copy
Try it out for yourself!

- [Main.java](./Main.java)
Use this playground to run the code and experiment!
You can also always run the code locally in VS Code!
Review the objectives listed at the top and try out those skills, but don't spend more than 5 minutes.