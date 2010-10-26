package models.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

/**
 * @author Philipp Ullmann
 * Database connection pooling management.
 */
public final class Mysql {
  /**
   * Connection pooling.
   */
  private static DataSource dataSource;
  
  /**
   * Sets the DataSource used for database connection pooling.
   * @param ds DataSource
   */
  public static void setDataSource(DataSource ds) {
    dataSource = ds;
  }
  
  /**
   * Returns a database connection object from the DataSource.
   * @return Database connection
   * @throws SQLException
   */
  public static Connection getConnection() throws SQLException {
    return dataSource.getConnection();
  }
  
  /**
   * Closes the given ResultSet, SQL Statement and Database connection.
   * @param rs ResultSet to close
   * @param stmt SQL Statement to close
   * @param con Database connection to close
   * @return true if no exception was thrown
   */
  public static boolean close(ResultSet rs, Statement stmt, Connection con) {
    try {
      if (rs != null) rs.close();
      if (stmt != null) stmt.close();
      if (con != null) con.close();
      return true;
    } catch (SQLException e) {
      return false;
    }
  }
}
