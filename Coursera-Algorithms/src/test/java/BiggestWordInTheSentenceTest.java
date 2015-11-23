import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by swathi on 11/22/2015.
 */
public class BiggestWordInTheSentenceTest {
 BiggestWordInTheSentence b = new BiggestWordInTheSentence();
    @Test
    public void testGetBiggestwordcount() throws Exception {

        Assert.assertEquals(b.getBiggestwordcount("I am amazing") , 7);
        Assert.assertEquals(b.getBiggestwordcount("swathi") , 6);
        Assert.assertEquals(b.getBiggestwordcount("") , 0);
        Assert.assertEquals(b.getBiggestwordcount("My name  is not sooo good") , 4);

    }

    @Test
    public void testGetBiggestwordcount2() throws Exception {

        Assert.assertEquals(b.getBiggestwordcount2("I am amazing") , 7);
        Assert.assertEquals(b.getBiggestwordcount2("swathi") , 6);
        Assert.assertEquals(b.getBiggestwordcount2("") , 0);
        Assert.assertEquals(b.getBiggestwordcount2("My name  is not sooo good") , 4);

    }
}