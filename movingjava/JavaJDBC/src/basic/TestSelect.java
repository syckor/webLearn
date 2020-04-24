package basic;


import java.sql.*;

public class TestSelect {

	public static void main(String[] args) {
		
		Connection con = null; 
		
		try {
			//1. 드라이버 메모리 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. Connection 얻어오기
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@192.168.0.25:1521:orcl", "scott", "tiger");
			
			//3. sql문장 잘 만들기
			String sql = "SELECT empno, ename, sal, job FROM emp";
			
			//4. 전송객체 얻어오기(카트필요)
			Statement st = con.createStatement();
			
			//5. 전송
			ResultSet rs = st.executeQuery(sql);
			
			//6. 결과 확인
			while(rs.next()) {//next가 있으면 true 없으면 false
				System.out.print(rs.getInt("EMPNO") + "\t"); //t로 줄맞춤
				System.out.print(rs.getString("ENAME") + "\t");
				System.out.print(rs.getInt("SAL") + "\t");
				System.out.println(rs.getString("JOB"));
			}
			//7. 닫기
			rs.close();
			st.close();
			
		}catch(Exception ex) {
			System.out.println("실패 :" + ex.getMessage());			
		}finally {
			try {
				con.close(); //예외가 나오더라도 얘는 무조건 실행해줘야 하기때문에 finally 에 넣어준다
			} catch (SQLException e) {}
		}
	}
}
