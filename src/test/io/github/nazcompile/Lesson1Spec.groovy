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
			list							|		expected
			["alpha", "bravo", "charlie"]	|		"abc"
			["Romeo", "Juliet"]				|		"RJ"
			["Never", "accept", "zero"]		|		"Naz"
			
	}

	
	
}


