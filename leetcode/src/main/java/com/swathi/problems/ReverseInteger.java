package com.swathi.problems;

/**
 * Created by swathi on 8/8/2015.
 */
public class ReverseInteger {


    public int reverse(int x) {

        String string = ((Integer)x).toString();
        char[] chars = string.toCharArray();
        char[] resChars = new char[chars.length];

        for(int i =0;i<chars.length;i++){

            resChars[i]=chars[(chars.length) -1-i];
        }
        return  Integer.parseInt(String.valueOf(resChars));

    }

public  int reverse1(int x){

    while(x/10>0){
        int reversedint =x%10
    }
}
}