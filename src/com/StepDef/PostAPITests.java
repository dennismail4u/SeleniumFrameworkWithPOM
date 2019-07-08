package com.StepDef;

import java.io.File;
import java.util.HashMap;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;

import com.RestAPI_Data.Users;
import com.RestClient.Rest_Client;
import com.base.Test_Base;
import com.fasterxml.jackson.databind.ObjectMapper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class PostAPITests extends Test_Base{
	Test_Base TestBase;
	String serviceUrl;
	String apiUrl;
	String url;
	Rest_Client restClient;
	CloseableHttpResponse closebaleHttpResponse;
	
	@Given("^initiialize rest client for POST$")
	public void initiialize_rest_client_for_POST() throws Throwable {
		TestBase = new Test_Base();
		serviceUrl = prop.getProperty("RestURL");
		apiUrl = prop.getProperty("serviceURL");
		//https://reqres.in/api/users
		
		url = serviceUrl + apiUrl;
	}
	
	@Then("^validate postAPITest$")
	public void validate_postAPITest() throws Throwable {
		restClient = new Rest_Client();
		HashMap<String, String> headerMap = new HashMap<String, String>();
		headerMap.put("Content-Type", "application/json");
		
		//jackson API:
		ObjectMapper mapper = new ObjectMapper();
		Users users = new Users("morpheus", "leader"); //expected users obejct
		
		//object to json file:
		mapper.writeValue(new File("/Users/DennisThomas/Documents/workspace/SeleniumFrameworkProj/src/com/RestAPIData/users.json"), users);
		
		//java object to json in String:
		String usersJsonString = mapper.writeValueAsString(users);
		System.out.println(usersJsonString);
		
		closebaleHttpResponse = restClient.post(url, usersJsonString, headerMap); //call the API
		
		//validate response from API:
		//1. status code:
		int statusCode = closebaleHttpResponse.getStatusLine().getStatusCode();
		Assert.assertEquals(statusCode, TestBase.RESPONSE_STATUS_CODE_201);
		
		//2. JsonString:
		String responseString = EntityUtils.toString(closebaleHttpResponse.getEntity(), "UTF-8");
		
		JSONObject responseJson = new JSONObject(responseString);
		System.out.println("The response from API is:"+ responseJson);
		
		//json to java object:
		Users usersResObj = mapper.readValue(responseString, Users.class); //actual users object
		System.out.println(usersResObj);
		
		Assert.assertTrue(users.getName().equals(usersResObj.getName()));
		
		Assert.assertTrue(users.getJob().equals(usersResObj.getJob()));
		
		System.out.println(usersResObj.getId());
		System.out.println(usersResObj.getCreatedAt());
	}
	
	


}
