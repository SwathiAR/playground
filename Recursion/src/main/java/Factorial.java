/**
 * Created by swathi on 6/11/2015.
 */
public class Factorial {
    public int calculateFactorial(int num){
        if (num<0){
            return -1;
        }
        return num == 0 ? 1 : num * calculateFactorial(num - 1);
    }

    public int iterativeCalculateFactorial(int num){
        int fact = 1;
        if (num==0) {
            return 1;
        }

        else if(num==-1){
            return -1;
        }

        for(int i=1;i<=num;i++){
            fact = fact*i;
        }
        return fact;
    }
}
