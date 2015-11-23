/**
 * Created by swathi on 11/23/2015.
 */
public class ReverseStringCompression {

    public String getString(String str){

        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();

        for(int i = 0 ; i<chars.length;i++){

            if(isNumeric(str.charAt(i))){
                Integer run = Integer.parseInt(String.valueOf(str.charAt(i)));
                int count = 1;
                while(count< run) {
                    sb.append(str.charAt(i - 1));
                    count++;
                }

            }
            else{
                sb.append(str.charAt(i));
            }

        }



      return sb.toString();

    }

    private boolean isNumeric(char c) {
        try{

            Integer.parseInt(String.valueOf(c));
            return true;
        }
        catch (Exception e){
            return false;
        }
    }


}
