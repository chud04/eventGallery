package models;

/**
 * Actions which implement this interface get the current logged in user object injected.
 */
public interface UserAware {
  public void setUser(User user);
}
