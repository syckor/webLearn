package basic;

import java.sql.*;

public class TestUpdate {

	public static void main(String[] args) {
		
		//1. driver loading on memory 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			
		//2. Connection 얻어오기
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.25:1521:orcl", "scott", "tiger");
			
			
		//3. SQL문장	
//			String sql = /*9001번사원의 이름은 '홍길숙'이고 급여는 4500으로 변경*/
//					"UPDATE emp SET ename = '홍길숙', sal = 4500 WHERE empno = 9001";
			
			//String sql = "DELETE FROM EMP_COPY";
			//20 번부서의 사원들 급여를 500달라 인상
			String sql = "UPDATE emp SET sal = sal + 500 WHERE deptno = 20";
		//4. 전송객체 얻어오기(카트)
			Statement st = con.createStatement();
			
		//5. 전송
			// int executeUqdate() : INSERT/UPDATE/DELETE
			// ResultSet executeQuery() : SELECT
			int result = st.executeUpdate(sql);
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
