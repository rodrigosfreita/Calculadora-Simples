package Methods.SimpleCalculator;

import java.util.Scanner;

/**
 * 
 * Simple Calculator
 * 
 * Operational Methods
 * - add(float n1, float n2): float
 * - subtract()
 * - multiply()
 * - divide()
 *
 */

public class SimpleCalculator {

    private Scanner input;

    public int menu() {
        input = new Scanner(System.in);
        System.out.println("*-* MENU *-*");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.println("Operation: ");
        int op = input.nextInt();
        return op;
    }

    public float add(float n1, float n2) {
        System.out.println("*-* ADD *-*");
        float result = n1 + n2;
        return result;
    }

    public float subtract(float n1, float n2) {
        System.out.println("*-* SUBTRACT *-*");
        return n1 - n2;
    }

    public float multiply(float n1, float n2) {
        System.out.println("*-* MULTIPLY *-*");
        return n1 * n2;
    }

    public float divide(float n1, float n2) {
        System.out.println("*-* DIVIDE *-*");
        return n1 / n2;
    }
}

