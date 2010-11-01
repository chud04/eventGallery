<%@ include file="/jspHead.jsp" %>
<!DOCTYPE HTML>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>User list</title>
  </head>
  
  <body>
    <p style="text-align:right">
      <a href="<s:url namespace='/user/session' action='delete' />">Logout</a>
    </p>
  
    <h1>User list</h1>

    <ul>
      <s:iterator value="users">
        <li><s:property value="name" /></li>
      </s:iterator>
    </ul>
  </body>
</html>
