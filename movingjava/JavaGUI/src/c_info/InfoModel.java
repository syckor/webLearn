package c_info;

import java.sql.SQLException;
import java.util.ArrayList;

public interface InfoModel {
	
	/*public abstract 자동생성*/
	void insert(InfoVO Vo) throws SQLException;
	ArrayList<InfoVO> selectAll() throws SQLException;
	void delete(String tel) throws SQLException;	
	InfoVO selectByTel(String tel) throws SQLException;
	
	void modify(InfoVO Vo) throws SQLException;
	
}
