package actions.user;

import models.User;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Philipp Ullmann
 * Editing of an user.
 */
public final class Edit extends ActionSupport {
  private static final long serialVersionUID = 1L;
  private User userToUpdate;
  private String id;
  
  public String execute() {
    setUserToUpdate(User.findById(id));
    return SUCCESS;
  }
  
  public void setUserToUpdate(User userToUpdate) {
    this.userToUpdate = userToUpdate;
  }
  
  public User getUserToUpdate() {
    return userToUpdate;
  }
  
  public void setId(String id) {
    this.id = id;
  }
  
  public String getId() {
    return id;
  }
}
