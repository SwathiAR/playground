public class ReverseString {

    public String reverseStringWithExtraMemory(String str){
        if(str==null){
            return  str;
        }

        char[] chars = str.toCharArray();
        char[] reverseChar = new char[chars.length];
        for (int i=0 ; i<chars.length ; i++){
            reverseChar[i] = chars[chars.length-i-1];
        }
        return String.valueOf(reverseChar);
    }


    public String reverseStringWithoutExtraArray(String str){

        if(str==null){
            return  str;
        }
        char[] chars = str.toCharArray();

        for(int i=0 ; i< chars.length/2 ; i++ ){

            char temp = chars[i];
            chars[i] = chars[chars.length-i-1];
            chars[chars.length-i-1]  = temp;

        }

      return  String.valueOf(chars);

    }

    public String revereUsingRecursion(String str){

        if(str==null){
            return str;
        }

      return   String.valueOf(reverse(str.toCharArray() , 0 , str.length()-1));


    }

    private char[] reverse(char[] str, int start, int end) {

        if ( start>=end){
            return str;
        }



        else {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            return reverse(str , start + 1  , end -1 );
        }
    }


}