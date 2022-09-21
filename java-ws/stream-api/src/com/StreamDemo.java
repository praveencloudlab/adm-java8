package com;

import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		Integer x[]= {87,43,23,12,98};
		// note: stream does not support un-boxing. so it doesn't support primitives
		
		Stream<Integer> ops=Stream.of(x);
		
		//Integer i = ops.findFirst().orElse(null);
		//System.out.println(i);
		
		//ops.forEach(n->{
			//System.out.println(n);
		//});
		
		ops.forEach(System.out::println); // :: method reference
		
		
		
		
		

	}

}
