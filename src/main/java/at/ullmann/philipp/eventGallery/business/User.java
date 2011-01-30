package at.ullmann.philipp.eventGallery.business;

/**
 * @author Philipp Ullmann
 * An user of the application.
 */
public final class User {
  private String id;
  private String name;
  private String login;
  private String password;
  
  /**
   * Sets the id, name, login and password attributes.
   * @param id
   * @param name
   * @param login
   * @param password
   */
  public User(String id, String name, String login, String password) {
    this.id = id;
    this.name = name;
    this.login = login;
    this.password = password;
  }
  

  public String getId() {
    return id;
  }
  

  public String getName() {
    return name;
  }
  

  public String getLogin() {
    return login;
  }
  

  public String getPassword() {
    return password;
  }
}
