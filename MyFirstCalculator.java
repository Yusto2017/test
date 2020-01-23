import java.util.*;
import java.util.Scanner;
class MyFirstCalculator {
public static void main(String[] args) {
    int num1 = 0;
    int num2 = 0;
    char operator;
    double answer = 0.0;



    Scanner scanObject = new Scanner(System.in);
    System.out.println("Please enter number: ");
    num1 = scanObject.nextInt();

    System.out.println("Please enter number: ");
    num2 = scanObject.nextInt();
    
    //This is the code for the operator needed
    System.out.print("Enter an operator (+, -, /, *): ");

    operator = scanObject.next().charAt(0);
    

    //This line of code defines the switch statement 
    switch(operator) {
        case '+': answer = num1 + num2;
                        break;
        case '-': answer = num1 - num2;
                        break;
        case '*': answer = num1 * num2;
                        break;
        case '/': answer = num1/num2;
                        break;

                    //Return error message if wrong operator is entered 
                        default:
                        System.out.printf("You hav entered a wrong operand: ");
                        return;


                     
        }
// this line of code outputs the answer 

System.out.println(num1+" "+operator+" "+num2+": "+answer);
}
}