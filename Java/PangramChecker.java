package Java;

import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine().toLowerCase();
        boolean[] isAlphabetPresent = new boolean[26];
        int index;
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                index = ch - 'a';
                isAlphabetPresent[index] = true;
            }
        }
        boolean isPangram = true;
        for (int i = 0; i < 26; i++) {
            if (!isAlphabetPresent[i]) {
                isPangram = false;
                break;
            }
        }
        if (isPangram) {
            System.out.println("The input string is a pangram.");
        } else {
            System.out.println("The input string is not a pangram.");
        }
    }
}
