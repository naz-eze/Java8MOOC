package io.github.nazcompile

import spock.lang.Specification

class Lesson2Spec extends Specification {
	
	Lesson2 lesson2
	
	def setup() {
		lesson2 = new Lesson2()
	}

	def "Should return new list with all the strings from original list converted to lower case"() {
		when:
			def result = lesson2.exercise1(list)
		
		then:
			result == expected
		
		where:
			list				|		expected
			["The", "Quick", "BROWN"]	|		["the", "quick", "brown"]
			["Fox", "Jumped", "Over"]	|		["fox", "jumped", "over"]
			["The", "LAZY", "DOG"]		|		["the", "lazy", "dog"]
			
	}

}
