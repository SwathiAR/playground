import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by swathi on 11/20/2015.
 */
public class UniqueStringTest {

    UniqueString uniqueStringTest = new UniqueString();

    @Test
    public void testStringUniqueness(){
       // Assert.assertEquals(false , uniqueStringTest.isUnique("swaathi"));
//        Assert.assertEquals(true , uniqueStringTest.isUnique("swathi"));
//        Assert.assertEquals(true , uniqueStringTest.isUnique(""));
        Assert.assertEquals(false , uniqueStringTest.isUnique(" a "));
    }


    @Test
    public void testTheStringUniqueness(){
         Assert.assertEquals(false , uniqueStringTest.isUniqueByDs("swaathi"));
  Assert.assertEquals(true , uniqueStringTest.isUniqueByDs("swathi"));
        Assert.assertEquals(true , uniqueStringTest.isUniqueByDs(""));
        Assert.assertEquals(false , uniqueStringTest.isUniqueByDs(" a "));
    }

    @Test
    public void testThisStringUniqueness(){
        Assert.assertEquals(false , uniqueStringTest.isUniqueBySizeComparision("swaathi"));
        Assert.assertEquals(true , uniqueStringTest.isUniqueBySizeComparision("swathi"));
        Assert.assertEquals(true , uniqueStringTest.isUniqueBySizeComparision(""));
        Assert.assertEquals(false , uniqueStringTest.isUniqueBySizeComparision(" a "));
    }

    @Test
    public void StringUniqueness(){
        Assert.assertEquals(false , uniqueStringTest.isUniqueBySizeBySorting("swaathi"));
        Assert.assertEquals(true , uniqueStringTest.isUniqueBySizeBySorting("swathi"));
        Assert.assertEquals(true , uniqueStringTest.isUniqueBySizeBySorting(""));
        Assert.assertEquals(false , uniqueStringTest.isUniqueBySizeBySorting(" a "));
    }


}