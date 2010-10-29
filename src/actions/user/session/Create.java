package actions.user.session;

import java.sql.SQLException;
import java.util.Map;

import models.User;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public final class Create extends ActionSupport implements SessionAware {
  private static final long serialVersionUID = 1L;
  private String login;
  private String password;
  private Map<String, Object> session;

  public String execute() throws SQLException {
    User user = User.findByLogin(getLogin());
    
    if (user != null && user.authenticate(getPassword())) {
      System.out.println(user.getId());
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
  
  public void validate() {
    if (getPassword().length() == 0) addFieldError("password", "Password is required");
    if (getLogin().length() == 0) addFieldError("login", "Username is required");
  }
}
