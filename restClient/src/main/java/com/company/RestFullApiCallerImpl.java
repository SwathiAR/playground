package com.company;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;

public class RestFullApiCallerImpl implements  RestFullApiCaller {

    @Override

    public JsonElement callPost(String uri, String input) {
        Client client = Client.create();
        WebResource webResource = client.resource(uri);
        ClientResponse clientResponse = webResource.type(MediaType.APPLICATION_JSON_TYPE).post(ClientResponse.class, input);
        //System.out.println(clientResponse.getStatus());
        String entity = clientResponse.getEntity(String.class);
        JsonParser jsonParser = new JsonParser();
        return jsonParser.parse(entity);
    }

    public JsonElement callGet(String uri , HashMap<String , String> queryParams , HashMap<String , String> headers){
        Client client = Client.create();
        WebResource resource = client.resource(uri);
        for (String key : queryParams.keySet()) {
            resource=resource.queryParam(key , queryParams.get(key));
        }
        WebResource.Builder requestBuilder=resource.getRequestBuilder();
        for (String key : headers.keySet()) {
            requestBuilder = requestBuilder.header(key, headers.get(key));
        }
        ClientResponse clientResponse = requestBuilder.type(MediaType.APPLICATION_JSON_TYPE).get(ClientResponse.class);
        String entity = clientResponse.getEntity(String.class);
        JsonParser jasonParser = new JsonParser();
        return jasonParser.parse(entity);

    }

    public JsonElement callPut(String uri, String input , HashMap<String, String> headers){

        Client client = Client.create();
        WebResource resource = client.resource(uri);

            WebResource.Builder webResource = resource.getRequestBuilder();
        for ( String key :headers.keySet()) {
            webResource.header(key , headers.get(key));

        }



        ClientResponse clientResponse = webResource.type(MediaType.APPLICATION_JSON_TYPE).put(ClientResponse.class, input);
        String entity = clientResponse.getEntity(String.class);
        JsonParser jsonParser = new JsonParser();
        return jsonParser.parse(entity);


    }

}
