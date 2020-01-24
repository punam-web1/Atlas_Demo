package com.qk.carina.demo.api;

import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class CreateBankAccountPostMethod extends AbstractApiMethodV2{
	public CreateBankAccountPostMethod() {
    	
       super("api/users/post1/rq.json","api/users/post1/rs.json","api/users/post1/account.properties");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    
    }
 
}
