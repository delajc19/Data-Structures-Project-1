/**
 * Joseph de la Viesca
 * CSC 201
 * Project 1 Problem 3
 * 1/29/22
 */
import java.util.*;

public class Problem3 {

    /**
     * printArray
     * Prints an array's elements separated by spaces on one line
     * @param arr
     */
    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    /**
     * decreasingOrder
     * Sorts an array of integers in decreasing order
     * @param arr
     */
    public static void decreasingOrder(int[] arr){
        int temp;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr.length == 0){
                    break;
                }
                else if(j < arr.length - 1){
                    if(arr[j] == arr[j+1]){
                        continue;
                    }
                    else if(arr[j] < arr[j+1]){
                        temp = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }
    public static void main(String[] args){
        Random rand = new Random();
        int N = 10; //Array Size
        int arr[] = new int[N];
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(99);
        }

        //Print array for debugging
        printArray(arr);

        System.out.println();
        decreasingOrder(arr);

        //Print array for debugging
        printArray(arr);
    }
}
