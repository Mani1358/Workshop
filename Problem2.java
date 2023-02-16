package com.blz.Workshop;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character to search for: ");
        char c = sc.next().toLowerCase().charAt(0);
        String[] array = new String[4];
        array[0] = "Delhi";
        array[1] = "Mumbai";
        array[2] = "Bangalore";
        array[3] = "pune";

        int count = countCharactersInArray(c, array);
        System.out.println("The character" + " " + c + " appears" + " " + count + "times in array");

    }

    public static int countCharactersInArray(char c, String[] array) {
        int count = 0;
        for (String s : array) {
            int i = 0;
            do {
                if (s.toLowerCase().charAt(i) == c) {
                    count++;
                }
                i++;
            } while (i < s.length());
        }
        return count;
    }
}
