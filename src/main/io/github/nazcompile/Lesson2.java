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
	    }

	    return result;
	  }


}
