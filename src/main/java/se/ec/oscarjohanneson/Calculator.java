package se.ec.oscarjohanneson;

import java.util.Scanner;

public class Calculator {

    //Make it possible to read input data from user.
    static Scanner scanner = new Scanner(System.in);

    //Method to adding multiply numbers.
    static double addition(double... args){
        double result = 0;
        if (args != null) {
            for (double number : args) {
                result += number;
            }
        }
        return result;
        //return num1 + num2;
    }
    //Method to subtract number 1 and number 2.
    static double subtract(double num1, double num2){
        return num1 - num2;
    }
    //Method to multiply number1 and number2.
    static double multiply(double num1, double num2){
        return num1 * num2;
    }
    //Method to divide number1 and number2.
    static double divided(double num1, double num2){
        return (num1 / num2);
    }
    //Method to show menu.
    static void printMenu(){
        System.out.println("Welcome to a simple calculator. It will NOT make you smarter!\n");
        System.out.println("Make a selection:\n");
        System.out.println("1. Start the application");
        System.out.println("Q. Quit");
        System.out.print("Choice:");
    }
    //This is were the data from calculator is collected from user.
    static void runCalculator(){
        //declare variable number1, number2 and gives it data type double.
        double number1, number2;
        String operator;
        try {
            //Print Enter two numbers in console.
            System.out.println("\nEnter two numbers: ");
            //Receive value from user to store it in number1 and number2.
            System.out.print("Number 1:");
            number1 = Double.parseDouble(scanner.nextLine());
            System.out.print("Number 2:");
            number2 = Double.parseDouble(scanner.nextLine());
            System.out.print("Choose mathematical operation: + - * / : ");
            //Receive value from user to store it in operator.
            operator = scanner.nextLine();
            switch (operator) {
                case "+":
                    //Use method addition() and print the result in console.
                    System.out.println(number1 + " + " + number2 + " = " + addition(number1, number2));
                    System.out.print("\nContinuing by pressing Enter.\n");
                    //This will make the console wait for user to study the result and can continue by users input data.
                    scanner.nextLine();
                    break;
                case "-":
                    System.out.println(number1 + " - " + number2 + " = " + subtract(number1, number2));
                    System.out.println("\nContinuing by pressing Enter.\n");
                    scanner.nextLine();
                    break;
                case "*":
                    System.out.println(number1 + " * " + number2 + " = " + multiply(number1, number2));
                    System.out.println("\nContinuing by pressing Enter.\n");
                    scanner.nextLine();
                    break;
                case "/":
                    System.out.println(number1 + " / " + number2 + " = " + divided(number1, number2));
                    System.out.println("\nContinuing by pressing Enter.\n");
                    scanner.nextLine();
                    break;
                default:
                    System.out.println("\nWARNING!! You can only choose between + - * /. " + operator + " is not supported.");
                    runCalculator();
                    break;
            }
        }
        //Catch the exception and inform user what the problem was and send user back to runCalculator.
        catch (Exception e) {
            System.out.println("\nWARNING!!! You are only allowed to enter numbers.\n");
            runCalculator();
        }
    }


    public static void main(String[] args)  {
        boolean keepRun = true;
        //As long keepRun is true the program will continue.
        while(keepRun) {
            //Call method printMenu
            printMenu();
            //Get input data from user. Choose between start application or quit.
            String startQuit = scanner.nextLine();
            switch (startQuit) {
                case "1":
                    //Call method runCalculator.
                    runCalculator();
                    break;
                case "Q": case "q":
                    //If user enter Q or q as input application quits. keepRun = false and break the while-loop.
                    System.out.println("Quit....");
                    keepRun = false;
                    break;
                default:
                    System.out.println("\nYou have to choose 1 or Q\n");
            }
        }
    }
}


