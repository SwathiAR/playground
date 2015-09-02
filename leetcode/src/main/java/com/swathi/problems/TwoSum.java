package com.swathi.problems;

/*
Given an array of integers
, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2
 */

import java.util.HashMap;

/**
 * Created by swathi on 8/7/2015.
 */
public class TwoSum {

    public int[] twoSum(int[] nums , int target){
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if ((nums[i] + nums[j])==target){
                    result[0] = i+1;
                    result[1]=i+2;
                }

            }
        }
        return  result;


    }

    public int[] twoSumHashMap(int[] nums , int target){
        int[] result = new int[2];
        HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();

        for(int i=0;i<nums.length;i++){

        }



        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                result[0] = i+1;
                result[1] = map.get(target-nums[i]);
                return result;
            }
            else {
                map.put(nums[i], i);
            }

        }
        return result;



    }


}
