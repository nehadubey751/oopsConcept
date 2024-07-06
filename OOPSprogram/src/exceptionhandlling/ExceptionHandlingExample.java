package exceptionhandlling;

import java.util.Scanner;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
            int result = divide(num1, num2);
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) 
        {
            System.out.println("Division by zero is not allowed.");
        } catch (Exception e) 
        {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally
        {
            scanner.close();
            System.out.println("Scanner closed.");
        }
    }

      
	public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
}

