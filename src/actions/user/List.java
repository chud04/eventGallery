package actions.user;

import java.sql.SQLException;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Philipp Ullmann
 * Lists all users.
 */
public final class List extends ActionSupport {
  private static final long serialVersionUID = 1L;
  private ArrayList<models.User> users;

  public String execute() throws SQLException {
    setUsers(models.User.all());
    return SUCCESS;
  }
  
  public ArrayList<models.User> getUsers() {
    return users;
  }

  public void setUsers(ArrayList<models.User> users) {
    this.users = users;
  }
}
