# Thumbtastic Plugin

Thumbtastic image wall is inspired by one from a well known search engine provider.

### Features
- polaroid styled thumbs auto aligning in a div
- delayed zoom on mouse over
- descriptions visible while zoomed in
- simple to use



## Taglib

Include resources into header

  <r:require module="thumbtastic" />

Example usage

	<tt:thumbWall images="${images}" thumbHeight="180" links="${links}" descriptions="${description}" />


###Attributes

- `images` - a list of linked images
- `thumbHeight` - height of the thumbs
- `links` - link behind the thumb, this list has the same order as `images`
- `links` - description for each thumb, this list has the same order as `images`
