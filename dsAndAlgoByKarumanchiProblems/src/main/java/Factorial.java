/**
 * Created by swathi on 8/20/2015.
 */
public class Factorial {
    public int findFact(int n){
       return  ((n<=1))?  1 :  (n * findFact(n-1));
    }
}
