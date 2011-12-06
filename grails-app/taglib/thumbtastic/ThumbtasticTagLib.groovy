package thumbtastic

class ThumbtasticTagLib {

	static namespace = "tt"

	/*
	* Thumbtastic is a dynamic floating imagethumbwall with a delayed hover zoom effect
	* 
	* @version 0.1
	*
	* @param images[]			urls to image destination
	* @param links[]			links to be wrapped on images, size must be equals to urls
	* @param description[]		optional, a small text or markup, size must be equals to urls
	* @param thumbHeight		default 180, strongly recommond to set this value
 	*
	*/
	def thumbWall = { attrs ->
	
		def images = attrs.images
		def links = attrs.links
		def descriptions = attrs.descriptions


		int imageHeight =  attrs.thumbHeight ? Integer.valueOf(attrs.thumbHeight): 180
		int imageShrinkHeight = imageHeight / 1.5
		int listHeight = imageShrinkHeight * 1.1
		int marginTop = imageHeight * -0.8


		if(images.size() != links.size() || (descriptions != null && descriptions.size()!= images.size()))    		
	    	throw new ArrayIndexOutOfBoundsException()

	    def markup = new groovy.xml.MarkupBuilder(out)   

		markup.ul('class': 'thumb', "id":"thumbwall"){

	 	 	for(def i =0; i< images.size(); i++){

	 	 		def imageUrl = images[i]
	 	 		def link = links[i]
				def description = descriptions != null ? descriptions[i] : ''

				li('style': "height:${listHeight}px") {
					a("href": "${link}") {
						markup.img('src': imageUrl, 'height': "${imageShrinkHeight}px"){

							div('class':'detail','style':"margin-top:${marginTop}px;"){
								markup.img('src': imageUrl, 'style': "max-height:${imageHeight}px"){
									span {
										yield("${description}", false)
									}
								}
							}
						}
					}
				}
			}
		}
    }
}
