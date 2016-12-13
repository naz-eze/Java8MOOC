package io.github.nazcompile;

import java.util.List;
import java.util.stream.Collectors;

public class Lesson2 {
	
	/**
	 * All exercises should be completed using Lambda expressions and the new
	 * methods added to JDK 8 where appropriate. There is no need to use an
	 * explicit loop in any of the code. Use method references rather than full
	 * lambda expressions wherever possible.
	 */
	
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
	    
	    /* YOUR CODE HERE */
	    return result;
	  }


}
