package com;

public class Test {

	public static void main(String[] args) {
		//System.out.println(">>> Test");
		
		
		//C1 c1=new C1(); // bad code
		//c1.f1();
		
		MyInter mii=new C1();
		mii.f1();
		
		MyInter c2=new MyInter() { // 
			
			@Override
			public void f1() {
				System.out.println("f1 method of c2..");
				
			}
			
		};
		
		//c2.f1();
		
		
		
		// Lambda : always returns an interface
		
		 MyInter mi=()->{
			 System.out.println("this is some interface implemention code..");
		 };
		 
		 mi.f1();
		 
		
		
		
		
		
		
		

	}

}
