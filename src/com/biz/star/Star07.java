package com.biz.star;

public class Star07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 다음에 나열된 두 숫자의 덧셈, 곱셈을 계산하여 콘솔에 보여주는 코드를 작성하시오
		 * 30,40
		 * 50,20
		 * 100,200
		 * 3,100
		 * 5,20
		 * 
		 * 
		 */
		
			System.out.printf("%d + %d = %d",30,40,30+40);
			System.out.printf("%d * %d = %d",30,40,30*40);
			
			System.out.printf("%d + %d = %d",50,20,50+20);
			System.out.printf("%d * %d = %d",50,20,50*20);
			
			System.out.printf("%d + %d = %d",100,200,100+200);
			System.out.printf("%d * %d = %d",100,200,100*200);
		
		
		cheshire(30,40);
		cheshire(50,20);
		cheshire(100,200);
		cheshire(3,100);
		cheshire(5,20);
		
	

	}
	
		public static void cheshire(int intA, int intB) {
		 
			System.out.printf("%d + %d = %d",intA,intB,intA+intB);
			System.out.println();
			System.out.printf("%d x %d = %d",intA,intB,intA*intB);
			System.out.println();
		
		
		
	}

	

}
