package com.wordnik.swagger.codegen;

import java.util.Comparator;


public class CodegenParameterComparator implements Comparator<CodegenParameter> {

	@Override
	public int compare(CodegenParameter o1, CodegenParameter o2){
	  //ensure pathparams come first
	  if(o1.isPathParam != null && o1.isPathParam && (o2.isPathParam == null || !o2.isPathParam)){
	    return -1;
	  } else if(o2.isPathParam != null && o2.isPathParam && (o1.isPathParam == null || !o1.isPathParam)){
      return 1;
    }
		return o1.paramName.compareTo(o2.paramName);
	}
}