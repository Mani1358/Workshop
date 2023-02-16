package com.blz.Workshop;

public class Problem4 {
    public static void main(String[] args) {
        Problem4 m = new Problem4();
        int[] array = new int[100];
        System.out.print("The original Array Numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Prime Numbers in Array: ");
       m.primeNumber(array);
    }
    public static void primeNumber(int [] array){
        int [] prime = new int[array.length];
        for(int i = 2;i< array.length;i++){
            int count = 0;
            for(int j = 0;j<=i;j++){
                if(array[i]%array[j] == 0){
                    count++;
                }
            }
            if(count <= 2){
                prime[i] = array[i];
            }
        }
        System.out.print(2+" ");
        for(int a :prime){
            if(a!=0){
                System.out.print(a+" ");
            }
        }
    }
}
