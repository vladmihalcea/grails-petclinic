package org.grails.samples.pages

class PageWithFooter {
	
	static content = {
		home { $('a', text: 'Home') }
	}
}
