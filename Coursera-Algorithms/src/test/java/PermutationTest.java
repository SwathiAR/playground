import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by swathi on 11/21/2015.
 */
public class PermutationTest {

    Permutation p = new Permutation();


    @Test
    public void testIsPermutation() throws Exception {

        Assert.assertEquals(true , p.isPermutation("swathi" , "wasith"));
        Assert.assertEquals(true , p.isPermutation("sw" , "sw"));
        Assert.assertEquals(true , p.isPermutation("swa" , "aws"));
        Assert.assertEquals(false , p.isPermutation(null , null));
        Assert.assertEquals(false  , p.isPermutation("" , "  "));
        Assert.assertEquals(true , p.isPermutation("" , ""));
        Assert.assertEquals(false , p.isPermutation("sw" , "swathi"));
    }

    @Test
    public void testIsPermutation2() throws Exception {

        Assert.assertEquals(true , p.isPermutation2("swathi" , "wasith"));
        Assert.assertEquals(true , p.isPermutation2("sw" , "sw"));
        Assert.assertEquals(true , p.isPermutation2("swa" , "aws"));
        Assert.assertEquals(false , p.isPermutation2(null , null));
        Assert.assertEquals(false  , p.isPermutation2("" , "  "));
        Assert.assertEquals(true , p.isPermutation2("" , ""));
        Assert.assertEquals(false , p.isPermutation2("swa" , "swathi"));

    }
}