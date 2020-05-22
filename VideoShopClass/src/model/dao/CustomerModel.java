package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.CustomerDao;
import model.vo.Customer;

public class CustomerModel implements CustomerDao{
	String url = "jdbc:mysql://192.168.0.77:3306/DB?serverTimezone=UTC";
	String user = "root";
	String pass = "1234";
	
	
	public CustomerModel() throws Exception{
		// 1. 드라이버로딩
		Class.forName("com.mysql.cj.jdbc.Driver");
				
	}
	
	public void insertCustomer(Customer cvo) throws Exception{
		Connection con = null;
		System.out.println("연결성공");
		
		// 2. Connection 연결객체 얻어오기
		con = DriverManager.getConnection(url, user, pass);
		
		// 3. sql 문장 만들기 (insert문장)//sequence.nextBy
		String sql = "INSERT INTO MEMBERM(TEL, NAME, TEL2, ADDR, EMAIL) "
				+ " VALUES(?,?,?,?,?)";		
		// 4. sql 전송객체 (PreparedStatement)	
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, cvo.getCustTel1());
		st.setString(2, cvo.getCustName());
		st.setString(3, cvo.getCustTel2());
		st.setString(4, cvo.getCustAddr());
		st.setString(5, cvo.getCustEmail());
		
		// 5. sql 전송
		st.executeUpdate();
		
		// 6. 닫기 
		st.close();
		con.close();
	}
	
	public Customer selectByTel(String tel) throws Exception{
		
		Customer dao = new Customer();
		
		Connection con = null;
		con = DriverManager.getConnection(url, user, pass);
		
		String sql = "SELECT * FROM memberm WHERE tel = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, tel);
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			dao.setCustName(rs.getString("NAME"));
			dao.setCustTel1(rs.getString("TEL"));
			dao.setCustTel2(rs.getString("PHONE"));
			dao.setCustAddr(rs.getString("ADRESS"));
			dao.setCustEmail(rs.getString("EMAIL"));
			
			
		}
		rs.close();
		st.close();
		con.close();
		return dao;
		
	}
	
	public Customer selectByName(String name) throws Exception{
		
		Customer dao = new Customer();
		
		Connection con = null;
		con = DriverManager.getConnection(url, user, pass);
		
		String sql = "SELECT * FROM memberm WHERE NAME = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, name);
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			dao.setCustName(rs.getString("NAME"));
			dao.setCustTel1(rs.getString("TEL"));
			dao.setCustTel2(rs.getString("PHONE"));
			dao.setCustAddr(rs.getString("ADRESS"));
			dao.setCustEmail(rs.getString("EMAIL"));			
		}
		rs.close();
		st.close();
		con.close();
		return dao;
		
	}
	
	public int updateCustomer(Customer vo) throws Exception{
		Connection con = null;
		con = DriverManager.getConnection(url, user, pass);
		
		String sql = "UPDATE memberm SET NAME = ?, PHONE = ?, ADRESS = ?, "
				+ " EMAIL = ? WHERE TEL = ?";
	
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, vo.getCustName());
		st.setString(2, vo.getCustTel2());
		st.setString(3, vo.getCustAddr());
		st.setString(4, vo.getCustEmail());
		st.setString(5, vo.getCustTel1());
		
		st.executeUpdate();
		
		
		st.close();
		con.close();
		
		int result = 0;		
		return result;
	}
}
