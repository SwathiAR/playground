

import org.testng.Assert;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

import static org.testng.Assert.*;

/**
 * Created by swathi on 6/11/2015.
 */
public class FibonacciTest {
    Fibonacci fibonacci = new Fibonacci();

    @Test

    public void fibonacciTest()
    {
        Assert.assertTrue(Arrays.equals(new int[]{0, 1}, fibonacci.calculateArrayFibonacci(2)));
        Assert.assertTrue(Arrays.equals(fibonacci.calculateArrayFibonacci(5), new int[]{0, 1, 1, 2, 3}));

        int[] ints = fibonacci.calculateArrayFibonacci(2);
        assertNotNull(ints);
        assertEquals(ints.length , 2);
    }

@Test
    public void fibonacciTest2() {

        Assert.assertEquals(1, fibonacci.calculateFibonacci(1));
        Assert.assertEquals(1, fibonacci.calculateFibonacci(2));
        Assert.assertEquals(0, fibonacci.calculateFibonacci(0));
        Assert.assertEquals(2, fibonacci.calculateFibonacci(3));
        Assert.assertEquals(fibonacci.calculateFibonacci(4),3);

    }
    @Test
    public  void fibonacciTest3(){
        Assert.assertEquals(1, fibonacci.recursiveFibonacci(1));
        Assert.assertEquals(1, fibonacci.recursiveFibonacci(2));
        Assert.assertEquals(0, fibonacci.recursiveFibonacci(0));
        Assert.assertEquals(2, fibonacci.recursiveFibonacci(3));
        Assert.assertEquals(fibonacci.recursiveFibonacci(4),3);

    }

    @Test
    public void fibonacciTest4(){
        Assert.assertEquals(1, fibonacci.memoizationFibonacci(1 , new HashMap<>()));
        Assert.assertEquals(1, fibonacci.memoizationFibonacci(2 , new HashMap<>()));
        Assert.assertEquals(0, fibonacci.memoizationFibonacci(0, new HashMap<>()));
        Assert.assertEquals(2, fibonacci.memoizationFibonacci(3 ,new HashMap<>()));
        Assert.assertEquals(fibonacci.memoizationFibonacci(4 , new HashMap<>()),3);


    }

}
