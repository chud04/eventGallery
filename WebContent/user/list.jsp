<%@ include file="/jspHead.jsp" %>
<!DOCTYPE html>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>User list</title>
    <link rel="stylesheet" href="<s:url value='/stylesheets/application.css' />" type="text/css" media="screen" />
  </head>
  
  <body>
    <div id="container">
      <div id="header">
        <h1><a href="<s:url namespace='/user' action='list' />">Event gallery</a></h1>
        
        <div id="user-navigation">
          <ul class="wat-cf">
            <li><a href="<s:url namespace='/user/session' action='delete' />" class="logout">Logout</a></li>
          </ul>
        </div>
        
        <div id="main-navigation">
          <ul class="wat-cf">
            <li class="first active"><a href="<s:url namespace='/user' action='list' />">Users</a></li>
          </ul>
        </div>
      </div>
      
      <div id="wrapper" class="wat-cf">
        <div id="main">
          <div class="block">
            <div class="content">
              <h2 class="title">User list</h2>
              
              <div class="inner">
                <table class="table">
                  <tr>
                    <th class="first">ID</th>
                    <th>Name</th>
                    <th>Login</th>
                    <th>Password</th>
                    <th class="last">&nbsp;</th>
                  </tr>
                  
                  <s:iterator value="users" status="row">
                  <tr class="<s:if test="#row.odd == true ">odd</s:if><s:else>even</s:else>">
                    <td><s:property value="id" /></td>
                    <td><s:property value="name" /></td>
                    <td><s:property value="login" /></td>
                    <td><s:property value="password" /></td>
                    <td class="last">
                      <a href="">Show</a> |
                      <a href="">Edit</a> |
                      <a href="">Delete</a>
                    </td>
                  </tr>
                  </s:iterator>
                </table>
                
                <div class="actions-bar wat-cf">
                  <div class="actions">
                    <a href="">New</a>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </body>
</html>