package main.java;

//https://leetcode.com/problems/search-a-2d-matrix/
public class Search2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        //Determine tentative position
        int i = 0;
        int pos = 0;
        while (i<matrix.length){
            if(target>=matrix[i][0]){
                pos=i;
            }
            else break;
            i++;
        }
        //Search in the specific branch
        for (int j=0; j<matrix[pos].length; j++){
            if (target == matrix[pos][j]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 11;
        boolean isPresent = searchMatrix(matrix, target);
        System.out.println(isPresent);
    }

}
