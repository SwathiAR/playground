/**
 * Created by swathi on 11/22/2015.
 */
public class SubString {

    public  String giveSubString(String str , int start){
        StringBuilder sb = new StringBuilder();
        for(int i=start; i<str.length();i++){
            sb.append(str.charAt(i));
        }
        return String.valueOf(sb);




    }

    public  String giveSubString(String str , int start , int end){
        StringBuilder sb = new StringBuilder();
        for(int i=start; i<end;i++){
            sb.append(str.charAt(i));
        }
        return String.valueOf(sb);




    }
}
