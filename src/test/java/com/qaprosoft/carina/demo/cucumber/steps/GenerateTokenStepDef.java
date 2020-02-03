package com.qaprosoft.carina.demo.cucumber.steps;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.Configurator;
import org.codehaus.jettison.json.JSONException;
import org.json.JSONObject;

import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import com.qaprosoft.carina.core.foundation.cucumber.CucumberRunner;
import com.qk.carina.demo.api.CreateBankAccountPostMethod;
import com.qk.carina.demo.api.GenerateTokenPOstMethod;
import com.qk.carina.demo.api.getSpecificIdDetailsGet;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class GenerateTokenStepDef extends  CucumberRunner {

	static GenerateTokenPOstMethod user = null;
	static CreateBankAccountPostMethod user4=null;
	static Response rs = null;
	static String id_token=null;


	@Given("^post endpoint given in given file$")
	public void start1Method1() throws Exception {
		user=new GenerateTokenPOstMethod();
		//user = new PostUserCreationMethod();
	}
	@Then("^enter username1 and password1$")
	public void enterdetails1() throws JSONException {
		//user.addBodyParameter("username", "admin");
		//user.addBodyParameter("password", "admin");
		JSONObject req=new JSONObject();
		req.put("username", "admin");
		req.put("password", "admin");
		user.setBodyContent(req.toString());
	}
	@Then("^post the api url$")
	public static String postAPI1() {
		rs = user.callAPI();
		String rs1=rs.asString();
		id_token =new JsonPath(rs1).get("id_token");
		System.out.println(rs.getStatusCode());
//		System.out.println(id_token+"First");
//		return id_token;		
		return id_token;
	}
	
	@Given("^Authentication$")
	public void postAPI2() {
	String token=postAPI1();
		user4=new CreateBankAccountPostMethod();
		System.out.println("id_token second scenario:"+token);
        //LoggerContext context = (LoggerContext) LogManager.getContext();
       // Configurator.shutdown(context);
//		 String id_token=postAPI1();
//		user4.setAuth("id_Token");
		user4.setHeaders("Authorization=Bearer "+token);
		
		
	}
	@Then("^Pass Request$")
	public void postApi3()
	{
		
		/*
		 * JSONObject req1=new JSONObject(); req1.put("dateOfOpening","null");
		 * req1.put("openedBy","Test"); req1.put("customerId","1234");
		 * req1.put("accountNumber","123456789"); req1.put("loginId","Test");
		 * req1.put("loginPassword","Test"); req1.put("email","test@test.com");
		 * req1.put("phone","9833653536");
		 * 
		 * req1.put("bankAccountType","SAVING"); req1.put("chequeBookIssued","true");
		 * 
		 * req1.put("accountBalance","5"); req1.put("balanceCheckedOn","null");
		 * 
		 * req1.put("minimumBalance","3");
		 * 
		 * req1.put("passwordGetsExpired","false,");
		 * 
		 * req1.put("expirationPeriodDays","13");
		 * 
		 * req1.put("passwordUpdatedOn","null");
		 * 
		 * req1.put("remarks","Test");
		 * 
		 * req1.put("accountStatus","ACTIVE");
		 * 
		 * req1.put("multipleSessionAllowed","true"); req1.put("projectName","Sample");
		 * req1.put("projectCode","123456"); req1.put("requestedOn","null");
		 * req1.put("requestedBy","Test"); req1.put("accountHolderId","3");
		 * req1.put("bankBranchId","1"); req1.put("mobileNumberMappedId","1");
		 * req1.put("parentAccountId","1");
		 * 
		 */
//		user4.setBodyContent(req1.toString());
	     String rs2=user4.callAPI().asString();
		System.out.println("Response of Create Account"+rs2);
		//user4.callAPI();

		}
		@Then("^call api1$")
		public static String postAPI4() {
			String rs5 = user4.callAPI().asString();
			System.out.println(rs.getStatusCode());
			System.out.println("Done with create bank account");
			return rs5;
		}
		@Given("^specific id$")
		public static int  idspecific()
		{ 
			String p=postAPI4();
			System.out.println("Enter in third");
		int id7=new JsonPath(p).getInt("id");
			System.out.println("id is :"+ id7);
		
			return id7;
			}
        @Then("^data for that$")
		public static void idspecific1()
        {
		
		/*	getSpecificIdDetailsGet user6=new getSpecificIdDetailsGet();
			//user6.setAuth(id_token);
			user6.setHeaders("Authorization=Bearer"+" "+user6);
			user6.setMethodPath(user6.getMethodPath()+"/"+id7);
		       user6.callAPI();*/
		       System.out.println("Enter in last");
		      int i=idspecific();
		       
		       getSpecificIdDetailsGet getid = new getSpecificIdDetailsGet(String.valueOf(i));
		       System.out.println(" User Id @@@@@@@@@@@@@" + getid);
		      // getid.setHeaders("Authorization=" + "Bearer" + " " +token);
		       getid.setMethodPath(getid.getMethodPath() + "/" + i);
		       getid.callAPI();

		       
		       
		       
		       
			
		}
		

}
