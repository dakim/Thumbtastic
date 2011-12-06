modules = {
	
	hoverintend {
        dependsOn 'jquery'
        defaultBundle 'tt'
        resource url:[dir:'/js/',file:'hoverintent.js'], disposition: 'head'
    }

    thumbtastic {
        dependsOn 'jquery, hoverintend'
        defaultBundle 'tt'
        resource url:'/css/thumbtastic.css', disposition: 'head'
        resource url:'/js/thumbtastic.js', disposition: 'head'
    }

}