Simple Calculator Application
This Java application consists of a simple calculator that allows users to perform basic arithmetic operations such as addition, subtraction, multiplication, and division. The application uses two main components: the SimpleCalculator class for handling calculations, and the App class, which provides a user interface through the console.

Components
1. SimpleCalculator Class
This class defines the basic operations of the calculator and includes methods for:

Addition: Adds two numbers.
Subtraction: Subtracts one number from another.
Multiplication: Multiplies two numbers.
Division: Divides one number by another (no handling for division by zero).
Methods:
add(float n1, float n2): Returns the sum of n1 and n2.
subtract(float n1, float n2): Returns the result of n1 - n2.
multiply(float n1, float n2): Returns the product of n1 * n2.
divide(float n1, float n2): Returns the result of n1 / n2. Note: no error handling for division by zero.

Example Usage:

SimpleCalculator sc = new SimpleCalculator();
float result = sc.add(10.5f, 5.2f);
System.out.println("Result: " + result);

2. App Class
This class provides the user interface for interacting with the calculator via the console. It allows users to choose an arithmetic operation and input two numbers. The selected operation is then executed using the methods from the SimpleCalculator class.

Flow:
The program displays a menu with options:
1: Addition
2: Subtraction
3: Multiplication
4: Division
The user selects the desired operation.
The user inputs two numbers for the calculation.
The program displays the result of the selected operation.

Example Menu:

*-* MENU *-*
1 - Addition
2 - Subtraction
3 - Multiplication
4 - Division
Operation: 1

After selecting an operation, the program will prompt for two numbers and display the result.

Example Usage:

App.main(new String[]{});

Sample Output:

*-* MENU *-*
1 - Addition
2 - Subtraction
3 - Multiplication
4 - Division
Operation: 1
N1: 5.5
N2: 4.3
Result: 9.8

How to Run
Requirements
Java JDK installed (version 8 or higher recommended).
Compilation
Compile the Java files using an IDE or via the command line:

javac SimpleCalculator.java App.java

Execution
Run the program:

java App


Follow the prompts in the console to select an operation and enter two numbers.
License
This project is licensed under the MIT License.
