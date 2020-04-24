package basic;

import java.sql.*;

public class TestInsert {

	public static void main(String[] args) {
		
		//1. driver loading on memory 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 문자열을 경로로 받아옴
			
		//2. Connection 얻어오기
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.25:1521:orcl", "scott", "tiger");//db경로 , 아이디, 비번
			
			
		//3. SQL문장	
			String sql = "INSERT INTO emp(empno,ename,sal) VALUES(9001,'맹순이',4000)";//sql문이므로 ' ' 유의할것
			
		//4. 전송객체 얻어오기(카트)
			Statement st = con.createStatement();
			
		//5. 전송
			st.executeUpdate(sql);
			
		//6. 닫기
			st.close();
			con.close(); //stream은 반드시 닫아줘야함
			
			System.out.println("성공");
		} catch (Exception e) {
			System.out.println("실패:" + e.getMessage());
		}

	}

}
