package com;

public class LambdaTestV1 {
	
	public static void main(String[] args) {
		
		// MyInter interface 
		
		/*
		MyInter mi=()->{
			System.out.println("hello mi");
		};
		*/
		
		//MyInter mi=()->System.out.println("Hello mi ....");
		
		//mi.f1();
		
		/*
		MyInter2 mi2=()->{
			return 100;
		};
		*/
		
		MyInter2 mi2=()->1000;
		//System.out.println(mi2.f3());
		
		/*
		MyInter3 mi3=(int x)->{
			System.out.println("hello mi3: x: "+x);
		};
		*/
		
		MyInter3 mi3=(x)->System.out.println("Hello mi3.. x is "+x);
		
		MyInter4 mi4=(x)->x*x;
		
		//System.out.println(mi4.f5(7));
		
		
		MyInter5 mi5=(x,y)->System.out.println(x+" and "+y);
		
		//mi5.f6(10,20);
		
		MyInter6 mi6=(i,j)->i+j;
		MyInter6 mi66=(i,j)->i*j;
		//System.out.println(mi6.f7(100, 50));
		
		mi6.info();
		mi6.info1();
		
		MyInter6.info3();
		
		
		
		//mi3.f4(98);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
