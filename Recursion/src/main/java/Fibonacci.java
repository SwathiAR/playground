import java.math.BigInteger;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by swathi on 6/11/2015.
 */
public class Fibonacci {



    public int[] calculateArrayFibonacci(int num) {

        int[] fibo = new int[num];
        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i < num; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        return fibo;
    }

    public int calculateFibonacci(int num){

        int first = 1;
        int second = 1;
        int result = 0;

        if(num==0){
            return 0;
        }

        if(num==1 ||num==2) {
            return 1;
        }


        for(int i=3;i<=num;i++){

            result = first + second;
            first = second;
            second = result;

        }
return result;

    }


    public int recursiveFibonacci(int num){

        int first=1;
        int second=1;

        if(num==0){
            return 0;
        }
        if (num==1||num==2){
            return 1;
         }

        return recursiveFibonacci(num-1)+recursiveFibonacci(num-2);


    }

public  int memoizationFibonacci(int num ,Map<Integer , Integer>  map){

    if(num==0){
        return 0;
    }
    if (num==1||num==2){
        return 1;
    }

    if( map.get(num)==null){

        map.put(num , (memoizationFibonacci((num - 1) , map) + memoizationFibonacci((num - 2) , map)));
    }

    return map.get(num);
}

}

