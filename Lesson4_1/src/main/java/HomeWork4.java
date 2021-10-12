import java.util.Arrays;
import java.util.Scanner;

public class HomeWork4 {

    public static void main(String[] args) {
        //ameba();
        //summ();
        //getCountsOfDigits();
        // nechetmassvobrporadke();
        //massnechetindex ();
        // maxelemenindex();
        //masmaxnanull();
        //povtorelemmassiv();
        //transportmatrix ();
        vivodmatrix();
    }

    private static void ameba() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во часов h = ");
        int h = scanner.nextInt();
        int a = 1;
        for (int vremia = 3; vremia <= h; vremia = vremia + 3) {
            a = a * 2;
        }
        System.out.println(a);
    }

    private static void summ() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a = ");
        int a = scanner.nextInt();
        System.out.println("Введите b = ");
        int b = scanner.nextInt();
        int proiz = 0;
        for (int i = 1; i <= b; i++) {
            proiz = proiz + a;
        }
        System.out.println(proiz);
    }

    public static void getCountsOfDigits() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите number = ");
        long number = scanner.nextInt();
        int k = String.valueOf(Math.abs(number)).length();
        System.out.println(k);
        if (number > 0) {
            System.out.println(number + "_это положительное число, количество цифр =" + k);
        } else {
            System.out.println(number + "_это отрицательное число, количество цифр = " + k);
        }
    }

    public static void nechetmassvobrporadke() {
        int n = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) n++;
        }
        int[] array = new int[n];
        for (int i = 1, b = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                array[b] = i;
                System.out.print(array[b] + " ");
                b++;
            }
        }
        System.out.println(" ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static void maxelemenindex() {
        int[] array = new int[12];
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 15);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (max <= array[i]) {
                max = array[i];
                index = i;//  index=i+1  будет по условию задачи, но ведь счет начинаеься интексас 0
            }
        }
        System.out.println("Самое большое число " + max + " и индекс его последнего вхождения " + index);
    }

    public static void massnechetindex() {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));

    }

    public static void masmaxnanull() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите n = ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }
        System.out.println(Arrays.toString(array));
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (max <= array[i]) {
                max = array[i];
                index = i;
            }
        }
        System.out.println("Самое большое число " + max + "и индекс его" + index);
        int tepm = array[0];
        array[0] = max;
        array[index] = tepm;
        System.out.println(Arrays.toString(array));
    }

    private static void povtorelemmassiv() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите n = ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int[] array1 = new int[n];
        System.out.println("Введите элементы массива ");
        for (int i = 0; i < array.length; i++) {
            //array[i] = (int) (Math.random() * 50);
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        // boolean b = false;
        // boolean b;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array1[i] = array[i];
                    System.out.println("Массив имеет повторяющиеся элементы");
                    System.out.println(array[j]);
                } else {
                    System.out.println("Массив не имеет повторяющиеся элементы");
                }
            }

        }
    }

    private static void transportmatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите n = ");
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) (Math.random() * 50);
            }
        }
        System.out.println("Начальная матрица");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        System.out.println();
        System.out.println("Новая матрица");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
    }

    private static void vivodmatrix() {
        char[][] array = new char[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j < 0; j--) {
                while (i != j) {
                    array[i][j] = 1;
                    // System.out.printf("%3d", array[i][j]);
                }

            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
    }
}

