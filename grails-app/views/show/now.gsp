<html>
<head>
	<title>Thumbtastic</title>
	<r:require module="thumbtastic" />
	<r:layoutResources />
	
</head>
<body>
	<h1> Welcome !</h1>
	<br />
	<tt:thumbWall images="${images}" thumbHeight="180" links="${links}" descriptions="${description}" />
	<r:layoutResources />
</body>
</html>