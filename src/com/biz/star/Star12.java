package com.biz.star;

public class Star12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		triAngle(3);
		
		for(int i=5; i<= 20; i++) {
			triAngle(i);
		}
		

	}
		public static void triAngle(int intStarCount) {
		
		//int intStarCount = 10;
		
			for(int j = 0; j < intStarCount; j++) {
			for(int k = j; k < intStarCount; k++) {
				System.out.print(" ");
				
				}
				for(int i = 0; i < j; i++) {
				System.out.print("* ");
				}
				System.out.println();
			}
		}// END triAngle
	
}
