/**
 * Joseph de la Viesca
 * CSC 201
 * Project 1 Problem 2
 * 1/29/22
 */
public class Problem2 {
    public static void main(String[] args){
        for(int n = 1; n < 16385; n = n*2){
        /**Code Snippet 1
         * T(n) = 1 + 2n = O(n)
         */
        long runTime = System.nanoTime();
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + i;
        }
        runTime = System.nanoTime() - runTime;
        System.out.printf("\nCode Snippet 1\nInput size: N = %d\nRuntime: %d nanoseconds\n", n, runTime);

       /**Code Snippet 2
        * T(n) = 1 + 2*((n(n+1)(n+2))/6) = O(n^3)
        */
        runTime = System.nanoTime();
        int sum2 = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i*i; j++){
                sum2 = sum2 + i;
            }
        }
        runTime = System.nanoTime() - runTime; 
        System.out.printf("\nCode Snippet 2\nInput size: N = %d\nRuntime: %d nanoseconds\n", n, runTime);
        }
    }
}
