package com.bridgelabz;

public class LargestAndSmallest {
    static void elements(int[] arr){
        int largest = arr[0];
        int smallest =arr[0];

        for (int i=0; i<arr.length; i++){
            if(arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                    smallest = arr[i];
                }

        }
        System.out.println( "largest is" + largest);
        System.out.println("smallest is " + smallest);
    }
    public static void main(String[] args) {
        int[] arr1 = {5,7,1,9,3,6,4};
        elements(arr1);
    }
}
