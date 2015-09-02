package com.swathi.problems;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by swathi on 8/7/2015.
 */
public class TwoSumTest {

    TwoSum twoSum = new TwoSum();

    @Test
    public void findtheIndexes(){
        int[] ints = twoSum.twoSum(new int[]{5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, 18);
        Assert.assertEquals(4 , ints[0]);
        Assert.assertEquals(6 , ints[1]);

    }

    @Test
    public void findtheIndexesusingHashMap(){
        int[] ints = twoSum.twoSumHashMap(new int[]{5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, 18);
        Assert.assertEquals(4 , ints[0]);
        Assert.assertEquals(6 , ints[1]);

    }


}