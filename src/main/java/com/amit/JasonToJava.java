package com.amit;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JasonToJava {
	
	public static void main(String[] args) {
		
		String jstr="{\r\n"
				+ " \"id\":1,\r\n"
				+ " \"name\":\"Amit\",\r\n"
				+ " \"college\":\"YIT\"\r\n"
				+ "}";
		
		
		ObjectMapper om=new ObjectMapper();
		
		try {
			Student st = om.readValue(jstr, Student.class);
			System.out.println("ID:"+st.getId()+" Name: "+st.getName()+" College: "+st.getCollege());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
