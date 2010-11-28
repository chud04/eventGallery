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
              <s:textfield name="login" label="Login" labelposition="beside"></s:textfield>
              <s:password name="password" label="Password" labelposition="beside"></s:password>
              
              <div class="group navform wat-cf">
                <div class="right">
                  <s:submit value="Sign in"></s:submit>
                </div>
              </div>
            </s:form>
          </div>
        </div>
      </div>
    </div>
  </body>
</html>
