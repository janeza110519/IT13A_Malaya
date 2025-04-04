/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Basic_Calculator_Methods {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        
        System.out.println("Basic Calculator");
        System.out.print("Enter first number: ");
        double x = a.nextDouble();
        
        System.out.print("Enter an operator (+,-,*,/): ss");
        char operator = a.next().charAt(0);
        
        System.out.print("Enter second number: ");
        double y = a.nextDouble();
        
        double result;
        
        switch (operator){
            case '+': 
                result = x + y;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = x - y;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = x * y;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (y != 0){
                    result = x / y;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid Operator!");
                break;
            }
        a.close();
                
    }
}
