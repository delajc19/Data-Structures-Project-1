/**
 * Joseph de la Viesca
 * CSC 201
 * Project 1 Problem 5
 * 2/9/22
 */
public class Problem5 {
    /**
     * search
     * Searches an array sorted in decreasing order by calling a helper function.
     * @param k Number to find
     * @param arr Array to search
     * @return Index of number. If array length < 0, then -1 is returned. 
     */
    public static int search(int k, int[] arr){
        if(arr.length > 0){        
            return searchHelper(arr, 0, arr.length - 1, k);
        }
        return -1;
    }

    /**
     * Binary search helper function for search function. If the middle index of the array is not the number to find,
     * the method is recursively called to search the lower half if the number to find is greater than the middle element,
     * or search the upper half if the number is less than the middle element.
     * @param arr Array to search
     * @param low Lower bound index of array partition being searched
     * @param high Upper bound index of array partition being searched
     * @param k Number to find
     * @return Index of number to find. If not found, returns -1.
     */
    public static int searchHelper(int[] arr, int low, int high, int k){
        if(high >= low){
            int mid = low + (high-low)/2;
            if(arr[mid] == k){
                return mid;
            }
            if(arr[mid] < k){
                return searchHelper(arr, low, mid - 1, k);
            }
            else{
                return searchHelper(arr, mid + 1, high, k);
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {200,75,9,9,8,7,6,5,4,3,2,1};
        System.out.println(search(200, arr));
    }
}
