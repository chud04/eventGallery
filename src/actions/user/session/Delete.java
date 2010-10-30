package actions.user.session;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Philipp Ullmann
 * The current logged in user is logged out by deleting the user sesssion id.
 */
public final class Delete extends ActionSupport implements SessionAware {
  private static final long serialVersionUID = 1L;
  private Map<String, Object> session;

  public String execute() {
    session.remove("userId");
    return LOGIN;
  }
  
  public void setSession(Map<String, Object> session) {
    this.session = session;
  }
}
