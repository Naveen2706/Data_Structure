package day17algorithmprogram;

public class BubbleSort {

    public static void main(String[] args) {
        Utility utility = new Utility();

        System.out.println("\n Enter the number of elements you want to insert");
        int n = utility.getInt();

        System.out.println("\n Enter Elements :");
        int arr[] = utility.readArray(n);

        System.out.println("\nUnsorted List is \n");
        utility.printArray(arr);
        arr = Utility.bubbleSort(arr);
        System.out.println("\n \nSorted List is \n");
        utility.printArray(arr);
    }
}
