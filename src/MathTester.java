import java.util.Scanner;

public class MathTester {


    public static void main (String [] args ){

        Scanner sc = new Scanner(System.in);

        String firstWord;
        String secondWord;
        int firstNumber, secondNumber, total;
        double height,weight,inches,meters,bmi;

        firstWord = "dog";
        secondWord = "house";

        firstNumber = 5;
        secondNumber = 10;
        System.out.println("What is your height in feet?");
        height = sc.nextDouble();

        System.out.println("What is your height in inches?");
        inches = sc.nextDouble();

        System.out.println("What is your weight in pounds?");
        weight = sc.nextDouble();

        bmi = ((weight*703/height));

        /*total = firstNumber + secondNumber;
        System.out.println(total);
        total = total + 10;
        System.out.println(total);

        System.out.println(firstWord + secondWord);
        System.out.println(firstWord + (firstNumber + secondNumber));
        System.out.println("firstNumber + secondNumber is " + (firstNumber + secondNumber));
        System.out.println("firstNumber - secondNumber is " + (firstNumber - secondNumber));
        System.out.println("secondNumber / firstNumber is " + (secondNumber / firstNumber));
        System.out.println("firstNumber * secondNumber is " + (firstNumber * secondNumber));
        System.out.println("The modulus of the secondNumber by the firstNumber is " + (secondNumber%firstNumber));
        System.out.println(total);*/

        System.out.println("Your BMI is " + bmi);





        /*BMI = kg/m*m
        m = inch * (0.0254meters?1inch)
        inch = m*(1inch/0.0254meters)

        What is you height (only feet?)
        feet = sc.nextLine
        What is your height (only inches?)
        inches = user's input
        inches = inches + (feet*12)

        What is your height in inches? = User's input
        inches = user's input


         System.out.println("What is your height?");
        height = sc.nextDouble();
        System.out.println("What is your weight?");
        weight = sc.nextDouble();


        */

    }



}
