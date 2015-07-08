package com.wordnik.swagger.codegen;

import java.util.Comparator;


public class CodegenParameterComparator implements Comparator<CodegenParameter> {

	@Override
	public int compare(CodegenParameter o1, CodegenParameter o2){
		return o1.paramName.compareTo(o2.paramName);
	}
}