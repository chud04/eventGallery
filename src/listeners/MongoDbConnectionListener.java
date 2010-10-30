package listeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import models.Database;
import models.User;

import com.mongodb.DB;
import com.mongodb.Mongo;

/**
 * Creates a database connection to a mongodb database and creates the admin user.
 */
public class MongoDbConnectionListener implements ServletContextListener {
  /**
   * Default constructor. 
   */
  public MongoDbConnectionListener() {
  }

  /**
   * Loads the database name "dbName" from the context, creates a database connection and an admin user if necessary.
   */
  public void contextInitialized(ServletContextEvent event) {
    ServletContext sc = event.getServletContext();
    String dbName = sc.getInitParameter("dbName");
    
    try {
      Mongo m = new Mongo();
      DB db = m.getDB(dbName);
      Database.setDb(db);      
      if (User.findByLogin("admin") == null) User.create("Admin", "admin", "secret");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * @see ServletContextListener#contextDestroyed(ServletContextEvent)
   */
  public void contextDestroyed(ServletContextEvent arg0) {
  }
}
