package com.qk.carina.demo.api;

import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class getSpecificIdDetailsGet extends AbstractApiMethodV2{
	 public getSpecificIdDetailsGet(String p) {
		 
		 super(null,"api/users/get1/rs.json");
	    	
		// super(null,"api/users/get1/rs.json","api/users/get1/get.properties");
	       // super("api/users/post/rq.json","api/users/post/rs.json");
	        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	    
	    }

}
