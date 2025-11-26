import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {

    private static final String URL = "jdbc:sqlite:pharmashare.db";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}

