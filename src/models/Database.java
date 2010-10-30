package models;

import com.mongodb.DB;

/**
 * @author Philipp Ullmann
 * Stores a mongo db database connection.
 */
public final class Database {
  private static DB db = null;
  
  /**
   * Sets the database if not null.
   * @param database
   */
  public static void setDb(DB database) {
    if (db == null) db = database;
  }
  
  /**
   * Returns the database.
   * @return Database
   */
  public static DB getDb() {
    return db;
  }
}
