import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
       printArray();
       System.out.println(operation(1));
       System.out.println(operation(0));
       System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 7, 3, 4, 5, 6}));
       calculateSumOfDiagonalElements();
       foobar(6);
       foobar(10);
       foobar(15);

    }
    private static void printArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число ");
        int num = scanner.nextInt();
        int [] array = new int[num];
        Random random= new Random();
        for(int i=0;i<array.length;i++){
            array [i]=random.nextInt();
            System.out.println(array[i]);
        }

    }
    public static int operation (int number) {
       // Scanner scanner = new Scanner(System.in);
       // System.out.print("Введите число ");
       // number = scanner.nextInt();
        if(number>0){
            number++;
        }
        if(number<0){
            number=number -2;
        }
        if(number == 0){
            number= 10;
        }
        return number;
    }
    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        int count=0;
        for (int anInt : ints) {
            if (anInt % 2 != 0) {
                count = count + 1;
            }

        }
        return count;
    }
    public static void calculateSumOfDiagonalElements() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число num1 ");
        int num1 = scanner.nextInt();
        System.out.print("Введите число num2 ");
        int num2 = scanner.nextInt();
        int [] [] array = new int[num1][num2];
        Random random= new Random();
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
            array [i] [j]=random.nextInt();
             System.out.print(array[i][j] + " ");
            }
            System.out.println ();
                                            }
        int sum=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if (i==j){
                    sum=sum+array[i][j];
                }

            }
        }
        System.out.println(sum);
    }
    public static void foobar(int number) {

        if(number % 3 == 0 & number % 5 == 0){
            System.out.println("foobar");}
        if(number % 3 == 0){
            System.out.println("foo");}
        if(number % 5 == 0) System.out.println("bar");
    }
               }

