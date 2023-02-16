package com.blz.Workshop;

import java.util.Scanner;

public class Problem5 {
    public static char[] chars = {'A', 'e', 'I', 'o', 'u', 'S'};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        sc.close();
        int count = countChars(str);
        System.out.println("The count of characters not in "+ new String(chars)+" :" +count);
    }

    public static int countChars(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            boolean found = false;
            for (int j = 0; j < chars.length; j++) {
                if (c == chars[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                count++;
            }
        }
        return count;
    }
}
