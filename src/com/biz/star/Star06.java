package com.biz.star;

import java.net.InetSocketAddress;

public class Star06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		triAngle(5);
		triAngle(7);
		triAngle(10);

	} // END main
	
	// method를 선언하면서 ()안에 변수 선언문을 두면 이 method를 사용(호출,call,실행)할때 method(값) 형태로 코드를 작성한다.
	// 만약 void method(int a) 형태라고 하면 사용할때는 method(3) 이라고 작성하며 자바는 method(a=3)이라는 형식으로 다시 구성을 한다.
	// 마치 method 내부에서 int a = 3이라고 변수를 선언, 생성한것과 같다.
	
	// method()내에 선언된 변수는 호출하는 곳에서 지정한 값을 method로 전달하는 매개체 역할을 한다.
	// 이 변수를 매개변수라고 부른다.
	
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
