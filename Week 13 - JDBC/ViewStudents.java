import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ViewStudents {
    public static void main(String[] args) {
        String sql = "SELECT * FROM students";

        try (Connection connection = DBConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet results = statement.executeQuery(sql)) {

            while (results.next()) {
                String regNo = results.getString("reg_no");
                String name = results.getString("name");
                String course = results.getString("course");
                System.out.println(regNo + " | " + name + " | " + course);
            }
        } catch (SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
        }
    }
}
