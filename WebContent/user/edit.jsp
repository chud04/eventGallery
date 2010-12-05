<%@ include file="/jspHead.jsp" %>
<!DOCTYPE html>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Edit <s:property value="userToUpdate.name" /></title>
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
              <h2 class="title">Edit <i><s:property value="userToUpdate.name" /></i></h2>
              
              <div class="inner">
                <s:form namespace="/user" action="update">
                  <s:hidden name="id" value="%{userToUpdate.id}"></s:hidden>
                  <s:textfield label="Name" name="userToUpdate.name" key="userToUpdateName" required="true"></s:textfield>
                  <s:textfield label="Login" name="userToUpdate.login" key="userToUpdateLogin" required="true"></s:textfield>
                  <s:textfield label="Password" name="userToUpdate.password" key="userToUpdatePassword" required="true"></s:textfield>
                  
                  <div class="group navform wat-cf">
                    <s:submit value="Save"></s:submit> or <a href="<s:url namespace='/user' action='list' />">Cancel</a>
                  </div>
                </s:form>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </body>
</html>