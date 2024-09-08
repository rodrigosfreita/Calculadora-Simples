package Methods.SimpleCalculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        SimpleCalculator sc = new SimpleCalculator();
        
        int op = sc.menu();
        
        System.out.println("N1: ");
        float n1 = input.nextFloat();
        System.out.println("N2: ");
        float n2 = input.nextFloat();
        
        if(op == 1) {
            float result = sc.add(n1, n2);
            System.out.println("Result: " + result);
        } else if(op == 2) {
            float result = sc.subtract(n1, n2);
            System.out.println("Result: " + result);
        } else if(op == 3) {
            float result = sc.multiply(n1, n2);
            System.out.println("Result: " + result);
        } else if(op == 4) {
            float result = sc.divide(n1, n2);
            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid operation!");
        }
    }
}

