package at.ullmann.philipp.eventGallery.models.dao;

import java.util.ArrayList;

import at.ullmann.philipp.eventGallery.business.User;

/**
 * @author Philipp Ullmann
 * A class, which implements this interface encapsulates the database access to application users.
 */
public interface IUserDAO {
  /**
   * @return All users order by name.
   */
  ArrayList<User> all() throws Exception;
}
