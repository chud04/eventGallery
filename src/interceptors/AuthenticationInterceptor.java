package interceptors;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import models.User;
import models.UserAware;

/*
 * This intercepter provides authentication for the secure actions of the application.
 * It does two things. First, it checks the session scope map to see if there's user 
 * object present, which indicates that the current user is already logged in. If this
 * object is not present, the intercepter alters the workflow of the request by returning 
 * a login control string that causes the request to forward to the login page.
 * 
 * If the user object is present in the session map, then the intercepter injects the user
 * object into the action by calling the setUser method, and then allows the processing of 
 * the request to continue.
 *
 */
public final class AuthenticationInterceptor implements Interceptor {
  private static final long serialVersionUID = 1L;

  public void destroy() {
  }

  public void init() {
  }

  public String intercept(ActionInvocation actionInvocation) throws Exception {
    Map<String, Object> session = actionInvocation.getInvocationContext().getSession();
    String userId = (String) session.get("userId");
    
    if (userId == null) {
      return Action.LOGIN;
    } else {
      User user = models.User.findById(userId);
      Action action = (Action) actionInvocation.getAction();
      if (action instanceof UserAware) ((UserAware) action).setUser(user);
      return actionInvocation.invoke();
    }
  }
}
