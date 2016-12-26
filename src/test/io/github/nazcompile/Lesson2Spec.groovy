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
	
	def "Should return new list containing strings with an odd length"() {
		when:
			def result = lesson2.exercise2(list)
		
		then:
			result == expected
		
		where:
			list				|		expected
			["The", "Quick", "BROWN"]	|		["the", "quick", "brown"]
			["Fox", "Jumped", "Over"]	|		["fox"]
			["The", "LAZY", "DOG"]		|		["the", "dog"]
	}
	
	def "Should return string with second, third, and fourth string joined together seperated by -"() {
		when:
			def result = lesson2.exercise3(list)
	
		then:
			result == expected
		
		where:
			list						|		expected
			["one", "two", "three", "four", "five"]		|	"two-three-four"
			["a", "b", "c", "d"]				|	"b-c-d"
			["1", "2"]					|	"List should be greater than 4"
	}
	
	def "should return correct number of linex in text file"() {
		expect:
			lesson2.exercise4() == 4
	}
	
	def "should return list of words with no duplicates in the file"() {
		expect:
			lesson2.exercise5() == ['from', 'fairest', 'creatures', 'we', 'desire', 
				 'increase', 'that', 'thereby', "beauty's", 'rose', 'might', 'never', 
				 'die', 'but', 'as', 'the', 'riper', 'should', 'by', 'time', 'decease',
				 'his', 'tender', 'heir', 'bear', 'memory'] 
	}
	
	def "should return list of words with no duplicates in the file, sorted by natural order"() {
		expect:
			lesson2.exercise6() == ['as', 'bear', "beauty's", 'but', 'by', 'creatures', 'decease', 'desire',
					'die', 'fairest', 'from', 'heir', 'his', 'increase', 'memory', 'might', 'never', 
					'riper', 'rose', 'should', 'tender', 'that', 'the', 'thereby', 'time', 'we']

	}
	
	def "should return list of words with no duplicates in the file, sorted by length"() {
		expect:
			lesson2.exercise7() == ['we', 'as', 'by', 'die', 'but', 'the', 'his', 'from', 'that',
					'rose', 'time', 'heir', 'bear', 'might', 'never', 'riper', 'desire', 'should',
					'tender', 'memory', 'fairest', 'thereby', 'decease', 'increase', "beauty's", 'creatures']
	
	}


}
