package actions.user;

import models.User;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Philipp Ullmann
 * Editing of an user.
 */
public final class Edit extends ActionSupport {
  private static final long serialVersionUID = 1L;
  private User user;
  private String id;
  
  public String execute() {
    user = User.findById(id);
    return SUCCESS;
  }
  
  /**
   * @param user the user to set
   */
  public void setUser(models.User user) {
    this.user = user;
  }
  
  /**
   * @return the user
   */
  public User getUser() {
    return user;
  }
  
  /**
   * @param id the id to set
   */
  public void setId(String id) {
    this.id = id;
  }
  
  /**
   * @return the id
   */
  public String getId() {
    return id;
  }
}
