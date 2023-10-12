package Java;

import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase();
        int decimal = 0;
        char[] romanNumeralChars = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] romanNumeralValues = {1, 5, 10, 50, 100, 500, 1000};
        for (int i = 0; i < romanNumeral.length(); i++) {
            char ch = romanNumeral.charAt(i);
            int index = -1;
            for (int j = 0; j < romanNumeralChars.length; j++) {
                if (romanNumeralChars[j] == ch) {
                    index = j;
                    break;
                }
            }
            if (index != -1) {
                decimal += romanNumeralValues[index];
            }
        }
        System.out.println("The integer value of " + romanNumeral + " is " + decimal);
    }
}
