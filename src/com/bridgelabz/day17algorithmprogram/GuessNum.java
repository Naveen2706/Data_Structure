package day17algorithmprogram;

import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        Utility u = new Utility();
        int low = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        int high = (int) Math.pow(2, n);
        u.guessANum(low, high);

    }

}
