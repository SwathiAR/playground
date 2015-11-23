package Stack;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by swathi on 11/16/2015.
 */
public class FixedSizeArrayStackTest {
    FixedSizeArrayStack stack = new FixedSizeArrayStack();

    @Test
    public void testFixedSizeArrayStack(){
        stack.push(2);
        stack.push(3);
        stack.push(9);
        System.out.println(stack.toString());
        Assert.assertEquals(3 , stack.size());
        Assert.assertEquals(9 , stack.top());
        Assert.assertEquals(9 , stack.pop());
        Assert.assertEquals(2 , stack.size());
        Assert.assertEquals(3 , stack.top());
        Assert.assertEquals(3 , stack.pop());
        Assert.assertEquals(2 , stack.pop());
        Assert.assertEquals(true , stack.isEmpty());
    }

}