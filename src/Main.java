import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào value để tìm kiếm: ");
        int value = scanner.nextInt();
        int[] arr = new int[]{1, 2, 5, 9, 8, 3, 4, 100, 3, 4, 8, 0, 11, 111, 444, 5, 777, 999, 10000, 888,999,22,2222,3333,444,7777,0000,6666,77};
        Arrays.sort(arr);
        System.out.println("sau khi sap xep " + Arrays.toString(arr));
        long start = System.nanoTime();
        int low = 0;
        int hight = arr.length - 1;
        if (binarySearchRecursive(arr, low, hight, value) == -1){
            System.out.println("Not Found!");
        }else {
            System.out.println("Tìm thấy value: "+ value + "ở vị trí: "+ binarySearchRecursive(arr, low, hight, value));
        }
        long end = System.nanoTime();
        System.out.println("Time: "+(end - start));
    }
    public static int binarySearchRecursive(int arr[], int low, int high, int value) {
        if (high >= low) {

            int mid = low + (high - low) / 2;
            if (arr[mid] == value){
                return mid;
            }
            if (arr[mid] > value){
                return binarySearchRecursive(arr, low, mid - 1, value);
            }
            return binarySearchRecursive(arr, mid + 1, high, value);
        }
        return -1;
    }

}
