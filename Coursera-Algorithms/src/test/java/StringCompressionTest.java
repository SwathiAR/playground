import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by swathi on 11/21/2015.
 */
public class StringCompressionTest {
    StringCompression s = new StringCompression();


    @Test
    public void testCompression(){
        Assert.assertEquals(s.compressString("sswaaaathii") , "s2wa4thi2");
        Assert.assertEquals(s.compressString("ss") , "s2");
        Assert.assertEquals(s.compressString("") , "");
        Assert.assertEquals(s.compressString("   ") , " 3");
        Assert.assertEquals(s.compressString2("   ") , " 3");
//        Assert.assertEquals(s.compressString2("") , "");
        Assert.assertEquals(s.compressString2("ss") , "s2");
        Assert.assertEquals(s.compressString2("sswaaaathii") , "s2wa4thi2");
        Assert.assertEquals(s.compressString("wattt") , "wat3");
        Assert.assertEquals(s.compressString2("wattt") , "wat3");

    }

}