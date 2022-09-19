package com;

public class LamdaTest {

	public static void main(String[] args) {
		
		MyInter mi= ()->{
			 System.out.println("my-inter");
		 };
		 
		 Myinter1 mi1=()->{ // lambda always returns a functional interface as return
			 System.out.println("my inter1");
		 };
		 
		 MyInter2 mi2=()->{
			return 500; 
		 };
		 
		 
		 MyInter3 mi3=(int x)->{
			 System.out.println("value of x is "+x);
		 };
		 
		 
		MyInter4 mi4= (int x)->{
			 return x+x;
		 };
		 
		 
		 MyInter5 mi5=(int n1,int n2)->{
			 System.out.println(n1+ " and "+n2);
		 };
		 
		 MyInter6 mi6=(int n1,int n2)->{
			 return n1+n2;
		 };
		 
		 int sum=mi6.f7(10, 20);
		 System.out.println(sum);
		 
		// mi5.f6(100, 200);
		 
		 //System.out.println(mi4.f5(70));
		 
		 
		 
		 
		// mi3.f4(76);
		// System.out.println(mi2.f3());
		 
		 
		 
		 
		//mi.f1();
		//mi1.f2();
		 
		 
		 
		 
		 
		 

	}

}
