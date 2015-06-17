package com.company;

import com.google.gson.JsonElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;

/**
 * Created by swathi on 6/7/2015.
 */
public class RestFullApiCallerImplTest {

    RestFullApiCallerImpl restFullApiCaller1 = new RestFullApiCallerImpl();
    private HashMap<String, String> queryParams;
    private HashMap<String, String> headers;

    @BeforeMethod
    public void setup() {
        queryParams = new HashMap<String, String>();
        queryParams.put("partnerid", "267067");
        headers = new HashMap<String, String>();
        headers.put("x-okta-session-id", getOktaSessionId());


    }

    private String getOktaSessionId() {
        JsonElement conResponse = restFullApiCaller1.callPost("https://sunedison-dev.cloudhub.io/api/login", "{\"username\": \"RSCOKTA.SVC@sunedison.com\",\"password\": \"NJNvZc43\"}");
        Assert.assertNotNull(conResponse);
        String id = conResponse.getAsJsonObject().getAsJsonPrimitive("id").getAsString();
        System.out.println(id);
        return id;
    }


    @Test
    public void getHomeOwnerByPartnerID() {
        JsonElement jsonElement = restFullApiCaller1.callGet("https://sunedison-dev.cloudhub.io/api/homeowners", queryParams, headers);
        Assert.assertNotNull(jsonElement);
        System.out.println(jsonElement);
        System.out.println(jsonElement.getAsJsonArray().get(0).getAsJsonObject().getAsJsonPrimitive("SunEdCustId"));

    }

    @Test
    public void putHomeOwnerUpdates(){
        JsonElement jsonElement = restFullApiCaller1.callPut("https://sunedison-qa.cloudhub.io/api/homeowners/384265)" ,"{\"FirstName\": \"Demoupdate_0423\",\"LastName\": \"TestUpdate_0423\",\"HomePhone\": \"(408)123-0987\",\"CellPhone\": \"(615)111-6543\",\"Email\": \"xmlHO0423update@mailinator.com\",\"Street\": \"16401 Pacific Coast Hwy\",\"City\": \"Sunset Beach\",\"State\": \"CA\", \"Zip\": \"95051\",\"PartnerCustId\": \"12345\",\"CoHFirstName\": \"Cofirstupdate\",\"CoHLastName\": \"Colastupdate\",\"CoHEmail\": \"Cohome@gmail.com\",\"PartnerId\": \"267067\",\"\"SalesPersonId\": \"321378\",\"IsHomeOwner\": true,\",\"IsCustomerOrPartner\": false,\",\"PurchaseType\":\"Lease - Monthly\",\"FinancingProgram\":\"WGSW\",\"ElectricalUtility\":\"PG&E- Residential(E-1)\",\"AvgMonthlyUtilityBill\":\"$201-$400\"}",headers);

    }




}