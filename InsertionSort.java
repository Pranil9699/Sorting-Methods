
// This is Insertion Sort Program
import java.util.Scanner;

class InsertionSort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Element Count ");
            int size = sc.nextInt();
            int[] arr = new int[size];
            // Get The Element in The Array
            GetArray(arr);
            // Performing The Insertion Sort Operation In The Array
            InsertionSortOper(arr);
            // Show The Result In of The Array
            ShowArray(arr);
        }
    }

    public static void GetArray(int Array[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter " + Array.length + " Element In Array");
            for (int i = 0; i < Array.length; i++)
                Array[i] = sc.nextInt();
        }
    }

    public static void ShowArray(int Array[]) {
        for (int i : Array)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void InsertionSortOper(int Array[]) {
        for (int i = 1; i < Array.length; i++) {
            int current = Array[i];
            int j = i - 1;
            while (j >= 0 && current < Array[j]) {
                Array[j + 1] = Array[j];
                j--;
            }
            Array[j + 1] = current;
        }
    }
}
