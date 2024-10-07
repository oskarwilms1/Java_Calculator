package kalkulator;

import java.util.Scanner;

public class Main {

    public static void main(String[] arguments){
        //Create a calculator
        Calculator Calc = new Calculator();
        //Create a scanner for user input
        Scanner user_input = new Scanner(System.in);
        boolean Running = true;
        boolean first_time = true;
        int variable1,variable2,choice;
        while (Running == true){
            if (first_time == true){
                System.out.println("Insert the first integer: ");
                variable1 = user_input.nextInt();
            }
            else{
                
                variable1 = Calc.getState();
                System.out.println("Your first integer is: "+variable1);
            }
            System.out.println("Insert the second integer: ");
            variable2 = user_input.nextInt();
            System.out.println("1 - Add, 2 - Substract, 3 - Multiply, 4 - Divide");
            choice = user_input.nextInt();
            Calc.setState(variable1);
            if (choice == 1){Calc.add(variable2);}
            if (choice == 2){Calc.substract(variable2);}  
            if (choice == 3){Calc.mult(variable2);}
            if (choice == 4){Calc.divide(variable2);}
            System.out.println("Final result: "+ Calc.getState());
            System.out.println("Do you wish to continue?\n 1 - Yes, 2 - No");
            choice = user_input.nextInt();
            if (choice == 2){
                Running = false;
                user_input.close();
            }
            first_time = false;
                
                
        }
    }
    
}
