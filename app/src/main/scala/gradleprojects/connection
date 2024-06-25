package gradleprojects

import java.sql.{Connection, DriverManager, ResultSet}
import scala.util.{Try, Success, Failure}

object SimpleToCheckJdbc {
  def main(args: Array[String]): Unit = {
    // Database connection properties
    val url = "jdbc:sqlserver://DESKTOP-3DHUOFN\\MSSQLSERVER:1433;databaseName=TestDATABASE"
    val userName = "sa"
    val password = "1234"

    // Try to establish a connection
    val connectionTry: Try[Connection] = Try {
      DriverManager.getConnection(url, userName, password)
    }

    connectionTry match {
      case Success(connection) =>
        println("Connection established successfully")
        // Perform database operations
        performDatabaseOperations(connection)
        // Close the connection
        connection.close()
      case Failure(exception) =>
        println(s"Connection has failed: ${exception.getMessage}")
    }
  }

  def performDatabaseOperations(connection: Connection): Unit = {
    // Example of performing a query
    val statement = connection.createStatement()
    val resultSet: ResultSet = statement.executeQuery("SELECT * FROM Person")

    // Iterate over the results
    while (resultSet.next()) {
      val id = resultSet.getInt("id")
      val name = resultSet.getString("name")
      println(s"ID: $id, Name: $name")
    }

    // Clean up
    resultSet.close()
    statement.close()
  }
}
