import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by swathi on 11/22/2015.
 */
public class PalindromeTest {
    Palindrome p = new Palindrome();

    @Test
    public void testIsPalindrome() throws Exception {
        Assert.assertEquals(p.isPalindrome("swathi") , false);
        Assert.assertEquals(p.isPalindrome("malayalam") , true);
        Assert.assertEquals(p.isPalindrome("") , false);
        Assert.assertEquals(p.isPalindrome(null) , false);
        Assert.assertEquals(p.isPalindrome("swaws") , true);



    }

    @Test
    public void test2IsPalindrome() throws Exception {
        Assert.assertEquals(p.isPalindrome2("swathi") , false);
        Assert.assertEquals(p.isPalindrome2("malayalam") , true);
        Assert.assertEquals(p.isPalindrome2("") , false);
        Assert.assertEquals(p.isPalindrome2(null) , false);
        Assert.assertEquals(p.isPalindrome2("swaws") , true);



    }
}