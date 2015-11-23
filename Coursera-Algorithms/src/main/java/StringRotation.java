/**
 * Created by swathi on 11/23/2015.
 */
public class StringRotation {

    public String rotateString(String str , int pos){
        if(str==null || str.equals("")){
            return str;
        }

        int position = pos<str.length()?pos:(pos%str.length());

        StringBuilder sb = new StringBuilder();
        for(int i = position ; i< str.length() ; i++ ){
            sb.append(str.charAt(i));
        }

        for(int i= 0 ; i<position ; i++){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
