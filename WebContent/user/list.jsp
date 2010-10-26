<%@ include file="/layouts/header.jsp" %>

<html>
  <jsp:include page="/layouts/head.jsp">
    <jsp:param value="User list" name="title" />
  </jsp:include>
  
  <body>
    <%@ include file="/layouts/logout.jsp" %>
  
    <h1>User list</h1>

    <ul>
      <s:iterator value="users">
        <li><s:property value="name" /></li>
      </s:iterator>
    </ul>
  </body>
</html>
