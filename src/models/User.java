package models;

import java.util.ArrayList;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoException;

import models.db.MongoDb;

/**
 * @author Philipp Ullmann
 * Application user.
 */
public final class User {
  /**
   * Unique identifier
   */
  private String id;
  /**
   * Name
   */
  private String name;
  /**
   * Login string
   */
  private String login;
  /**
   * Login password.
   */
  private String password;

  public User() {}
  
  /**
   * Sets the user attributes from the given DBObject doc.
   * @param doc DBObject
   */
  private User(DBObject doc) {
    id = doc.get("_id").toString();
    name = (String) doc.get("name");
    login = (String) doc.get("login");
    password = (String) doc.get("password");
  }
  
  /**
   * Loads all users from the database.
   * @return Users
   */
  public static ArrayList<User> all() {
    ArrayList<User> users = new ArrayList<User>();
    DBCursor cur = dbColl().find().sort(new BasicDBObject("name", 1));
    while(cur.hasNext()) users.add(new User(cur.next()));
    return users;
  }
  
  /**
   * Loads the user with the given login name from the database. If no user is found null is returned.
   * @param login Login name
   * @return Found user or null
   */
  public static User findByLogin(String login) {
    return findByAttribute("login", login);
  }

  /**
   * Loads the user with the given id from the database.
   * @param id User id
   * @return User or null
   */
  public static User findById(String id) {
    return findByAttribute("id", new ObjectId(id));
  }
  
  /**
   * Saves a new user to the database.
   * @param name User name
   * @param login User login string
   * @param password User password
   * @return true if the creation was successful otherwise false is returned
   */
  public static boolean create(String name, String login, String password) {
    boolean success = true;
    BasicDBObject doc = new BasicDBObject();
    doc.append("name", name);
    doc.append("login", login);
    doc.append("password", password);
    
    try {
      dbColl().insert(doc);
    } catch (MongoException e) {
      e.printStackTrace();
      success = false;
    }
    
    return success;
  }
  
  /**
   * Finds an user with user attribute == value.
   * @param name Attribute name
   * @param value Attribute value
   * @return
   */
  private static User findByAttribute(String name, Object value) {
    User user = null;
    DBObject userDoc = dbColl().findOne(new BasicDBObject(name, value));
    if (userDoc != null) user = new User(userDoc);
    return user;
  }
  
  /**
   * Returns the user database collection.
   * @return User database collection
   */
  private static DBCollection dbColl() {
    return MongoDb.getDb().getCollection("users");
  }
  
  /**
   * Returns the user name.
   * @return Name
   */
  public String getName() {
    return name;
  }

  /**
   * Returns the login string.
   * @return Login string
   */
  public String getLogin() {
    return login;
  }
  
  /**
   * Returns the user id.
   * @return User id
   */
  public String getId() {
    return id;
  }

  /*
   * Returns the user's name.
   */
  public String toString() {
    return getName();
  }
  
  /**
   * Checks if the given password is correct (User authentication).
   * @param password User password
   * @return true if correct otherwise false
   */
  public boolean authenticate(String password) {
    return this.password.equals(password);
  }
}
