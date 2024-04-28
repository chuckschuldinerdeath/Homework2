import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Zadanie1("die", 5);
        System.out.println();

        Zadanie2();
        System.out.println();

        int[] array = new int[10];
        Zadanie3(array, 7);
        System.out.println(Arrays.toString(array));
        System.out.println();

        Zadanie4(7);
        System.out.println();

        Zadanie5();

    }

    public static void Zadanie1(String line, int Num) {
        for (int i = 0; i < Num; i++) {
            System.out.println(line);
        }
    }

    public static void Zadanie2() {
        int arr[] = {5, 6, 2, 8, 9, 7};
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                summ = summ + arr[i];
            }
        }
        System.out.println(summ);

    }

    public static void Zadanie3(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
    }

    public static void Zadanie4(int value4) {

        int[] arr = {6, 8, 9, 14, 15};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] += value4);
        }
    }

    public static void Zadanie5() {

        int[] arr5 = {2, 5, 6, 6, 8, 9, 1, 7};
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < 4; i++) {
            sum1 += arr5[i];
        }
        for (int j = 4; j < 8; j++) {
            sum2 += arr5[j];
        }
        if (sum1 > sum2) {
            System.out.println(sum1);
            System.out.println("первая половина больше");
        } else if (sum2 > sum1) {
            System.out.println(sum2);
            System.out.println("вторая половина больше");
        } else {
            System.out.println("равны");
        }
    }

}


