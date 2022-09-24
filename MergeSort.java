
import java.util.Scanner;

class MergeSort {
	public static void GetArray(int[] Array) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter " + Array.length + " Element In the Array");
			for (int i = 0; i < Array.length; i++) {
				Array[i] = sc.nextInt();
			}
		}
	}

	public static void ShowArr(int[] Array) {
		System.out.println("Array is ");
		for (int i = 0; i < Array.length; i++) {
			System.out.print(" -> "+ Array[i] );
		}
		System.out.println();
	}

	// Time Compacity is here O(n)

	public static void MergeCollect(int[] Array, int s, int mid, int e) {
		int MergeArr[] = new int[e - s + 1];

		int idx1 = s;
		int idx2 = mid + 1;
		int x = 0;

		while (idx1 <= mid && idx2 <= e) {
			if (Array[idx1] <= Array[idx2]) {
				MergeArr[x++] = Array[idx1++];
			} else {
				MergeArr[x++] = Array[idx2++];
			}
		}
		while (idx1 <= mid) {
			MergeArr[x++] = Array[idx1++];
		}
		while (idx2 <= e) {
			MergeArr[x++] = Array[idx2++];
		}
		for (int i = 0, j = s; i < MergeArr.length; i++, j++)
			Array[j] = MergeArr[i];
	}

	// Time Compacity is here n log n
	public static void MergeSortOper(int[] Array, int s, int e) {
		if (s >= e) {
			return;
		}
		int mid = s + (e - s) / 2;
		MergeSortOper(Array, s, mid);
		MergeSortOper(Array, mid + 1, e);
		MergeCollect(Array, s, mid, e);
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter How Many Element in Array ");
			int count = sc.nextInt();
			int[] Arr = new int[count];
			// GetArray() for geting the Element in array
			GetArray(Arr);
			// Performing the Merge Sort Operation On that Array
			MergeSortOper(Arr, 0, count - 1);
			// Show the Result Of the Array
			ShowArr(Arr);
		}
	}
}
