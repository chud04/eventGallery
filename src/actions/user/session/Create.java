package actions.user.session;

import java.sql.SQLException;
import java.util.Map;

import models.User;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Philipp Ullmann
 * Authenticates an user by login and password string.
 * If authentication is successful the user id is stored in the session object.
 */
public final class Create extends ActionSupport implements SessionAware {
  private static final long serialVersionUID = 1L;
  private String login;
  private String password;
  private Map<String, Object> session;

  public String execute() throws SQLException {
    User user = User.findByLogin(getLogin());
    
    if (user != null && user.authenticate(getPassword())) {
      session.put("userId", user.getId());
    } else {
      return INPUT;
    }
    
    return SUCCESS;
  }
  
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }
  
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setSession(Map<String, Object> session) {
    this.session = session;
  }
  
  /**
   * Validates presence of login and password string.
   */
  public void validate() {
    if (getPassword().length() == 0) addFieldError("password", "is required");
    if (getLogin().length() == 0) addFieldError("login", "is required");
  }
}
