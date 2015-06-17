import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by swathi on 6/12/2015.
 */
public class StringReverseTest {

    StringReverse stringReverse = new StringReverse();

    @Test
    public void shouldReverseTheString(){

        Assert.assertEquals("swathi" , stringReverse.reverseGivenString("ihtaws"));
        Assert.assertEquals("shruthi" , stringReverse.reverseGivenString("ihturhs"));
        Assert.assertEquals("chethan" , stringReverse.reverseGivenString("nahtehc"));
        Assert.assertEquals("" , stringReverse.reverseGivenString(""));

    }

    @Test
    public void shouldReverseTheString1(){

        Assert.assertEquals("swathi" , stringReverse.reverseGivenStringUsingStringBuilder("ihtaws"));
        Assert.assertEquals("shruthi" , stringReverse.reverseGivenStringUsingStringBuilder("ihturhs"));
        Assert.assertEquals("chethan" , stringReverse.reverseGivenStringUsingStringBuilder("nahtehc"));
        Assert.assertEquals("" , stringReverse.reverseGivenStringUsingStringBuilder(""));

    }


    @Test
    public void shouldReverseTheString2(){

        Assert.assertEquals("swathi" , stringReverse.reverseGivenStringUsingStringBuilder("ihtaws"));
        Assert.assertEquals("shruthi" , stringReverse.reverseGivenStringUsingStringBuilder("ihturhs"));
        Assert.assertEquals("chethan" , stringReverse.reverseGivenStringUsingStringBuilder("nahtehc"));
        Assert.assertEquals("" , stringReverse.reverseGivenStringUsingStringBuilder(""));

    }


    @Test
    public void shouldReverseTheString3(){

        Assert.assertEquals("swathi" , stringReverse.reverseGivenStringUsingReverseMethod("ihtaws"));
        Assert.assertEquals("shruthi" , stringReverse.reverseGivenStringUsingReverseMethod("ihturhs"));
        Assert.assertEquals("chethan" , stringReverse.reverseGivenStringUsingReverseMethod("nahtehc"));
        Assert.assertEquals("" , stringReverse.reverseGivenStringUsingReverseMethod(""));

    }

    @Test
    public void shouldReverseTheString4(){

        Assert.assertEquals("swathi" , stringReverse.reverseStringRecursively("ihtaws"));
       // Assert.assertEquals("shruthi" , stringReverse.reverseStringRecursively("ihturhs"));
        //Assert.assertEquals("chethan" , stringReverse.reverseStringRecursively("nahtehc"));
        //Assert.assertEquals("" , stringReverse.reverseStringRecursively(""));

    }



}