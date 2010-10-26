<%@ include file="/layouts/header.jsp" %>

<html>
  <jsp:include page="/layouts/head.jsp">
    <jsp:param value="User login" name="title" />
  </jsp:include>
  
  <body>
    <h4>Enter your username and password to login to the event gallery.</h4>
    
    <s:form namespace="/user/session" action="create">
      <s:textfield name="login" label="Username"></s:textfield>
      <s:password name="password" label="Password"></s:password>
      <s:submit></s:submit>
    </s:form>
  </body>
</html>
