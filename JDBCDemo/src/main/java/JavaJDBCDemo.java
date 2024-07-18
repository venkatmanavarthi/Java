import java.sql.*;

public class JavaJDBCDemo {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:postgresql://localhost:5432/Demo";
        String user = "postgres";
        String password = "nani1234";
        String sql = "select * from student where sid = 1";

        // getting the database connection
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println("Database connection established");

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        rs.next();
        System.out.println(rs.getString("sname"));
        conn.close();
        System.out.println("Connection Closed");
    }
}
