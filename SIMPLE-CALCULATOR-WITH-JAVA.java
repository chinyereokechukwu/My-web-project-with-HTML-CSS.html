
package simple.calculator;
//author @ chinyere okechukwu

import java.util.Scanner;
public class SIMPLECALCULATOR {

   
    public static void main(String[] args) {
  

    int num1;
    int num2;
    String operation;

    Scanner input = new Scanner(System.in);

    System.out.println("Please Enter The First Number");
    num1 = input.nextInt();
    
     System.out.println("Please Enter The Operation");
    operation = input.next();

    System.out.println("Please Enter The Second Number");
    num2 = input.nextInt();
    double answer = 0;
        switch (operation) {
            case "+":
                answer = num1 + num2;
                break;
            case "-":
                answer = num1 - num2;
                break;
            case "*":
                answer = num1 * num2;
                break;
            case "/":
                answer = (double) num1 / num2;
                break;
            default:
                break;
        }
        System.out.println("Your Answer is "+ answer);
    
}
}