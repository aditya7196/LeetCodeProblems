package main.java;

//https://leetcode.com/problems/reshape-the-matrix/ - https://leetcode.com/problems/reshape-the-matrix/discuss/102513/One-loop
public class ReshapeTheMatrix {

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        //check if proposed transformation is legal
        if(r*c==mat.length*mat[0].length){
            //Define new matrix
            int[][] newMat = new int[r][c];
            //start with forst loop
            for(int i=0,k=0; i<mat.length; i++){

                //
                for(int j=0, l=0; j<mat[i].length; j++, l++){
                    if(l == c){
                        l=0;
                        k++;
                    }
                    newMat[k][l] = mat[i][j];
                }
            }
            return newMat;
        }
        return mat;
    }

    public static int[][] matrixReshapeNew(int[][] mat, int r, int c) {
            //check if proposed transformation is legal, if not, return the original matrix
            if(r*c!=mat.length*mat[0].length) return mat;
            //Define new matrix
            int[][] newMat = new int[r][c];

            int i=0; //track old matrix's row
            int k=0; //track new matrix's row
            int l=0; //track new matrix's column

            //traverse until old matrix's rows' end
            while(i<mat.length){
                //traverse until old matrix's columns' end
                int j=0; //track old matrix's column, and reset it when we're done with one column.
                while(j<mat[i].length){
                    //if columns are filled, reset the column pointer and start with next row
                    if(l==c){
                        k++;
                        l=0;
                    }
                    //Fill up the new matrix
                    newMat[k][l++] = mat[i][j++];
                }
                i++;
            }
            return newMat;
    }


  public static void main(String[] args) {


    int[][] mat ={{1,2},{3,4}};
    int r = 1;
    int c = 4;
    int[][] reshapedMat = matrixReshapeNew(mat, r, c);
  }
}
