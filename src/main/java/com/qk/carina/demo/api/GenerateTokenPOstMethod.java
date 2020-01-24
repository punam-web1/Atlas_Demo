package com.qk.carina.demo.api;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GenerateTokenPOstMethod extends AbstractApiMethodV2 {
    public GenerateTokenPOstMethod() {
    	super(null,null);
       // super("api/users/post/rq.json","api/users/post/rs.json");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    
    }
}
