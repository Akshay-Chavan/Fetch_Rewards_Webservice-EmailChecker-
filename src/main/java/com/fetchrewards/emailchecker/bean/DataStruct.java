package com.fetchrewards.emailchecker.bean;

public class DataStruct {
	
	String[] values;
	
	public DataStruct(){
		
	}

	public DataStruct(String[] values) {
		super();
		this.values = values;
	}

	public String[] getValues() {
		return values;
	}

	public void setValues(String[] values) {
		this.values = values;
	}

}
