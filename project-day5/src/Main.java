import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
 try {


        Scanner inp = new Scanner(System.in);

        int temp =0;
        ArrayList <Integer> result =new ArrayList<Integer>();
        System.out.println("Enter 1 to addition the numbers" +
                "\n" +
                "Enter 2 to subtraction the numbers" +
                "\n" +
                "Enter 3 to multiplication the numbers" +
                "\n" +
                "Enter 4 to division the numbers" +
                "\n" +
                "Enter 5 to modulus the numbers" +
                "\n" +
                "Enter 6 to find minimum number" +
                "\n" +
                "Enter 7 to find maximum number" +
                "\n" +
                "Enter 8 to find the average of numbers" +
                "\n" +
                "Enter 9 to print the last result in calculator" +
                "\n" +
                "Enter 10 to print the list of all results in calculator");
        int a = inp.nextInt();
        while(true){
            if(a==1){
                System.out.println("first number !");
                int num1 =inp.nextInt();
                System.out.println("second number !");
                int num2= inp.nextInt();
                temp =Calculator.sum(num1,num2);
                result.add(temp);
                System.out.println("enter the from 1 to 10");
                a = inp.nextInt();
            }
            if(a==2){
                System.out.println("first number !");
                int num1 =inp.nextInt();
                System.out.println("second number !");
                int num2= inp.nextInt();
                temp =Calculator.mine(num1,num2);
                result.add(temp);
                System.out.println("enter the from 1 to 10");
                a = inp.nextInt();
            }
            if (a==3){
                System.out.println("first number !");
                int num1 =inp.nextInt();
                System.out.println("second number !");
                int num2= inp.nextInt();
                temp =Calculator.mul(num1,num2);
                result.add(temp);
                System.out.println("enter the from 1 to 10");
                a = inp.nextInt();
            }
            if (a==4){
                System.out.println("first number !");
                int num1 =inp.nextInt();
                System.out.println("second number !");
                int num2= inp.nextInt();
                temp =Calculator.div(num1,num2);
                result.add(temp);
                System.out.println("enter the from 1 to 10");
                a = inp.nextInt();
            }
            if (a==5){
                System.out.println("first number !");
                int num1 =inp.nextInt();
                System.out.println("second number !");
                int num2= inp.nextInt();
                temp =Calculator.mod(num1,num2);
                result.add(temp);
                System.out.println("enter the from 1 to 10");
                a = inp.nextInt();
            }
            if (a==6){
                System.out.println("first number !");
                int num1 =inp.nextInt();
                System.out.println("second number !");
                int num2= inp.nextInt();
                temp =Calculator.min(num1,num2);
                result.add(temp);
                System.out.println("enter the from 1 to 10");
                a = inp.nextInt();
            }
            if(a==7){
                System.out.println("first number !");
                int num1 =inp.nextInt();
                System.out.println("second number !");
                int num2= inp.nextInt();
                temp =Calculator.max(num1,num2);
                result.add(temp);
                System.out.println("enter the from 1 to 10");
                a = inp.nextInt();
            }
            if(a==8){
                System.out.println("first number !");
                int num1 =inp.nextInt();
                System.out.println("second number !");
                int num2= inp.nextInt();
                temp =Calculator.avg(num1,num2);
                result.add(temp);
                System.out.println("enter the from 1 to 10");
                a = inp.nextInt();
            }
            if(a==9){
                System.out.println(result.get(result.size() - 1));
                System.out.println("enter the from 1 to 10");
                a = inp.nextInt();
            }
            if(a==10){
                System.out.println(result);
                break;
            }
        }
    }catch (ArithmeticException e2){
    System.out.println("you can not division by zero !");
}
 catch (InputMismatchException e1){
     System.out.println("you can not enter a string !");
 }

 }
}