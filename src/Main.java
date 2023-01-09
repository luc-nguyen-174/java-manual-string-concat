import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Nhập vào độ dài mảng 1:");
        int x = scanner.nextInt();
        System.out.print("Nhập vào độ dài mảng 2:");
        int y = scanner.nextInt();
        int[] arr1 = new int[x];
        int[] arr2 = new int[y];
        int[] arr3 = new int[x + y];

        System.out.println("Nhập vào các phần tử trong mảng 1.");
        for (int i = 0; i < x; i++) {
            System.out.print("Nhập vào phần tử tại vị trí" + i + ":");
            arr1[i] = scanner.nextInt();
        }

        System.out.println("Nhập vào các phần tử trong mảng 2.");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Nhập vào phần tử tại vị trí" + i + ":");
            arr2[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = arr1.length, j = 0; i < arr3.length; i++, j++) {
            arr3[i] = arr2[j];
        }
        System.out.println("Mảng mới sau khi nối 2 mảng cũ"+Arrays.toString(arr3));
    }
}