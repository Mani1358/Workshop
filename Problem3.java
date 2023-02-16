package com.blz.Workshop;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        String reversed = reverseString(str);

        System.out.println("Reversed string:" + reversed);

    }

    public static String reverseString(String str) {
        char[] inputArray = str.toCharArray();
        char[] reversedArray = new char[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            reversedArray[i] = inputArray[inputArray.length - i - 1];
        }
        return new String(reversedArray);
    }

}
