package basic;


import java.sql.*;

public class TestSelect2 {

	public static void main(String[] args) {
		
		try {
			//1. 드라이버 메모리 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. Connection 얻어오기
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@192.168.0.25:1521:orcl", "scott", "tiger");
			
			//3. sql문장 잘 만들기(사원 테이블의 총 사원수)
			String sql = "SELECT count(*) cnt FROM emp";
			
			//4. 전송객체 얻어오기(카트필요)
			Statement st = con.createStatement();
			
			//5. 전송
			ResultSet rs = st.executeQuery(sql);
			
			//6. 결과 확인
			rs.next(); // 첫줄부터 불러오는데 첫줄은 값이 아니기 때문에 앞에 꼭 next()를 해줘야함
			int result = rs.getInt("CNT");
			System.out.println("사원수는 " + result + "명 입니다");
			
			
			//7. 닫기
			rs.close();
			st.close();
			con.close();
			
		}catch(Exception ex) {
			System.out.println("실패 :" + ex.getMessage());
			
		}

	}

}
