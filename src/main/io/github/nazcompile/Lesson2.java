package io.github.nazcompile;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lesson2 {
	
	/**
	 * All exercises should be completed using Lambda expressions and the new
	 * methods added to JDK 8 where appropriate. There is no need to use an
	 * explicit loop in any of the code. Use method references rather than full
	 * lambda expressions wherever possible.
	 */
	
	  private static final String WORD_REGEXP = "[- .:,]+";
	
	  /**
	   * Exercise 1
	   *
	   * Create a new list with all the strings from original list converted to 
	   * lower case and print them out.
	 * @return 
	   */
	  public List<String> exercise1(List<String> list) {
		  List<String> result = null;
		  result = list.stream()
				  .map(String::toLowerCase)
				  .collect(Collectors.toList());
		  
		  System.out.println(result);
		  return result;
	  }
	  
	  /**
	   * Exercise 2
	   *
	   * Modify exercise 1 so that the new list only contains strings that have an
	   * odd length
	 * @return 
	   */
	  public List<String> exercise2(List<String> list ) {
	    List<String> result = null;
	    result = list.stream()
			    	  .filter(str -> (str.length() % 2 != 0))
			    	  .map(String::toLowerCase)
			    	  .collect(Collectors.toList());
	    
	    System.out.println(result);
	    return result;
	  }
	  
	  /**
	   * Exercise 3
	   *
	   * Join the second, third and forth strings of the list into a single string,
	   * where each word is separated by a hyphen (-). Print the resulting string.
	 * @return 
	   */
	  public String exercise3(List<String> list) {
	    String result = null;
	    
	    if (list.size() >= 4) {
	    	result = list.stream()
	    			.filter(str -> list.subList(1, 4).contains(str)) 
	    			.collect(Collectors.joining("-"));
	    } else {
	    	result = "List should be greater than 4";
	    	//could possibly throw an exception here but out of scope for the exercise
	    }

	    System.out.println(result);
	    return result;
	  }
	  
	/**
	 * Count the number of lines in the file using the BufferedReader provided
	 */
	public long exercise4() throws IOException {
		long result = 0;
		try (BufferedReader reader = Files.newBufferedReader(
						Paths.get("Sonnet.txt"), 
						StandardCharsets.UTF_8)) {
			result = reader.lines().count();
		}
		return result;
	}
	
	/**
	   * Using the BufferedReader to access the file, create a list of words with
	   * no duplicates contained in the file.  Print the words.
	   * 
	   * HINT: A regular expression, WORD_REGEXP, is already defined for your use.
	   */
	public List<String> exercise5() throws IOException {
		List<String> result = null;
		
		try (BufferedReader reader = Files.newBufferedReader(
						Paths.get("Sonnet.txt"), 
						StandardCharsets.UTF_8)) {
			result = reader.lines()
				.map(String::toLowerCase)
				.flatMap(line -> Stream.of(line.split(WORD_REGEXP)))
				.distinct()
				.collect(Collectors.toList());
		}
		System.out.println(result);
		return result;
	}
	
	 /**
	 * Using the BufferedReader to access the file create a list of words from
	 * the file, converted to lower-case and with duplicates removed, which is
	 * sorted by natural order. Print the contents of the list.
	 */
	public List<String> exercise6() throws IOException {
		List<String> result = null;

		try (BufferedReader reader = Files.newBufferedReader(
						Paths.get("Sonnet.txt"), 
						StandardCharsets.UTF_8)) {

			result = reader.lines()
				.flatMap(line -> Stream.of(line.split(WORD_REGEXP)))
				.map(String::toLowerCase)
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		}
		System.out.println(result);
		return result;
	}
	
	  /**
	   * Modify exercise6 so that the words are sorted by length
	   */
	public List<String> exercise7() throws IOException {
		List<String> result = null;
	    try (BufferedReader reader = Files.newBufferedReader(
			    		Paths.get("Sonnet.txt"), 
						StandardCharsets.UTF_8)) {

	      result = reader.lines()
	          .flatMap(line -> Stream.of(line.split(WORD_REGEXP)))
	          .map(String::toLowerCase)
	          .distinct()
	          .sorted((a, b) -> a.length() - b.length())
	          .collect(Collectors.toList());
	    }
	    
		System.out.println(result);
		return result;
	  }
}
