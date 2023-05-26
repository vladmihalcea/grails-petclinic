package org.grails.samples

import org.grails.samples.pages.WelcomePage


import grails.test.mixin.integration.Integration
import spock.lang.*

@Integration
abstract class PetclinicSpecs {
	
	def 'can go Home'() {
		when:
		home.click()
		
		then:
		at WelcomePage
	}
}
