<%@ include file="/jspHead.jsp" %>
<!DOCTYPE HTML>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Sign in</title>
    <link rel="stylesheet" href="<s:url value='/stylesheets/application.css' />" type="text/css" media="screen" />
  </head>
  
  <body>
    <div id="container">
      <div id="box">
        <div class="block">
          <h2>Event gallery login</h2>
          
          <div class="content">
            <s:form namespace="/user/session" action="create" cssClass="login">
              <s:textfield name="login" label="Login"></s:textfield>
              <s:password name="password" label="Password"></s:password>
              <s:submit value="Sign in"></s:submit>
            </s:form>
          </div>
        </div>
      </div>
    </div>
  </body>
</html>
