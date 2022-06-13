package main.java;

//https://leetcode.com/problems/merge-sorted-array/
public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
      while(i >=0 && j>=0){
          //check if largest element of nums1 is less than largest element in nums2
          if(nums2[j]>nums1[i]){
              //if yes, fill up the empty spaces from behind using the largest elements in nums2 and keep comparing the next smaller element in nums2
              nums1[k--] = nums2[j--];
          }
          else {
              //if it is not the case, copy the largest in nums1 to nearest available empty space
            nums1[k--] = nums1[i--];
          }
      }
      //once the nums1 is completely traversed, fill up everything else from nums2 into nums1.
      while(j>=0){
          nums1[k--] = nums2[j--];
      }
    }

  public static void main(String[] args) {
        // 1 2 3 0 0 6 k = 5
      //1 2 3 0 5 6 k = 4
      //1 2 3 3 5 6 k=3
      //
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int n=3;
        int[] nums2 = {2,5,6};
        merge(nums1, m, nums2, n);
  }
}
