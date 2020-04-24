package basic;

import java.sql.*;

public class TestInsert2 {

	public static void main(String[] args) {
		
		Connection con = null;
		
		//화면에서 입력값 받아서 저장한 변수 상상
		int empno = 9003;
		String ename = "김순이";
		int sal = 5000;
		
		
		//1. driver loading on memory 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 문자열을 경로로 받아옴
			
		//2. Connection 얻어오기
			con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.25:1521:orcl", "scott", "tiger");//db경로 , 아이디, 비번
			
			
		//3. SQL문장	
			String sql = "INSERT INTO emp(empno,ename,sal) VALUES(?,?,?)";//물음표를 만들어준다
			
			System.out.println(sql);
			
		//4. 전송객체 얻어오기(카트)
			//Statement st = con.createStatement();
			
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, empno);
			st.setString(2, ename);
			st.setInt(3, sal);//여기서 위의 물음표를 채워준다
			
		//5. 전송(****************) statement는 sql을 안가져가니까 sql을 갖고 가야하는데 
			st.executeUpdate();//prepared는 sql을 끌고 가니까 여기서 sql이 빠져야함
			
		//6. 닫기
			st.close();
						
			System.out.println("성공");
		} catch (Exception e) {
			System.out.println("실패:" + e.getMessage());
		} finally {
			try {
				con.close();
			} catch (SQLException e) {} //stream은 반드시 닫아줘야함
			
		}
	}
}
