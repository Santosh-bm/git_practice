package com.git.testcases;

public class StringFunction {

	public static void main(String[] args) {
		String str="anuradha";
		//System.out.println(str.length());
		//int s=str.length();
		if(str.length()>=5)
		{
			System.out.println("given user id is valid");
		}
		else if(str.length()<2)
		{
			System.out.println("given user id is invalid");
		}
		else
		{
			System.out.println("id is empty");
		}

	}

}
