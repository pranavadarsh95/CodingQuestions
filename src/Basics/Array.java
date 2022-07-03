package Basics;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
       // Declare Array
        int array[][] = new int[3][];

        int arr1[] = new int[]{3,4};
        int arr2[] = {2,4,5,6,3,4};
        int arr3[] ={};

        array[0] = arr1;
        array[1] = arr2;
        array[2] = arr3;

        System.out.println(array[0].length+" "+array[1].length+" "+array[2].length);

        for(int i=0;i<array.length;i++){
                for(int j=0;j<array[i].length;j++) {

                    System.out.print(array[i][j]+" ");
                  }
                System.out.println();
                }
    }
}
