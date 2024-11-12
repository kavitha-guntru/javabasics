package exception;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLE18{
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nonexistentdb", "user", "password");
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }
}

