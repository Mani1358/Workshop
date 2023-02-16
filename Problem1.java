package com.blz.Workshop;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Enter the character to count: ");
        char ch = sc.next().charAt(0);
        int count = countCharacter(str, ch);
        if (count == 0) {
            System.out.println("The character" + ch + " " + "was not found in the string");
        } else {
            System.out.println("No of times " + ch + " " + "appears in the string: " + countCharacter(str, ch));
        }
    }

    public static int countCharacter(String input, char character) {
        int count = 0;

        char lowerCaseChar = Character.toLowerCase(character);
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == lowerCaseChar) {
                count++;
            }
        }
        return count;
    }
}
