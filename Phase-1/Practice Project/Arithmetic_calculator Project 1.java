import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class Arithmetic_calculator {
  
    public static void main(String[] args)
    {
       
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("Enter the operator (+,-,*,/)");
        char op = sc.next().charAt(0);
        int output = 0;
        switch (op) {
        
        case '+':
  
            output = num1 + num2;
            System.out.println("The final result:");
            System.out.println();
            System.out.println(num1 + " " + op + " " + num2
                    + " = " + output);
  
            break;
  
      
        case '-':
  
            output = num1 - num2;
            System.out.println("The final result:");
            
            System.out.println();
            System.out.println(num1 + " " + op + " " + num2
                    + " = " + output);
  
            break;
  
      
        case '*':
  
            output = num1 * num2;
            System.out.println("The final result:");
            
            System.out.println();
            System.out.println(num1 + " " + op + " " + num2
                    + " = " + output);
  
            break;
  
        
        case '/':
  
            output =(num1 / num2);
            System.out.println("The final result:");
            
            System.out.println();
            System.out.println(num1 + " " + op + " " + num2
                    + " = " + (float)output);
  
            break;
  
        default:{
  
            System.out.println("You enter wrong input!!");
  
            break;
        }
        }
  
    }
}