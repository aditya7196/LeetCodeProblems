package main.java;

import java.util.*;

//https://leetcode.com/problems/two-sum/
public class TwoSum {

  public static void main(String[] args) {
      int[] nums = {2,7,11,5};
      int target = 18;
      twoSum(nums, target);
  }

  public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> sumMap = new HashMap<>();
    int[] indexes = new int[2];
    for(int i=0; i<nums.length; i++){
      if (sumMap.isEmpty() || !sumMap.containsKey(target-nums[i])){
        sumMap.putIfAbsent(nums[i], i);
        continue;
      }
      if (sumMap.containsKey(target-nums[i])){
          indexes[0] = sumMap.get(target-nums[i]);
          indexes[1] = i;
          break;
      }
    }
    return indexes;
  }
}
