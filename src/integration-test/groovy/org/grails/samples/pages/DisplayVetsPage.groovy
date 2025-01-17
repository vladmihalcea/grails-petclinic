package org.grails.samples.pages

class DisplayVetsPage extends PageWithFooter {

	static url = '/clinic/vets'
	
	static at = {
		title == 'Veterinarians'
	}
	
	static content = {
		table { $('table', 0)}
		headers() { table.find('thead').find('tr').find('th') }
		vets { table.find('tbody').find('tr') }
	}
	
}
