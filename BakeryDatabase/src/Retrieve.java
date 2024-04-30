import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Retrieve {

    public static void retrieveData(Connection conn, String table) throws SQLException {
        String query = "SELECT * FROM " + table + ";";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        System.out.println(table + ":");
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String type = rs.getString("type");
            System.out.println("id: " + id + " name: " + name + " type: " + type);
        }
        // Close the statement and result set
        stmt.close();
        rs.close();
    }
}