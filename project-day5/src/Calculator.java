import java.util.Scanner;

public class Calculator {
    public static int sum(int num1 , int num2){
        System.out.println(num1+num2);
        return num1+num2;
    }
    public static int mine(int num1 , int num2){
        System.out.println(num1-num2);
        return num1-num2;
    }
    public static int mul(int num1 , int num2){
        System.out.println(num1*num2);
        return num1*num2;
    }
    public static int div(int num1 , int num2){
        System.out.println(num1/num2);
        return num1/num2;
    }
    public static int mod(int num1 , int num2){
        System.out.println(num1%num2);
        return num1%num2;
    }
    public static int min(int num1 , int num2){
        int tempp=0;
        if(num1<num2){
            System.out.println(num1);
            tempp=num1;
        }
        else {
            System.out.println(num2);
            tempp=num2;
        }
        return tempp;
    }
    public static int max(int num1 , int num2){
        int tempp=0;
        if(num1>num1){
            System.out.println(num1);
            tempp=num1;
        }
        else {
            System.out.println(num2);
            tempp=num2;
        }
        return tempp;
    }
    public static int avg(int num1 , int num2){

        int sum = num1+num2;
        int temp = sum/2;
        System.out.println(temp);
        return temp;
    }

    }

