<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title><fmt:message key="welcome.title"/></title>
  </head>
  
  <body>
    <h1><fmt:message key="welcome.title"/></h1>
    
    <p>Locale = ${pageContext.response.locale}</p>
    
    <ul>
      <li>
        <a href="?locale=en_us">us</a> |
        <a href="?locale=en_gb">gb</a> |
        <a href="?locale=de_de">de</a>
      </li>
    </ul>
</body>
</html>