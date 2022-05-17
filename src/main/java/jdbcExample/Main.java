package jdbcExample;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println("Hi~~");
        //JDBC 드라이버 로드
        Class.forName("com.mysql.cj.jdbc.Driver"); //classNotFoundException 예외 처리 해야 함
        String dbUrl = "jdbc:mysql://localhost:3306/user";
        String dbUser = "root";
        String dbPassword = "1212@12";
        Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
        //커리 생성
        String query = "SELECT * FROM user";
        PreparedStatement ps = conn.prepareStatement(query);
        //ps.setString(1, "CSE123");

        //쿼리 실행 및 결과 얻기
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            System.out.println(
                    rs.getString("id") + " " +
                    rs.getString("name") + " " +
                            rs.getString("account") + " " +
                            rs.getString("pass")
            );
        }
        conn.close(); //커넥션 종료 / 자원 반납
    }
}


