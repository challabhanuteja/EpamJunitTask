package com.epam.junit_task;

public class Task {
	
	public String taskMethod(String s)
	{
		int n = s.length();
		String s1="";
		if(n>0 && s.charAt(0)!='A')
		{
			s1+=s.charAt(0);
		}
		if(n>1 && s.charAt(1)!='A' )
		{
			s1+=s.charAt(1);
		}
		if(n>2) {
		s1 += s.substring(2);
		}
		return s1;
	}
}
