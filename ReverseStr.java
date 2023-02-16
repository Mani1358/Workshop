package com.blz.Workshop;

public class ReverseStr {
    public static void main(String[] args) {
        String [] str = {"Mani","Navi","Vamshi"};
        System.out.println("The reversed output is: ");
        ReverseStr.reverse(str);
    }
    public static void reverse(String str[]){
        String strReverse [] = new String[str.length];
        for(int i =0;i<str.length;i++){
            strReverse[i] = "";
            for(int j = str[i].length()-1;j>=0;j--){
                strReverse[i] = strReverse[i]+str[i].charAt(j);
            }
            System.out.println(strReverse[i]);
        }
    }
}
