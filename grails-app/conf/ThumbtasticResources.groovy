modules = {
	
	hoverintend {
        dependsOn 'jquery'
        defaultBundle 'tt'
        resource url:[plugin:'thumbtastic', dir:'/js/', file:'hoverintent.js'], disposition: 'head'
    }

    thumbtastic {
        dependsOn 'jquery, hoverintend'
        defaultBundle 'tt'
        resource url:[plugin:'thumbtastic', dir:'/css/', file:'thumbtastic.css'], disposition: 'head'
        resource url:[plugin:'thumbtastic', dir:'/js/', file:'thumbtastic.js'], disposition: 'head'
    }

}