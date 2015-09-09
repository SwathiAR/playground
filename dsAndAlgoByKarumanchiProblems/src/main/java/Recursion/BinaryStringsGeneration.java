package Recursion;


import java.util.Arrays;

/**
 * Created by swathi on 8/21/2015.
 */
public class BinaryStringsGeneration {

    public void generate(int n){
        generateUlta(n,new int[n]);
    }

    public void generate(int n,int[] binaryValue){
        if(n<1){
            System.out.println(Arrays.toString(binaryValue));
        }
        else{

            binaryValue[n-1] = 0;
            generate(n-1,binaryValue);
            binaryValue[n-1] = 1;
            generate(n-1,binaryValue);
        }
    }
    public void generateUlta(int n,int[] binaryValue){
        if(n<1){
            System.out.println(Arrays.toString(binaryValue));
        }
        else{

            binaryValue[binaryValue.length-n] = 0;
            generateUlta(n - 1, binaryValue);
            binaryValue[binaryValue.length-n] = 1;
            generateUlta(n-1,binaryValue);
        }
    }
}
