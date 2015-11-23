import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by swathi on 11/22/2015.
 */
public class SubStringTest {
    SubString s = new SubString();


    @Test
    public void testGiveSubString() throws Exception {

        Assert.assertEquals(s.giveSubString("swathi" , 3) , "thi" );
        Assert.assertEquals(s.giveSubString("swathi" , 0) , "swathi" );
        Assert.assertEquals(s.giveSubString("swathi" , 5) , "i" );
    }

    @Test
    public void testGiveSubString1() throws Exception {
        Assert.assertEquals(s.giveSubString("swathi" , 3 , 6) , "thi" );
        Assert.assertEquals(s.giveSubString("swathi" , 0 , 6 ) , "swathi" );
        Assert.assertEquals(s.giveSubString("swathi" , 5 , 6) , "i" );
    }
}