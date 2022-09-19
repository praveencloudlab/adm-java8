package com;

public class Lamda_Thread {
	
	public static void main(String[] args) {
		
		Runnable r=()->{
			System.out.println(">> I am "+Thread.currentThread().getName());
		};
		
		Thread t1=new  Thread(r);
		
		t1.setName("Thread1");
		
		t1.start();
		
		
		
		 Comparable<Integer> cc=(s1)->s1.compareTo(50000);
		 
		 int res = cc.compareTo(5000);
		 
		 if(res==0) {
			 System.out.println("Eual");
		 }
		 if(res>0) {
			 System.out.println("Bigger");
		 }
		 if(res<0) {
			 System.out.println("Smaller");
		 }
		
		
		
	}

}
