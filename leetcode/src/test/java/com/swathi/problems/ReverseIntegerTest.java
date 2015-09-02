package com.swathi.problems;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by swathi on 8/8/2015.
 */
public class ReverseIntegerTest {

    ReverseInteger reverseInteger = new ReverseInteger();

    @Test
    public void shouldReverseTheInteger(){
        Assert.assertEquals(234 , reverseInteger.reverse(432));
        Assert.assertEquals(23416 , reverseInteger.reverse(61432));
    }




}