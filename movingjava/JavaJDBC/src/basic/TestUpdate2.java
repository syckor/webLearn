package basic;

import java.sql.*;

public class TestUpdate2 {

	public static void main(String[] args) {
		
		
		int deptno = 20;
		int salInc = 500;
		
		//1. driver loading on memory 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			
		//2. Connection 얻어오기
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.25:1521:orcl", "scott", "tiger");
			
			
		//3. SQL문장	

			//20 번부서의 사원들 급여를 500달라 인상
			String sql = "UPDATE emp SET sal = sal + ? WHERE deptno = ?";
		//4. 전송객체 얻어오기(카트)
			//Statement st = con.createStatement();
			
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setInt(1,salInc);
			st.setInt(2, deptno);
			
			
		//5. 전송
			
			int result = st.executeUpdate();
			System.out.println(result + "행을 실행함");
		//6. 닫기
			st.close();
			con.close(); 
			
			System.out.println("성공");
		} catch (Exception e) {
			System.out.println("실패:" + e.getMessage());
		}

	}

}
