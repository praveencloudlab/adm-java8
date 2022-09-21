package com;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		//List<String> strings = Arrays.asList("Abc","Xyz","test","Hello","A","B");

		//Stream<String> s1 = strings.stream();
		//System.out.println(s1.count());
		//List<String> r1 = s1.filter(str->str.length()>=2).collect(Collectors.toList());
		//System.out.println(r1); // [Abc, Xyz, test, Hello]
		Stream<String> streamBuilder =Stream.<String>builder()
						.add("a")
						.add("b")
						.add("c")
						.build();
		
		//streamBuilder.forEach(obj->System.out.println(obj));
		
		//streamBuilder.forEach(System.out::println); // :: method reference
		
	//	streamBuilder.limit(1)
	//	.forEach(System.out::println); // for each must be the last function in a stream
		
		
		//Stream.iterate()
		Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
		//streamIterated.forEach(System.out::println);
		
		//Stream of String
		
		//IntStream streamOfChars = "ABC".chars();
		//streamOfChars.forEach(System.out::println);
		
		//char ch='A';
		//System.out.println((int)ch);
		
		//Stream<String> streamOfString =
				 // Pattern.compile(",").splitAsStream("a,b,c");
		
		//streamOfString.forEach(System.out::println);
		
		//Stream<String> stream = Stream.of("a", "b", "c")
		//						.filter(element -> element.contains("bb"));
		//		String anyElement = stream.findAny().orElse(null);
		//		System.out.println(anyElement);
		
		
		/*
		List<String> elements =
				  Stream.of("a", "b", "c","b")
				  	.filter(element -> element.contains("b"))
				    .collect(Collectors.toList());
				
				Optional<String> anyElement = elements.stream().findAny();
				Optional<String> firstElement = elements.stream().findFirst();
				
				System.out.println(anyElement);
				System.out.println(firstElement);
		*/
		//Stream<String> onceModifiedStream =Stream.of("abcd", "bbcd", "cbcd").skip(1);
		//onceModifiedStream.forEach(System.out::println);// bbcd    cbcd
		
		//Lazy Invocation
		
		List<String> list = Arrays.asList("abc1", "abc2", "abc3");
		counter = 0;
		Stream<String> stream = list.stream().filter(element -> {
		    wasCalled(); // 3
		    return element.contains("2");
		});
		
		System.out.println(counter);

		stream.forEach(System.out::println); // lazy
		
		System.out.println(counter);
		

		
	}

	private static long counter;
	 
	private static void wasCalled() {
	    counter++;
	}
}
