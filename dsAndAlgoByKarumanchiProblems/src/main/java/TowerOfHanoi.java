/**
 * Created by swathi on 8/20/2015.
 */
public class TowerOfHanoi {

    public void solveTowerOfHanoi(int n , char start , char temp , char end){

        if(n==1){
            System.out.println(start + "-->" + end);
        }

        if (n>1){
            solveTowerOfHanoi(n-1 , start , end , temp);
            System.out.println(start + "-->" + end);
            solveTowerOfHanoi(n-1 , temp , start , end);
        }

    }
}

