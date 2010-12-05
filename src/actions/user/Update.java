package actions.user;

import models.User;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public final class Update extends ActionSupport implements Preparable {
  private static final long serialVersionUID = 1L;
  private String id;
  private User userToUpdate;
  
  public String execute() {
    System.out.println(userToUpdate.getName());
    return userToUpdate.save() ? SUCCESS : INPUT;
  }
  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
  
  public void validate() {
    if (userToUpdate.getLogin().length() == 0) {
      addFieldError("login", "is required");
    }
    
    if (userToUpdate.getPassword().length() == 0) {
      addFieldError("password", "is required");
    } else {
      if (userToUpdate.getPassword().length() < 5) addFieldError("password", "length must be creator than 4");
    }
    
    if (userToUpdate.getName().length() == 0) addFieldError("name", "is required");
  }

  public void prepare() throws Exception {
    userToUpdate = User.findById(getId());
  }
}
