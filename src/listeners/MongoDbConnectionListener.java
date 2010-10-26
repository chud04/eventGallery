package listeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import models.db.MongoDb;

import com.mongodb.DB;
import com.mongodb.Mongo;

/**
 * Creates a database connection to a mongodb database.
 *
 */
public class MongoDbConnectionListener implements ServletContextListener {
  /**
   * Default constructor. 
   */
  public MongoDbConnectionListener() {
    // TODO Auto-generated constructor stub
  }

  /**
   * @see ServletContextListener#contextInitialized(ServletContextEvent)
   */
  public void contextInitialized(ServletContextEvent event) {
    ServletContext sc = event.getServletContext();
    String dbName = sc.getInitParameter("dbName");
    
    try {
      Mongo m = new Mongo();
      DB db = m.getDB(dbName);
      MongoDb.setDb(db);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * @see ServletContextListener#contextDestroyed(ServletContextEvent)
   */
  public void contextDestroyed(ServletContextEvent arg0) {
    // TODO Auto-generated method stub
  }
}
