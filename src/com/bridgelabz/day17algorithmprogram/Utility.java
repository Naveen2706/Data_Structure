package day17algorithmprogram;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Utility {

    Scanner sc = new Scanner(System.in);

    // MergeSort
    public int[] mergeSort(int[] arr, int low, int high) {

        if (low < high) {
            int mid = low + ((high - low) / 2);
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
        return arr;
    }

    public void merge(int[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[low + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];


        int i = 0, j = 0;

        int k = low;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    /*
    Method for read 1D Integer array
    */

    public int[] readArray(int n) {
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = getInt();
        }
        return arr;
    }


    /* Method for Integer input*/

    public int getInt() {
        return sc.nextInt();
    }

    // Function to sort array using insertion sort
    public static String[] insertionSort(String arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            String key = arr[i];
            while (j >= 0 && key.compareTo(arr[j]) < 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    //Function to print the prime no between to 1 to 1000
    public static void prime() {
        System.out.println();
        boolean b;
        for (int j = 2; j <= 1000; j++) {
            b = true;
            for (int i = 2; i < j / 2; i++) {
                if (j % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b)
                System.out.print(j + " ");
        }
    }


    //check if given no is prime or not
    public static boolean isPrime(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (i % n == 0) {
                return false;
            }
        }
        return true;
    }

    //to check if prime is pallindrome and print it
    public static void primePallindrome() {
        System.out.println();
        boolean b;
        for (int j = 2; j <= 1000; j++) {
            b = true;
            for (int i = 2; i < j / 2; i++) {
                if (j % i == 0) {
                    b = false;
                    break;
                }
            }
        }
    }


//to check the two strings are anagrams or not

    public boolean isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase().replaceAll(" ", "");

        str2 = str2.toLowerCase().replaceAll(" ", "");

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        //boolean status= false;

        if (ch1.length != ch2.length) {
            return false;
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2)) {
            return true;
        } else {
            return false;
        }

    }

    /*
    Method for a string line input
    */
    public String getLine() {
        return sc.nextLine();
    }

    /*
     Method for print output on nextline
     */
    public void println(String str) {
        System.out.println(str);
    }

    /*
     Method for print 1d String Array
     */

    public void printArray(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" " + arr[i]);
        }
    }

/*
 Method for Integer input
 */

//	public int getInt(int arr[])
//	{
//		int n = sc.nextInt();
//		int[] array = new int[10];  
//		for(int i=0; i<n; i++)  
//		{  
//		//reading array elements from the user   
//		array[i]=sc.nextInt();  
//		}  
//	//	return arr];
//	}

    /*
    Method for print Int Array
    */

    public void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" " + arr[i]);
        }
        System.out.println("");
    }

    public static int[] bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public void guessANum(int low, int high) {

        int mid = (high + low) / 2;

        if (high <= low) {
            System.out.println("\n Is your number is even number :");
            char ch = getString().charAt(0);
            if (ch == 'Y' || ch == 'y') {

                System.out.println("\n Your number should be: " + high);

            } else {
                System.out.println("\n Your number should be: " + (low + 1));
            }
        } else {
            System.out.println("\n Is you number is between " + low + "-" + mid + " : ");
            char ch = getString().charAt(0);

            if (ch == 'y' || ch == 'Y') {
                guessANum(low, mid - 1);
            } else {
                guessANum(mid + 1, high);
            }
        }


    }

    /*
     Method for a single String input
     */
    public String getString() {
        return sc.next();
    }

    // 2--->Binary search
//		public static int binarySearch(List<Integer> list, int firstIndex, int lastIndex, int searchValue) {
//			if (lastIndex >= firstIndex) {
//				int mid = firstIndex + (lastIndex - firstIndex) / 2;
//
//				if (list.get(mid) == searchValue)
//					return mid;
//
//				if (list.get(mid) >= searchValue)
//					return binarySearch(list, firstIndex, mid - 1, searchValue);
//
//				return binarySearch(list, mid + 1, lastIndex, searchValue);
//			}
//			return -1;
//		}

    // TwoDimensional Array Creation
    public static void arrayTwoDimensional(int[][] array, int row, int col) {

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

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

    private static BufferedReader bufferReader;

    public static boolean isLeapYear(int year) {

        boolean leapYear = false;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            leapYear = true;
            return leapYear;
        } else {
            leapYear = false;
            return leapYear;
        }
    }
}
