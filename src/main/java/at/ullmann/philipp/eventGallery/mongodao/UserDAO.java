package at.ullmann.philipp.eventGallery.mongodao;

import java.util.ArrayList;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.spring.config.DbFactoryBean;

import at.ullmann.philipp.eventGallery.business.User;
import at.ullmann.philipp.eventGallery.models.dao.IUserDAO;

/**
 * @author Philipp Ullmann
 * Encapsulates database operations on an user document.
 */
public final class UserDAO implements IUserDAO {
  private DbFactoryBean db;
  
  public UserDAO(DbFactoryBean db) {
    this.db = db;
  }
  
  @Override
  public ArrayList<User> all() throws Exception {
    ArrayList<User> users = new ArrayList<User>();
    DBCursor cur = db.getObject().getCollection("users").find().sort(new BasicDBObject("name", 1));
    
    while(cur.hasNext()) {
      DBObject doc = cur.next();
      User user = new User((String) doc.get("_id"),
                           (String) doc.get("name"),
                           (String) doc.get("login"),
                           (String) doc.get("password"));
      users.add(user);
    }
    
    return users;
  }
}
