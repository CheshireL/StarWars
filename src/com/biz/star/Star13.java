package com.biz.star;

public class Star13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=5; i<100; i++) {
			triAngle(i);
		}
	}
	
		public static void triAngle(int intStarCount) {
		
			if(intStarCount >10) {
				System.out.println("별은 10까지만 찍을수 있음");
				return;
				// method 내의 코드가 실행되는 동안 return 문을 만나면 그 자리에서 더이상 진행되지 않고 method를 중단하고
				// 호출,실행한 곳으로 돌아간다.
			} 
			
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
