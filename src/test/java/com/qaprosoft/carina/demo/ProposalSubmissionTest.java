package com.qaprosoft.carina.demo;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.dataprovider.annotations.XlsDataSourceParameters;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.utils.tag.Priority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestPriority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestTag;
import com.qk.carina.demo.api.POSTProposalSubmission;

public class ProposalSubmissionTest extends AbstractTest{

	@Test(dataProvider = "DataProvider", description ="Testing Policy Quote API", threadPoolSize = 100,invocationCount = 25,timeOut = 1800000)
    @MethodOwner(owner = "nilesh")
	@TestPriority(Priority.P3)
	@TestTag(name = "Squad", value = "offer_squad1")
    @TestTag(name = "test_type", value = "end-2-end")
	@TestTag(name = "feature", value = "offers")
	@XlsDataSourceParameters(path = "testdata/preissuance/xls/proposalsubmission.xlsx", sheet = "Calculator", dsUid = "Test_Cases", dsArgs = "firstname, lastname, emailid, mobile, type, maritalStatus, nationality, annualIncome, occupation, relationToHolder, sumAssured")
	
	public void Proposal_Submission(String firstname, String lastname, String emailid, String mobile, String type, String maritalStatus, String nationality, String annualIncome, String occupation, String relationToHolder, String sumAssured)
	{	
		System.out.println(System.currentTimeMillis());
		POSTProposalSubmission proposubmit = new POSTProposalSubmission();
		Response rs = proposubmit.callAPI();
		long rsTime = rs.timeIn(TimeUnit.MILLISECONDS);
		System.out.println("Response time: " + rsTime);
		
		
		
	}

}