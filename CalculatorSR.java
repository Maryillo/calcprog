import java.util.*;
import java.io.*;

public class CalculatorSR
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        int check = 0;
        double inp = 0;
        System.out.println("=========== Calculator (only supports + - / and *) ==============");
        System.out.println("Made by Sebastian Roman");
        while (check == 0)
        {
             System.out.print("Enter 1 to add, 2 to substract, 3 to multiply, 4 to divide, and 0 to exit");
            try{
            
            inp = input.nextDouble();
            if (inp == 0)
            {
                check=1;
            }else if  (inp == 1)
            {
                try{
                System.out.print("Enter number 1: ");
                num1 = input.nextDouble();
                System.out.print("Enter number 2: ");
                num2 = input.nextDouble();
                System.out.println(num1 + " + " + num2 + " = " + (num1+num2) );
            }catch(Exception e)
            {
                System.out.println("Error: input a number");
            }
            }
            else if  (inp == 2)
            {
                try{
                System.out.print("Enter number 1: ");
                num1 = input.nextDouble();
                System.out.print("Enter number 2: ");
                num2 = input.nextDouble();
                System.out.println(num1 + " - " + num2 + " = " + (num1-num2) );
            }catch(Exception e)
            {
                System.out.println("Error: input a number");
            }
            }
            else if  (inp == 3)
            {
                try{
                System.out.print("Enter number 1: ");
                num1 = input.nextDouble();
                System.out.print("Enter number 2: ");
                num2 = input.nextDouble();
                System.out.println(num1 + " * " + num2 + " = " + (num1*num2) );
            }catch(Exception e)
            {
                System.out.println("Error: input a number");
            }
            }else if  (inp == 4)
            {
                try{
                System.out.print("Enter number 1: ");
                num1 = input.nextDouble();
                System.out.print("Enter number 2: ");
                num2 = input.nextDouble();
                System.out.println(num1 + " / " + num2 + " = " + (num1/num2) );
            }catch(Exception e)
            {
                System.out.println("Error: input a number");
            }
            }else
           {
               System.out.println("Wrong input");
            }
        }catch(Exception e)
        {
            System.out.println("Wrong input");
        }
        }
        System.out.println("Thank you for using calculator. Application is now closed");
        
    }
}
