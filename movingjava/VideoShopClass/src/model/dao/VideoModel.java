package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.VideoDao;
import model.vo.Video;

public class VideoModel implements VideoDao{
	
	String url = "jdbc:oracle:thin:@192.168.0.25:1521:orcl";
	String user = "scott";
	String pass = "tiger";
	
	public VideoModel() throws Exception{
	

		// 1. 드라이버로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
		
	}
	
	
	public void insertVideo(Video vo, int count) throws Exception{
		// 2. Connection 연결객체 얻어오기
		Connection con = null;
		
		con = DriverManager.getConnection(url, user, pass); 
		// 3. sql 문장 만들기
		String sql = "INSERT INTO VIDEO VALUES (sq_videono_video.nextval,?,?,?,?,?,?)";
		// 4. sql 전송객체 (PreparedStatement)		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, vo.getVideoName());
		st.setString(2, vo.getGenre());
		st.setString(3, vo.getDirector());
		st.setString(4, vo.getActor());
		st.setString(5, vo.getExp());
		st.setInt(6, count);
		
		
		for(int i = 0; i<count; i++) {
			st.executeUpdate();			
		}
		
		
		
		// 6. 닫기
		st.close();
		con.close();
	}



	public ArrayList selectVideo(int index, String word) throws Exception {
		
		ArrayList data = new ArrayList();
		
		
		Connection con = null;
		con = DriverManager.getConnection(url, user, pass);
		
		String []colName = {"TITLE", "ACTOR"}; 
		String sql = "SELECT VIDEONO, TITLE, ACTOR FROM VIDEO "
				+ " WHERE " + colName[index] + " like '%" + word + "%'";
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			ArrayList list = new ArrayList();
			list.add(rs.getInt("VIDEONO"));
			list.add(rs.getString("TITLE"));
			list.add(rs.getString("ACTOR"));
			data.add(list);
		}
				
		rs.close();
		st.close();
		con.close();
		return data;//ArrayList의 Arraylist return
	}


	@Override
	public Video selectByPK(int vnum) throws Exception {
		
		Video vo = new Video();
		Connection con = null;
		con = DriverManager.getConnection(url, user, pass);
		
		String sql = "SELECT * FROM VIDEO WHERE VIDEONO = ?";
		//해당 비디오 번호의 비디오 정보를 검색하여 video클래스에 각각 멤버변수에 지정
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, vnum);
		
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
			vo.setVideoNo(rs.getInt("VIDEONO"));
			vo.setGenre(rs.getString("GENRE"));
			vo.setDirector(rs.getString("DIRECTOR"));
			vo.setActor(rs.getString("ACTOR"));
			vo.setExp(rs.getString("DETAIL"));
			vo.setVideoName(rs.getString("TITLE"));

		}
		
		
		rs.close();
		st.close();
		con.close();
		return vo;
		
		
		
	}
	
	
	

}
