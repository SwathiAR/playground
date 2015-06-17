package com.company;

import com.google.gson.JsonElement;

import java.util.HashMap;

/**
 * Created by swathi on 6/7/2015.
 */
public interface RestFullApiCaller {

     JsonElement callPost(String uri, String input);
     JsonElement callGet(String uri , HashMap<String, String> queryParams , HashMap<String , String> headers);
     JsonElement callPut(String uri , String input ,  HashMap<String ,String> headers);
}
