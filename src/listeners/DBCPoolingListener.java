package listeners;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.sql.DataSource;

import models.db.Mysql;


/**
 * Application Lifecycle Listener implementation class DBCPoolingListener
 *
 */
public class DBCPoolingListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public DBCPoolingListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce) {
      try {
        Context envCtx = (Context) new InitialContext().lookup("java:comp/env");
        DataSource ds = (DataSource) envCtx.lookup("jdbc/GalleryDB");
        Mysql.setDataSource(ds);
      } catch (NamingException e) {
        e.printStackTrace();
      }
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce) {
        // TODO Auto-generated method stub
    }
	
}
