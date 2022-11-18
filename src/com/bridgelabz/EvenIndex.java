package com.bridgelabz;

public class EvenIndex {
    static void evenIndexElements(int[] arr){
        for (int i=0; i<arr.length; i++){
            if(i % 2 == 0){
                System.out.println(arr[i]);
            }

        }
    }
    public static void main(String[] args) {
        int[] arr1 = {4,5,1,2,6,7,9,3};
        evenIndexElements(arr1);
    }
}
