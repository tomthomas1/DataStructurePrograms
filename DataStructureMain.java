package com.balancedParanthesis;

public class DataStructureMain {
	public static void main(String[] args) {

		String str = "(5+6)*(7+8)/(4+3)(5+6)*(7+8)/(4+3)";
		SimpleBalancedParanthesis obj = new SimpleBalancedParanthesis(str.length());

		obj.check(str);
	}
}