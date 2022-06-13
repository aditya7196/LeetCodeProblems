package main.java;

import java.util.*;

//https://leetcode.com/problems/pascals-triangle/
public class PascalsTriangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        //i is the tracker for rows
        for(int i=0; i<numRows; i++){
            //j is the tracker for columns
            //dynamically create an array of length i+1
            Integer[] arr = new Integer[i+1];
            for(int j=0; j<arr.length; j++){
                //If the location is on edge, set it as 1
                if(j==0 || j==arr.length-1){
                    arr[j] = 1;
                }
                else {
                    //if not, set it as sum of nums at curr index + curr index-1 of previous row
                    arr[j] = result.get(i-1).get(j) + result.get(i-1).get(j-1);
                }
            }
            //Add everything
            result.add(Arrays.asList(arr));
        }
        return result;
    }

    public static List<List<Integer>> generateNew(int numRows) {
        List<List<Integer>> rows = new ArrayList<>();
        //i is the tracker for rows
        for(int i=0; i<numRows; i++){
            //j is the tracker for columns
            //Create the subList
            List<Integer> row = new ArrayList<>();
            for(int j=0; j<i+1; j++){
                //If the location is on edge, set it as 1
                if(j==0 || j==i){
                    row.add(1);
                }
                else {
                    //if not, set it as sum of nums at curr index + curr index-1 of previous row
                   row.add(rows.get(i-1).get(j) + rows.get(i-1).get(j-1));
                }
            }
            //Add everything
            rows.add(row);
        }
        return rows;
    }


  public static void main(String[] args) {
    int numRows = 5;
    List<List<Integer>> result = generateNew(numRows);
  }
}
