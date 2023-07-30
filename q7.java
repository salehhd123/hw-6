import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class q7 {
    public static void main(String[] args) {
        try {

            Scanner inp = new Scanner(System.in);
            System.out.println("enter the size of the array !");
            int num1 = inp.nextInt();
            int arr [] = new int [num1];
            int counter =0;
            System.out.println("1 Accept elements of an array\n" +
                    "2 Display elements of an array\n" +
                    "3 Search the element within array\n" +
                    "4 Sort the array\n" +
                    "5 To Stop");
            int num2 = inp.nextInt();
            while (num2!=5) {
                if (num2 == 1) {
                    if(counter==arr.length){
                        System.out.println("the array is fill !");
                        break;
                    }else {
                        System.out.println("enter the number that you want to add !");
                        int num3 = inp.nextInt();
                        arr[counter]= num3;
                        counter++;
                        System.out.println("1 Accept elements of an array\n" +
                                "2 Display elements of an array\n" +
                                "3 Search the element within array\n" +
                                "4 Sort the array\n" +
                                "5 To Stop");
                        num2 = inp.nextInt();
                    }
                }
                if (num2==2){
                    System.out.println(Arrays.toString(arr));
                    System.out.println("1 Accept elements of an array\n" +
                            "2 Display elements of an array\n" +
                            "3 Search the element within array\n" +
                            "4 Sort the array\n" +
                            "5 To Stop");
                    num2 = inp.nextInt();
                }
                if(num2==3){
                    System.out.println("enter the number you want search");
                    int num4 = inp.nextInt();
                    for (int i=0;i < arr.length;i++){
                        if(num4==arr[i]){
                            System.out.println("the number in the array !");
                        }
                        else System.out.println("the number is not in the array !");
                        System.out.println("1 Accept elements of an array\n" +
                                "2 Display elements of an array\n" +
                                "3 Search the element within array\n" +
                                "4 Sort the array\n" +
                                "5 To Stop");
                        num2 = inp.nextInt();
                    }
                }
                if(num2==4){
                    Arrays.sort(arr);
                    System.out.println("1 Accept elements of an array\n" +
                            "2 Display elements of an array\n" +
                            "3 Search the element within array\n" +
                            "4 Sort the array\n" +
                            "5 To Stop");
                    num2 = inp.nextInt();

                }

                if(num2>5 || num2<1){
                    System.out.println("you enter wrong number select from this list");
                    System.out.println("1 Accept elements of an array\n" +
                            "2 Display elements of an array\n" +
                            "3 Search the element within array\n" +
                            "4 Sort the array\n" +
                            "5 To Stop");
                    num2 = inp.nextInt();
                }
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e1){
    System.out.println("you can not enter a string !");}


        System.out.println("the code stop !");

    }
}