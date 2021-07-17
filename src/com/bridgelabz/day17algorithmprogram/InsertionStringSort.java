package day17algorithmprogram;

public class InsertionStringSort {
    public static void main(String[] args) {

        Utility utility = new Utility();
        System.out.println("Enter Words for an array\n\n");
        String line = utility.getLine();
        String wordList[] = line.split(" ");
        System.out.println("\nUnsorted List is \n");
        utility.printArray(wordList);

        wordList = Utility.insertionSort(wordList);
        System.out.println("\n \nSorted List is \n");
        utility.printArray(wordList);
    }
}
