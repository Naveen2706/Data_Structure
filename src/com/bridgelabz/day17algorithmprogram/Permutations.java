package day17algorithmprogram;

import java.util.ArrayList;
import java.util.Scanner;

public class Permutations {
    static String[] permutIteration(String str2) {
        ArrayList<String> arl = new ArrayList<>();
        for (int i = 0; i < str2.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                String str1 = str2;
                System.out.println(i + " " + j);
                System.out.println(swap(str1, i, j));
            }
        }
        return arl.toArray(new String[arl.size()]);
    }

    static String swap(String str1, int i, int j) {

        char[] ch = str1.toCharArray();
        char temp;
        temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return new String(ch);
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter a string");
            String str1 = scanner.nextLine();
            permutIteration(str1);
        } catch (Exception e) {
            System.out.println("enter correct input");
        }
    }
}
