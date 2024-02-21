package com.example.demo;

public class Calculation {
    public static double calculatorUnaryDouble(double number1, String operator) {
        switch (operator) {
            case "sqrt":
                return Math.sqrt(number1);
            case "sin":
                return Math.sin(number1);
            case "cos":
                return Math.cos(number1);
            case "tan":
                return Math.tan(number1);
            case "e^x":
                return Math.exp(number1);
            case "log":
                return Math.log10(number1);
            case "ln":
                return Math.log(number1);
            case "x^2":
                return Math.pow(number1, 2);
            case "x^3":
                return Math.pow(number1, 3);
            case "!x":
                /*long result = 1;
                for(int i = 1; i <= number1; i++) {
                    result = result * i;
                }
                return result;*/
                return factorial((int) number1);

            default:
                break;
        }
        return 0;
    }


    public static double calculatorBinaryDouble(double number1, double number2,String operator) {
        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "/":
                if (number2 == 0) {
                    return 0;
                }
                return number1/number2;
            case "*":
                return number1 * number2;
            case "mod":
                return number1 % number2;
            case "x^y":
                return Math.pow(number1, number2);
            default:
                break;
        }
        return 0;
    }


    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
