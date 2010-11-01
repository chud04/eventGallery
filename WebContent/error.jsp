<%@ include file="/jspHead.jsp" %>
<!DOCTYPE HTML>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Error page</title>
  </head>

  <body>
    <h4>This application has malfunctioned.</h4>
    
    <p>
      Please read through the following detailed account of the problems encounted during the processing of your request.
      After determining what mistakes you may have made, please resubmit your request.  Better luck next time!
    </p>

    <h4>Exception Name:</h4>
    
    <p><s:property value="exception" /></p>
    
    <h4>What you did wrong:</h4>

    <p><s:property value="exceptionStack" /></p>

    <h5>Also, please confirm that your Internet is working before actually contacting us.</h5>
  </body>
</html>
