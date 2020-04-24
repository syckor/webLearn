package c_info;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class InfoModelImpl implements InfoModel {
	
	String url = "jdbc:oracle:thin:@192.168.0.25:1521:orcl";
	String user = "scott";
	String pass = "tiger";
	
	
	public InfoModelImpl() throws Exception{
		//1. 드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
	}
	
	public void insert(InfoVO Vo) throws SQLException {//부모의 메쏘드를 정확히 오버라이딩 해야함
		
		Connection con = null;//연결객체
		
		try {
		//2. 연결객체 얻어오기
			con = DriverManager.getConnection(
					url, user, pass);
		//3. sql문장
			String sql = "INSERT INTO info_tab(name, jumin, tel, gender, age, home) "
					+ " VALUES(?,?,?,?,?,?)";
		//4. 전송객체 얻어오기
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, Vo.getName());
			st.setString(2, Vo.getId());
			st.setString(3, Vo.getTel());
			st.setString(4, Vo.getSex());
			st.setInt(5, Vo.getAge());
			st.setString(6, Vo.getHome());
			
		//5. 전송
			st.executeUpdate();
		//6.close
		
			st.close();
		}finally {
			con.close();
		} 
	}

	
	public void modify(InfoVO Vo) throws SQLException {
		Connection con = null;
		
		try {
	
			con = DriverManager.getConnection(
					url, user, pass);

			String sql = "UPDATE info_tab set name = ?, jumin = ?, gender = ?, age = ?, home = ? "
					+ " WHERE tel = ?";

			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, Vo.getName());
			st.setString(2, Vo.getId());
			st.setString(3, Vo.getSex());
			st.setInt(4, Vo.getAge());
			st.setString(5, Vo.getHome());
			st.setString(6, Vo.getTel());
			

			st.executeUpdate();
			
			
			st.close();
		}finally {
			con.close();
		} 
	}
	
	
	public ArrayList<InfoVO> selectAll() throws SQLException {
		Connection con = null;
		
		try {
			//2. 연결객체 얻어오기
				con = DriverManager.getConnection(url, user, pass);
			//3. sql문장
				String sql = "SELECT * FROM info_tab";
			//4. 전송객체 얻어오기
				PreparedStatement st = con.prepareStatement(sql);
				
			//5. 전송
				ResultSet rs = st.executeQuery(); //SELECT문일때 쿼리를 쓴다
				
				//-int excuteUpdate() : INSERT, DELETE, UPDATE
				//-ResultSet excuteQuery() : SELECT
			// 자료받아오기
				ArrayList<InfoVO> list = new ArrayList<InfoVO>();
				while(rs.next()) {
					InfoVO vo = new InfoVO();
					
					vo.setName(rs.getString("NAME"));
					vo.setId(rs.getString("JUMIN"));
					vo.setTel(rs.getString("TEL"));
					vo.setSex(rs.getString("GENDER"));
					vo.setAge(rs.getInt("AGE"));
					vo.setHome(rs.getString("HOME"));
					list.add(vo);				
				}
				
			//6.close
			
				st.close();
				
				return list;
			}finally {
				con.close();
			}
		
	}
	
	public void delete(String tel) throws SQLException {
		InfoVO vo = new InfoVO();
		Connection con = null;
		
		//2.Connection 얻어오기
		con = DriverManager.getConnection(url, user, pass);
		
		//3.SQL 만들기
		String sql = "DELETE FROM info_tab WHERE tel = ?";
		//4. 전송객체
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, tel);
		//5.전송
		
		//6. 결과처리
		
		st.executeUpdate();
		//7.닫기 
		
		
		st.close();
		con.close();
		
	
	}


	public InfoVO selectByTel(String tel) throws SQLException {
		InfoVO vo = new InfoVO();
		Connection con = null;
		//2.Connection 얻어오기
		con = DriverManager.getConnection(url, user, pass);
		//3.SQL 만들기
		String sql = "SELECT * FROM info_tab WHERE tel = ?";
		//4. 전송객체
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, tel);
		//5.전송
		ResultSet rs = st.executeQuery();
		//6. 결과처리
		if(rs.next()) {
			vo.setName(rs.getString("NAME"));
			vo.setId(rs.getString("JUMIN"));
			vo.setTel(rs.getString("TEL"));
			vo.setSex(rs.getString("GENDER"));
			vo.setAge(rs.getInt("AGE"));
			vo.setHome(rs.getString("HOME"));
		}
		
		//7.닫기 
		st.close();
		con.close();
		return vo;
	}



}
