package main.java;

import java.util.*;

//https://leetcode.com/problems/intersection-of-two-arrays-ii/
public class IntersectionOfTwoArrays {

  public static int[] intersect(int[] nums1, int[] nums2) {
    Map<Integer, Integer> map = new HashMap<>();
    List<Integer> list = new ArrayList<>();
    int k = 0;
    for (int i : nums1) {
      map.put(i, map.getOrDefault(i, 0) + 1);
    }
    for(int j: nums2){
        if(map.containsKey(j) && map.get(j)>0){
            list.add(j);
            map.put(j, map.get(j)-1);
        }
    }
    int[] resultArr = new int[list.size()];
    for(int num:list) resultArr[k++] = num;
    return resultArr;
  }

  public static void main(String[] args) {
    int[] nums1 = {2,1};
    int[] nums2 = {1,1};
    int[] result = intersect(nums1, nums2);
  }
}
