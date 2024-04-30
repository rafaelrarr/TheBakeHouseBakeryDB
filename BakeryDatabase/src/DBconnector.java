import java.sql.*;

public class DBconnector {
    private static String url = "jdbc:mysql://cs.neiu.edu:3306/SP24CS3151_rromero8?serverTimezone=UTC&";
    url += "user=SP24CS3151_rromero8&password=rromero8707297";




    public static String getUrl() {
        return url;
    }

    public static void main(String[] args) {
        try {
            dataBaseCon();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void dataBaseCon() throws SQLException {

        try (Connection conn = DriverManager.getConnection(getUrl())) {
            Statement stmt = conn.createStatement();

            String query1 = "SELECT * FROM Products";
            ResultSet rs1 = stmt.executeQuery(query1);
            System.out.println("Products:");
            while (rs1.next()) {
                int id = rs1.getInt("id");
                String name = rs1.getString("name");
                String type = rs1.getString("type");
                System.out.println("id: " + id + " name: " + name + " type: " + type);
            }

            String query2 = "SELECT * FROM Materials";
            ResultSet rs2 = stmt.executeQuery(query2);
            System.out.println("\nMaterials:");
            while (rs2.next()) {
                int id = rs2.getInt("id");
                String name = rs2.getString("name");
                String price = rs2.getString("price");
                System.out.println("id: " + id + " product: " + name + " price: " + price);
            }
        }
    }
}



