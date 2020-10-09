package com.demo.SpotBugs.cust;

public class TestV {
	private String[] values; //vulnerability: unused field
	
	//public void setValues(String[] somevalues) {
       // this.values = somevalues;
//}

}
