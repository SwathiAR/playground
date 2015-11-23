/**
 * Created by swathi on 6/12/2015.
 */
public class StringReverse {

    public String reverseGivenString(String str){
        /*char[] chars = s.toCharArray();
        char[] reverseOfChars = new char[chars.length];
        for(int i=0;i<chars.length ;i++){
            reverseOfChars [i] =chars[chars.length-1-i];
        }
        return String.valueOf(reverseOfChars);*/



        char[] chars = str.toCharArray();
        char[] reverseStr = new char[chars.length];


        int i=0;
        int length = chars.length;
        while(i<=length){
            reverseStr[i] = chars[length -1];
            i++;
            length--;
        }

        return String.valueOf(reverseStr);
    }

    public String reverseGivenStringUsingStringBuilder(String s){
       StringBuilder sb = new StringBuilder(s);
        StringBuilder reverseSb = new StringBuilder(sb.length());
        for(int i=0 ; i<sb.length() ; i++){
            reverseSb.append(sb.charAt(sb.length() - 1 - i));

        }
        return String.valueOf(reverseSb);

    }

    public String reverseGivenStringUsingReverseMethod(String s){
       StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        return String.valueOf(stringBuilder);

    }

    public String reverseStringRecursively(String s){
StringBuilder stringBuilder = new StringBuilder(s);


        if(stringBuilder.length()<2){
            return stringBuilder.toString();
        }

        return reverseStringRecursively(stringBuilder.substring(1)) + stringBuilder.charAt(0);


    }








}
