package Day17_DataStructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Utility_Datastructure {

    private static BufferedReader bufferReader;

    public static String readFromFile(String filename) {
        try {
            bufferReader = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException e) {
            System.out.println("Error in Loading Reader" + e.getMessage());
        }
        StringBuilder sb = new StringBuilder();

        try {
            String line;
            while ((line = bufferReader.readLine()) != null) // append until file pointer reaches to null
                sb.append(line);

        } catch (IOException e) {
            System.out.println("File is Empty:  " + e.getMessage());
        } finally {
            try {
                bufferReader.close();
            } catch (IOException e) {
                System.out.println(e.getStackTrace());
            }
        }
        return sb.toString();
    }
//******************************************************************************************

    public static int[] bubbleSort(int[] arr, int arrLength) {
        System.out.println("Before Sorting");
        // prints the array before sorting
        for (int i = 0; i < arrLength; i++)
            System.out.print(arr[i] + " ");

        System.out.println("\nAfter Sorting\n____________________________________\n");
        for (int i = 0; i < arrLength - 1; i++) {
            /*
             * this loop will execute i-1 times as the last index will be stored in 'i' we
             * compare 'jth index' with the next index for sorting
             */
            for (int j = 0; j < arrLength - i - 1; j++) {
                int temp;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
