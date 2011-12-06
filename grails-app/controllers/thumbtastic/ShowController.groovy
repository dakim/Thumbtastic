package thumbtastic

class ShowController {

	def grailsApplication

    def index = { }

    def now = {

    	def images = []
    	def links = []
    	def description = []

    	(1..20).each{
    		images << "${grailsApplication.config.grails.serverURL}/images/thumb.png"
    		links << "${grailsApplication.config.grails.serverURL}/show/detail/${it}"
    		description << "a valid Text for tha img ${it}, and another valida text"
    	}
    	[images:images, links:links, description:description]
    }

    def detail = {
    	render "<h1> This is the link nr. ${params.id} </h1>"
    }
}
