package algorithms.strings;

import java.util.Scanner;

public class CamelCase {

    private static void findWords(String word) {
        String[] words = word.split("[A-Z]");
        for (String s : words) {
            System.out.println(s);
        }
        System.out.println(words.length);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        findWords(s);
    }
}
