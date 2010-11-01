<%@ include file="/jspHead.jsp" %>
<!DOCTYPE HTML>

<html>
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title>Sign in</title>
  <link rel="stylesheet" href="<s:url value='/stylesheets/base.css' />" type="text/css" media="screen" />
  <link rel="stylesheet" href="<s:url value='/stylesheets/themes/default/style.css' />" type="text/css" media="screen" />
</head>
  
  <body>
    <div id="container">
      <div id="box">
        <h1>Event gallery</h1>
      
        <div class="block">
          <h2>Login Box</h2>
          
          <div class="content">
            <s:form namespace="/user/session" action="create">
              <s:textfield name="login" label="Login" labelSeparator="" cssClass="text_field"></s:textfield>
              <s:password name="password" label="Password" labelSeparator="" cssClass="text_field"></s:password>
              <s:submit cssClass="button" value="Sign in"></s:submit>
            </s:form>
          </div>
        </div>
      </div>
    </div>
  </body>
</html>
