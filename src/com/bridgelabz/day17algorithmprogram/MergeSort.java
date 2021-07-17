package day17algorithmprogram;

public class MergeSort {
    public static void main(String[] args) {
        Utility utility = new Utility();

        System.out.println("\n Enter the number of elements you want to insert");
        int n = utility.getInt();

        System.out.println("\n Enter Elements :");
        int arr[] = utility.readArray(n);

        System.out.println("\n Unsorted Array is :");
        utility.printArray(arr);

        System.out.println("\n Sorted Array is :");

        arr = utility.mergeSort(arr, 0, arr.length - 1);
        utility.printArray(arr);
    }
}
