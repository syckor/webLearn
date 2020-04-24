package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.RentDao;


public class RentModel implements RentDao{
	String url = "jdbc:oracle:thin:@192.168.0.25:1521:orcl";;
	String user = "scott";
	String pass = "tiger";
	
	
	Connection con;
	
	public RentModel() throws Exception{
		// 1. 드라이버로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");		
	}


	public String selectByTel(String tel) throws Exception {
		con = DriverManager.getConnection(url, user, pass); 
		
		String sql = "SELECT NAME FROM MEMBER WHERE TEL = ?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, tel);
		
		String name = null;
		ResultSet rs = st.executeQuery();
		while(rs.next()) {
			name = rs.getString("NAME");
		}
		rs.close();
		st.close();
		con.close();
		
		return name;
	}

	/**
	 *  함수명 : rentVideo
	 *  역할 : 대여테이블에 정보를 입력
	 *  인자 : 전화번호(String), 비디오번호(int)
	 *  리턴값 : 없음
	 */
	public void rentVideo(String tel, int vnum) throws Exception {
		con = DriverManager.getConnection(url, user, pass); 
		String sql ="INSERT INTO RENTAL (RENTNO, RENTDATE, VIDEONO, TEL)"
				+ " VALUES(sqc_rental.nextval, SYSDATE ,?, ?)";
		//                (대여번호, 대여날짜, 비디오번호, 전화번호)
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setInt(1, vnum);
		st.setString(2, tel);
		
		st.executeUpdate();
		
		st.close();
		con.close();
	}


	public int returnVideo(int vnum) throws Exception {
		con = DriverManager.getConnection(url, user, pass); 
		
		String sql = "UPDATE RENTAL SET returncheck = 't', rentfee = '1500' where VIDEONO = ?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, vnum);
		
		st.executeUpdate();
		
		st.close();
		con.close();
		
		return 0;
	}


	public ArrayList selectList() throws Exception {
		ArrayList data = new ArrayList();
		
		con = DriverManager.getConnection(url, user, pass); 
		String sql = "SELECT  r.VIDEONO, v.TITLE, m.NAME, r.TEL, (r.RENTDATE+3) returndate, '미납' noreturn" + 
				" FROM rental r, video v, member m " + 
				" WHERE r.VIDEONO = v.VIDEONO AND r.TEL = m.TEL";
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			ArrayList list = new ArrayList();
			list.add(rs.getInt("VIDEONO"));
			list.add(rs.getString("TITLE"));
			list.add(rs.getString("NAME"));
			list.add(rs.getString("TEL"));
			list.add(rs.getString("returndate"));
			list.add(rs.getString("noreturn"));
			data.add(list);
		}
		
		rs.close();
		st.close();
		con.close();
		return data;
	}
	
	
}
