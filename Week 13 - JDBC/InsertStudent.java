import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertStudent {
    public static void main(String[] args) {
        String sql = "INSERT INTO students (reg_no, name, course) VALUES (?, ?, ?)";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, "S13/00123/23");
            statement.setString(2, "Jane Wanjiru");
            statement.setString(3, "BSc Actuarial Science");

            statement.executeUpdate();
            System.out.println("Student record inserted successfully.");
        } catch (SQLException e) {
            System.out.println("Insert failed: " + e.getMessage());
        }
    }
}
