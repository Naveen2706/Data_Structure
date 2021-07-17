package day17algorithmprogram;

public class Anagram {

    public static void main(String[] args) {

        Utility utility = new Utility();

        System.out.println("Enter Two strings");

        String str1 = utility.getLine();
        String str2 = utility.getLine();

        boolean status = utility.isAnagram(str1, str2);
        if (status == true) {
            System.out.println("the strings are anagram");
        } else {
            System.out.println("the strings are not anagram");
        }
    }
}
