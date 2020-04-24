package basic;


import java.sql.*;

public class TestSelect3 {

	public static void main(String[] args) {
		//hr 계정에서 사원번호, 사원 전체이름 ,부서명을 출력하되
		//급여가 3000 이상인 사원목록을 출력하세용
		try {
			//1. 드라이버 메모리 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. Connection 얻어오기
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@192.168.0.25:1521:orcl", "hr", "hr");
			
			//3. sql문장 잘 만들기(사원 테이블의 총 사원수)
//			String sql = "SELECT e.EMPLOYEE_ID, e.LAST_NAME||e.FIRST_NAME FULLNAME, d.DEPARTMENT_NAME " + //NAME뒤에 공백이 없으면 컴퓨터는 NAMEFROM으로 인식한다.
//					" FROM EMPLOYEES e, DEPARTMENTS d " + 
//					" WHERE e.DEPARTMENT_ID = d.DEPARTMENT_ID AND e.SALARY >= 3000";
			
			String sql = "SELECT e.EMPLOYEE_ID , e.LAST_NAME||e.FIRST_NAME FULLNAME, d.DEPARTMENT_NAME " + //NAME뒤에 공백이 없으면 컴퓨터는 NAMEFROM으로 인식한다.
					" FROM EMPLOYEES e INNER JOIN DEPARTMENTS d " + 
					" ON e.DEPARTMENT_ID = d.DEPARTMENT_ID " + 
					" WHERE e.SALARY >= 3000";
			
			//4. 전송객체 얻어오기(카트필요)
			Statement st = con.createStatement();
			
			//5. 전송
			ResultSet rs = st.executeQuery(sql);
			
			//6. 결과 확인
			
			while(rs.next()) {//next가 있으면 true 없으면 false
				System.out.print(rs.getInt("EMPLOYEE_ID") + "\t"+"\t");
				System.out.print(rs.getString("FULLNAME") + "\t"+"\t");
				System.out.println(rs.getString("DEPARTMENT_NAME"));
			}
			
			//7. 닫기
			rs.close();
			st.close();
			con.close();
			
		}catch(Exception ex) {
			System.out.println("실패 :" + ex.getMessage());
			
		}

	}

}
