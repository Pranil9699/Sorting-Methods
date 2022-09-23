
// Quick Sort Operation
import java.util.Scanner;

class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element Count");
        int size = sc.nextInt();
        int[] Arr = new int[size];
        // Get The element In the Array
        GetArray(Arr);
        // Performing the QuickSort Operation On That Array
        QuickSortOper(Arr, 0, Arr.length - 1);
        // Showing The Result Of the Array
        ShowArray(Arr);

    }

    // get Method
    public static void GetArray(int Array[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + Array.length + " Elements In Array");
        for (int i = 0; i < Array.length; i++)
            Array[i] = sc.nextInt();// Scanner using get the element in array
    }

    // Show Method
    public static void ShowArray(int Array[]) {
        for (int i = 0; i < Array.length; i++)
            System.out.print(Array[i] + " ");
        System.out.println();
    }

    // QuickSort Method
    public static void QuickSortOper(int Array[], int Low, int High) {
        if (Low < High) {
            int Pidx = PartitionOper(Array, Low, High); // return the i value and the PArtetion is here

            QuickSortOper(Array, Low, Pidx - 1);
            QuickSortOper(Array, Pidx + 1, High);
        }

    }

    // Partetion Method(Important Method)
    public static int PartitionOper(int Array[], int Low, int High) {
        int Pivot = Array[High];
        int i = Low - 1;
        for (int j = Low; j < High; j++) {
            if (Array[j] < Pivot) {
                i++;
                // Swaping the Elements
                int Temp = Array[i];
                Array[i] = Array[j];
                Array[j] = Temp;
            }
        }
        i++;
        // Swaping the Elements
        int Temp = Array[i];
        Array[i] = Pivot;
        Array[High] = Temp;
        return i;
    }
}
