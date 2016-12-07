package io.github.nazcompile

import spock.lang.Specification


class Lesson1Spec extends Specification {
	
	Lesson1 lesson1
	
	def setup() {
		lesson1 = new Lesson1()
	}

	def "Should return a string that consists of the first letter of each word in the list"() {
		when:
			def result = lesson1.exercise1(list)
		
		then:
			result == expected
		
		where:
			list			|		expected
			["alpha", "bravo", "charlie"]	|		"abc"
			["Romeo", "Juliet"]	|		"RJ"
			["Never", "accept", "zero"]	|		"Naz"
			
	}
	
	def "Should remove words with odd lengths in the list"() {
		when:
			def result = lesson1.exercise2(["delta", "foxtrot", "alpha"])
		then:
			result.size() == 0
	   
		when:
			def result2 = lesson1.exercise2(["echo", "bravo", "charlie"])	
		then:
			result2 == ["echo"]
		
		when:
			def result3 = lesson1.exercise2(["Naz", "love", "Groovy"])	
		then:
			result3 == ["love", "Groovy"]
			
	}
	
	def "Should replace every word in the list with its uppercase equivalent"() {
		when:
			def result = lesson1.exercise3(list)
		
		then:
			result == expected
		
		where:
			list			|		expected
			["alpha", "bravo", "charlie"]	|		["ALPHA", "BRAVO", "CHARLIE"]
			["Romeo", "Juliet"]	|		["ROMEO", "JULIET"]	
			["Never", "accept", "zero"]	|		["NEVER", "ACCEPT", "ZERO"]	
			
	}
	
	
}


