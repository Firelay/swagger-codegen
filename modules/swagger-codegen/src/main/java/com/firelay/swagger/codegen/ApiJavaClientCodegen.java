package com.firelay.swagger.codegen;

import com.wordnik.swagger.codegen.languages.*;

public class ApiJavaClientCodegen extends JavaClientCodegen {
  	public ApiJavaClientCodegen() {
  		super();
  		apiPackage = "com.firelay.api.client.api";
    	modelPackage = "com.firelay.api.client.model";
	}
}