package com.biz.star;

public class Star10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intNum1 = 30;
		int intNum2 = 40;
		addVar(intNum1, intNum2);
		
		float fN1 = 2.5f;
		float fN2 = 3.6f;
		addVar(fN1,fN2);
		
		float fN3 = 1.8f;
		int intNum3 = 7;
		addVar(fN3, intNum3);
	}
	
	public static void addVar(int intNum1, int intNum2) {
		System.out.printf(" 정수 %d, %d", intNum1, intNum2);
		System.out.println(" 덧셈 ");
		System.out.println(intNum1 + intNum2);
		
	}
	
	public static void addVar(float floatNum1, float floatNum2) {
		System.out.printf(" 실수 %f, %f", floatNum1, floatNum2);
		System.out.println(" 덧셈 ");
		System.out.println(floatNum1 + floatNum2);
		
	}
	
	public static void addVar(float floatNum3, int intNum3) {
		System.out.printf(" 실수 %f, %d", floatNum3, intNum3);
		System.out.println(" 덧셈 ");
		System.out.println(floatNum3 + intNum3);
		
	}

}
