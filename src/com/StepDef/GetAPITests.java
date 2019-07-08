package com.StepDef;

import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;

import com.RestClient.Rest_Client;
import com.base.Test_Base;
import com.util.RestTestsUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class GetAPITests extends Test_Base{
	Test_Base TestBase;
	String serviceUrl;
	String apiUrl;
	String url;
	Rest_Client restClient;
	CloseableHttpResponse closebaleHttpResponse;
	
	@Given("^initiialize rest client$")
	public void initiialize_rest_client() throws Throwable {
		TestBase = new Test_Base();
		serviceUrl = prop.getProperty("RestURL");
		apiUrl = prop.getProperty("serviceURL");
		//https://reqres.in/api/users
		
		url = serviceUrl + apiUrl;
	}

	@Then("^validate getAPITestWithoutHeaders$")
	public void validate_getAPITestWithoutHeaders() throws Throwable {
		restClient = new Rest_Client();
		closebaleHttpResponse = restClient.get(url);
		
		//a. Status Code:
		int statusCode = closebaleHttpResponse.getStatusLine().getStatusCode();
		System.out.println("Status Code--->"+ statusCode);
		
		Assert.assertEquals(statusCode, RESPONSE_STATUS_CODE_200, "Status code is not 200");

		//b. Json String:
		String responseString = EntityUtils.toString(closebaleHttpResponse.getEntity(), "UTF-8");
		
		JSONObject responseJson = new JSONObject(responseString);
		System.out.println("Response JSON from API---> "+ responseJson);
		
		//single value assertion:
		//per_page:
		String perPageValue = RestTestsUtil.getValueByJPath(responseJson, "/per_page");
		System.out.println("value of per page is-->"+ perPageValue);
		Assert.assertEquals(Integer.parseInt(perPageValue), 3);
		
		//total:
		String totalValue = RestTestsUtil.getValueByJPath(responseJson, "/total");
		System.out.println("value of total is-->"+ totalValue);		
		Assert.assertEquals(Integer.parseInt(totalValue), 12);

		//get the value from JSON ARRAY:
		String lastName = RestTestsUtil.getValueByJPath(responseJson, "/data[0]/last_name");
		String id = RestTestsUtil.getValueByJPath(responseJson, "/data[0]/id");
		String avatar = RestTestsUtil.getValueByJPath(responseJson, "/data[0]/avatar");
		String firstName = RestTestsUtil.getValueByJPath(responseJson, "/data[0]/first_name");

		System.out.println(lastName);
		System.out.println(id);
		System.out.println(avatar);
		System.out.println(firstName);
		
		
		//c. All Headers
		Header[] headersArray =  closebaleHttpResponse.getAllHeaders();
		HashMap<String, String> allHeaders = new HashMap<String, String>();	
		for(Header header : headersArray){
			allHeaders.put(header.getName(), header.getValue());
		}	
		System.out.println("Headers Array-->"+allHeaders);
	}

	@Then("^validate getAPITestWithHeaders$")
	public void validate_getAPITestWithHeaders() throws Throwable {
		restClient = new Rest_Client();
		
		HashMap<String, String> headerMap = new HashMap<String, String>();
		headerMap.put("Content-Type", "application/json");
//		headerMap.put("username", "test@amazon.com");
//		headerMap.put("password", "test213");
//		headerMap.put("Auth Token", "12345");

		
		closebaleHttpResponse = restClient.get(url,headerMap);
		
		//a. Status Code:
		int statusCode = closebaleHttpResponse.getStatusLine().getStatusCode();
		System.out.println("Status Code--->"+ statusCode);
		
		Assert.assertEquals(statusCode, RESPONSE_STATUS_CODE_200, "Status code is not 200");

		//b. Json String:
		String responseString = EntityUtils.toString(closebaleHttpResponse.getEntity(), "UTF-8");
		
		JSONObject responseJson = new JSONObject(responseString);
		System.out.println("Response JSON from API---> "+ responseJson);
		
		//single value assertion:
		//per_page:
		String perPageValue = RestTestsUtil.getValueByJPath(responseJson, "/per_page");
		System.out.println("value of per page is-->"+ perPageValue);
		Assert.assertEquals(Integer.parseInt(perPageValue), 3);
		
		//total:
		String totalValue = RestTestsUtil.getValueByJPath(responseJson, "/total");
		System.out.println("value of total is-->"+ totalValue);		
		Assert.assertEquals(Integer.parseInt(totalValue), 12);

		//get the value from JSON ARRAY:
		String lastName = RestTestsUtil.getValueByJPath(responseJson, "/data[0]/last_name");
		String id = RestTestsUtil.getValueByJPath(responseJson, "/data[0]/id");
		String avatar = RestTestsUtil.getValueByJPath(responseJson, "/data[0]/avatar");
		String firstName = RestTestsUtil.getValueByJPath(responseJson, "/data[0]/first_name");

		System.out.println(lastName);
		System.out.println(id);
		System.out.println(avatar);
		System.out.println(firstName);
		
		
		//c. All Headers
		Header[] headersArray =  closebaleHttpResponse.getAllHeaders();
		HashMap<String, String> allHeaders = new HashMap<String, String>();	
		for(Header header : headersArray){
			allHeaders.put(header.getName(), header.getValue());
		}	
		System.out.println("Headers Array-->"+allHeaders);
	}


}
