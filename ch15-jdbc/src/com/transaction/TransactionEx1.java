/* 수동으로 TRANSACTION 제어 - 오토커밋 문제점 확인
 * 
 * 
 * 오토 커밋 처리
 * 수동 커밋 처리
 * -------------------------------------------------------------------
 * 오토 커밋 되기 때문에 
 * SQL문 1~3은 수행되고 4만 수행안되어서
 * 데이터의 외곡이 일어날수 있는 문제가 발생합니다.
 * 
 * 오토 커밋되어 오류시 ROLLBACK을 수행할 수 없습니다. 
 * 
 */

package com.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class TransactionEx1 {

	public static void main(String[] args) {
		//접속 정보 저장
		String dbURL = "jdbc:oracle:thin:@192.168.0.10:1521:orcl";
		String id = "user06";
		String passwd ="1234";
		
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql ="";
		
		
		try{
			//JDBC 1단계 수행: DRIVER로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//JDBC 2단계: Connection 객체 생성
			con = DriverManager.getConnection(dbURL, id, passwd);
			//JDBC 3단계: Statement객체 생성
			stmt = con.createStatement();
			
			//SQL문 수행1: INSERT
			sql = "INSERT INTO test1 values('sys01', 10)";
			stmt.executeUpdate(sql);	//JDBC 4단계: SQL 실행
			//SQL문 수행2: INSERT
			sql = "INSERT INTO test1 values('sys02', 20)";
			stmt.executeUpdate(sql);			
			//SQL문 수행3: INSERT
			sql = "INSERT INTO test1 values('sys03', 30)";
			stmt.executeUpdate(sql);
			//SQL문 수행4: INSERT
			//고의로 오류 발생시킴
			sql = "INSERT INTO test1 values('sys04', 40";	//ERROR:	java.sql.SQLException: ORA-00917: 누락된 콤마
			stmt.executeUpdate(sql);		
			
			System.out.println("SQL문 수행완료");
			
			
//			int count = stmt.executeUpdate(sql);
//			rs = stmt.executeQuery(sql);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			if( stmt!=null){ try{stmt.clearBatch();}catch(SQLException e){e.printStackTrace(); } };
			if( con!=null){ try{con.close();}catch(SQLException e){e.printStackTrace();} }	
			
		}

	}

}
