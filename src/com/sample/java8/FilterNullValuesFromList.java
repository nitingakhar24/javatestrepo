package com.sample.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNullValuesFromList 
{

	public static void main(String[] args) {
		
		List<String> arrayList = Arrays.asList("Java", "Python", null, "Groovy", null, "RubyOnRails", "C#","C++");
		List<String> updatedList = arrayList.stream().filter(x->x != null).collect(Collectors.toList());
		updatedList.forEach(System.out::println);
		
	}
}
