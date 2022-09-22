import java.util.Scanner;

class SelectionSort{
public static void main(String[] args){
try (Scanner sc = new Scanner(System.in)) {
    System.out.println("Enter the Element Count in the arr");
    int size=sc.nextInt();
    int[] arr = new int[size];
    // Get element of arr
    Getarr(arr);
    // Performing the Selection Sort Operation On this arr
    SelectionSortOperation(arr);
    // Showing the Result of arr
    Showarr(arr);
}
}
public static void Getarr(int arr[]){
try (Scanner sc = new Scanner(System.in)) {
    System.out.println("Enter "+arr.length+" Element In arr");
    for(int i = 0 ; i < arr.length; i++){
    arr[i]=sc.nextInt();
    }
}
}
public static void Showarr(int arr[]){
System.out.println("Enter "+arr.length+" Element In arr");
for(int i = 0 ; i < arr.length; i++)
System.out.print(arr[i]+" ");
System.out.println();
}
public static void SelectionSortOperation(int arr[]){
for(int i = 0 ; i < arr.length-1; i++ ){
int Smallpos=i;
for(int j = i+1 ; j < arr.length; j++ ){
if(arr[Smallpos]>arr[j]){
Smallpos = j;
}
}
int temp = arr[Smallpos];
arr[Smallpos]= arr[i];
arr[i]=temp;
}
}
}
// Time Compalacity is O(n^2)
