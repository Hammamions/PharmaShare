import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MedicationDAO {

    public MedicationDAO() {
        try (Connection conn = database.connect();
             Statement stmt = conn.createStatement()) {

            stmt.execute("""
                CREATE TABLE IF NOT EXISTS medications (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    name TEXT,
                    category TEXT,
                    expiration_date TEXT,
                    location TEXT
                )
            """);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addMedication(Medication m) throws SQLException {
        String sql = "INSERT INTO medications(name, category, expiration_date, location) VALUES(?,?,?,?)";
        try (Connection conn = database.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, m.getName());
            pstmt.setString(2, m.getCategory());
            pstmt.setString(3, m.getExpirationDate());
            pstmt.setString(4, m.getLocation());
            pstmt.executeUpdate();
        }
    }

    public List<Medication> getAll() throws SQLException {
        List<Medication> list = new ArrayList<>();
        String sql = "SELECT * FROM medications";

        try (Connection conn = database.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                list.add(new Medication(
                    rs.getString("name"),
                    rs.getString("category"),
                    rs.getString("expiration_date"),
                    rs.getString("location")
                ));
            }
        }
        return list;
    }
}
