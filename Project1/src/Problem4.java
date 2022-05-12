/**
 * Joseph de la Viesca
 * CSC 201
 * Project 1 Problem 4
 * 2/5/22
 */
public class Problem4 {
    static void printMatrix(int mat[][]){
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean MatrixFind(int k, int[][] matrix){
        boolean found = false;
        int i = 0, j = matrix.length - 1; //i represesnts rows, j represents columns
        while(found == false && i < matrix.length){
            if(matrix[i][j] == k){
                found = true;
            }
            if(k < matrix[i][j]){
                i++;
            }
            else{
                j--;
            }
        }
        return found;
     }

    public static void main(String[] args){
        // int[][] matrix = {
        //     {99, 95, 85, 83, 70},
        //     {92, 91, 77, 60, 67},
        //     {84, 70, 63, 43, 37},
        //     {64, 43, 40, 31, 26},
        //     {47, 36, 24, 17, 10}
        // };

        int[][] matrix = {
            {99, 95, 85, 83},
            {90, 91, 77, 60},
            {84, 70, 63, 43},
            {64, 43, 40, 32},
        };

        System.out.println(MatrixFind(70, matrix));
    }
}
