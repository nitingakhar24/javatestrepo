package com.sample.misc;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicates  
{ 
   public static void main(String[] args) {
	   
	   RemoveDuplicates removeDuplicates = new RemoveDuplicates();
	   
	   String input = "aaaabbbccdddeeefffggghhijkkklaaA";
	   
	   System.out.println("String after removing duplicates " + removeDuplicates.removeDuplicates(input));
	   System.out.println("String after removing duplicates " + removeDuplicates.removeDuplicateChars2(input));
	   System.out.println("String after removing duplicates " + removeDuplicates.removeDuplicateChars(input));

	
}
   public String removeDuplicates(String input){
	    String result = "";
	    for (int i = 0; i < input.length(); i++) {
	        if(!result.contains(String.valueOf(input.charAt(i)))) {
	            result += String.valueOf(input.charAt(i));
	        }
	    }
	    return result;
	}
   

   private String removeDuplicateChars2(String sourceStr) {
       // Store encountered letters in this string.
       char[] chrArray = sourceStr.toCharArray();
       Set<Character> set1 = new LinkedHashSet<Character>();
       StringBuilder sb = new StringBuilder();
       
       // Loop over each character.
       for (char value : chrArray) {
           set1.add(value);
       }
       
       for(char ch:set1)
           sb.append(ch);
       
       return sb.toString();
   }
   
   private String removeDuplicateChars(String sourceStr) {
	   Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		char charArray[] = sourceStr.replaceAll("\\s", "").toCharArray();
		for (Character ch : charArray) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		String outPut = "";
		
		for(Map.Entry<Character, Integer> entry : map.entrySet())
		{
			outPut+=entry.getKey();
		}
		
		return outPut;
		
   }

   
} 