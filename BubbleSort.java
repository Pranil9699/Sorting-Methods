import java.util.Scanner;

class BubbleSort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Element Count in the arr");
            int size = sc.nextInt();
            int[] arr = new int[size];
            // Get element of arr
            Getarr(arr);
            // Performing the Bubble Sort Operation On this arr
            BubbleSortOperation(arr);
            // Showing the Result of arr
            Showarr(arr);
        }
    }

    public static void Getarr(int arr[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter " + arr.length + " Element In arr");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
        }
    }

    public static void Showarr(int arr[]) {
        System.out.println("Enter " + arr.length + " Element In arr");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void BubbleSortOperation(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
