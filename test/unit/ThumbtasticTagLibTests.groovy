package thumbtastic

import grails.test.*

class ThumbtasticTagLibTests extends TagLibUnitTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }


    void testRenderTaglib() {
    	log.info "Starting testRenderTaglib"
    	mockTagLib ThumbtasticTagLib

    	def images = ["thumbstatis.jpg"]
    	def links = ["/humbtastic/show/1"]

    	def attrs = [images:images, links:links]
    	assertNotNull tagLib.thumbWall(attrs,null)
    }
}
