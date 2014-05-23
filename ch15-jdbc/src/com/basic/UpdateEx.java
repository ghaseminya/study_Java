/* SQL - Update
 * 
 */

package com.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateEx {

	public static void main(String[] args) {
		//접속 정보 저장
		String dbURL = "jdbc:oracle:thin:@192.168.0.10:1521:orcl";
		String id = "user06";
		String passwd ="1234";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try{
			//JDBC 1단계: 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//JDBC 2단계: Connection 객체 생성
			con = DriverManager.getConnection(dbURL, id, passwd);
			//JDBC 3단계: Statement 객체 생성
			stmt = con.createStatement();
			
			
			//DB 업데이트(수정)
			sql = "UPDATE test1 SET age=10 WHERE id='bluebird'";
			//sql = "UPDATE test1 SET age=10";	//WHERE절 뺀경우
			//sql = "UPDATE test1 SET age=20 WHERE id='dragon'";	//없는 ID 수정 시도
			//JDBC 4단계: SQL 실행
			int count = stmt.executeUpdate(sql);			
			System.out.println(count + "개 행의 정보를 수정했습니다.");
			
			
			//DB 전체 데이터 읽기
			sql ="SELECT * FROM test1";
			//JDBC 4단계: SQL 실행
			//JDBC 5단계: ResultSet에 결과 저장
			rs = stmt.executeQuery(sql);
			System.out.println("ID\tAge");
			while(rs.next()){
				System.out.print(rs.getString("id")+ "\t");
				System.out.print(rs.getInt("age")+ "\n");				
			}			
		}catch(SQLException e){
			e.printStackTrace();
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			
		}finally{
			if( stmt!=null){ try{stmt.close();}catch(SQLException e){e.printStackTrace();} }
			if( con!=null){ try{con.close();}catch(SQLException e){e.printStackTrace(); } }			
		}
	}
}
