package io.github.nazcompile;

import java.util.List;
import java.util.stream.Collectors;

public class Lesson1 {

  /**
   * All exercises should be completed using Lambda expressions and the new
   * methods added to JDK 8 where appropriate. There is no need to use an
   * explicit loop in any of the code. Use method references rather than full
   * lambda expressions wherever possible.
   */
	
  /**
   * Exercise 1
   *
   * Create a string that consists of the first letter of each word in the list
   * of Strings provided.
   */
  public String exercise1(List<String> list) {
	  String result = null;
	  
	  result = list.stream()
			  	   .map(str -> str.substring(0, 1))
			  	   .collect(Collectors.joining());

	  return result;
  }
  
  /**
   * Exercise 2
   *
   * Remove the words that have odd lengths from the list.
   */
  public List<String> exercise2(List<String> list) {

    /* YOUR CODE HERE */
    return null;
  }

}
