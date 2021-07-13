package Utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Utility {
    Scanner scanner;

    public Utility() {
        scanner = new Scanner(System.in);
    }

    public void readWordfromfile() {
        try {
            File file = new File("C:\\Users\\HP\\IdeaProjects\\DataStructures\\src\\com\\bridgelabz\\datastructuresprograms\\datastructure.txt");
            BufferedReader buffer = new BufferedReader(new FileReader(file));
            String words = buffer.readLine();
            System.out.println(words);
        } catch (Exception e){
            System.out.println("File Not Found!");

        }
    }
}
