package Lesson53.Task1;

import java.sql.*;

public class JdbcJoinDemo {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/join_db";
        String username = "root";
        String password = "12345";

        try {
            Connection con = DriverManager.getConnection(url, username, password);

            Statement st = con.createStatement();

            System.out.println("INNER JOIN:");

            String innerJoin = """
                    SELECT employees.name, departments.name AS department
                    FROM employees
                    INNER JOIN departments
                    ON employees.department_id = departments.id
                    """;

            ResultSet rs = st.executeQuery(innerJoin);

            while (rs.next()) {
                System.out.println(
                        rs.getString("name") + " - " +
                                rs.getString("department")
                );
            }

            System.out.println("\nLEFT JOIN:");

            String leftJoin = """
                    SELECT employees.name, departments.name AS department
                    FROM employees
                    LEFT JOIN departments
                    ON employees.department_id = departments.id
                    """;

            rs = st.executeQuery(leftJoin);

            while (rs.next()) {
                System.out.println(
                        rs.getString("name") + " - " +
                                rs.getString("department")
                );
            }

            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}