import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by swathi on 6/11/2015.
 */
public class FactorialTest {



    Factorial factorial = new Factorial();
    @Test
    public void setFactorialTest(){
        Assert.assertEquals(-1, factorial.calculateFactorial(-1) );
        Assert.assertEquals(1 , factorial.calculateFactorial(0));
        Assert.assertEquals(1 , factorial.calculateFactorial(1));
        Assert.assertEquals(2 , factorial.calculateFactorial(2));
        Assert.assertEquals(6 , factorial.calculateFactorial(3));

    }

    @Test
    public void setFactorialTest1(){
        Assert.assertEquals(factorial.iterativeCalculateFactorial(-1), -1);
        Assert.assertEquals(1 , factorial.iterativeCalculateFactorial(0));
        Assert.assertEquals(1 , factorial.iterativeCalculateFactorial(1));
        Assert.assertEquals(2 , factorial.iterativeCalculateFactorial(2));
        Assert.assertEquals(6 , factorial.iterativeCalculateFactorial(3));

    }

}