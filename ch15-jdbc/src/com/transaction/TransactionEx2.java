/* 수동으로 TRANSACTION 제어 - 오토커밋 문제점 해결
 * 
 * 
 * 오토 커밋를 수동 커밋처리로 변경하여 수행하기 
 * 문제발생시 모든 트랜젝션 ROLLBACK시키기 
 * -----------------------------------------------------------------------------------------------
 * 
 * 여러개의 쿼리문 수행시 데이터외곡을 방지하기 위해 수동커밋 사용(트렌젝션 처리)
 * 예외가 발생한 경우에만 ROLLBACK가능하기 때문에
 * SQL문을 철저하게 검증해야 합니다. (정상적인 SQL문인 경우는 rollback할수 없습니다)
 */

package com.transaction;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class TransactionEx2 {

	public static void main(String[] args) {
		//접속 정보 저장
//		String dbURL = "jdbc:oracle:thin:@192.168.0.10:1521:orcl";
		String dbURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "user01";
		String passwd ="oracle12";
		
		Connection con = null;
		Statement stmt = null;
		String sql ="";
		
		//SQL문의 정상 수행 유무확인 변수
		boolean success = false;
		
		try{
			//JDBC 1단계: DRIVER 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//JDBC 2단계: Connection 객체 생성
			con = DriverManager.getConnection(dbURL, id, passwd);
			//AUTO커밋은 Connection에서 기본설정되어 있음
			//AUTO커밋 해제
			con.setAutoCommit(false);
			//JDBC 3단계: Statement객체 생성
			stmt = con.createStatement();
			
			//SQL문 수행1: INSERT
			sql = "INSERT INTO test1 values('sys10', 101)";
			stmt.executeUpdate(sql);	//JDBC 4단계: SQL 실행
			//SQL문 수행2: INSERT
			sql = "INSERT INTO test1 values('sys20', 202)";
			stmt.executeUpdate(sql);			
			//SQL문 수행3: INSERT
			sql = "INSERT INTO test1 values('sys30', 303)";
			stmt.executeUpdate(sql);
			//SQL문 수행4: INSERT
			//고의로 오류 발생시킴
			sql = "INSERT INTO test1 values('sys40', 404";	//ERROR: java.sql.SQLException: ORA-00917: 누락된 콤마
			stmt.executeUpdate(sql);					
			
			//SQL문이 정상수행되지 못하는 경우 catch(SQLException e)문으로 이동하게 됩니다.
			//SQL문이 정상적으로 수행되었을 경우
			success = true;
			
			System.out.println("SQL문 수행완료");
			
		}catch(SQLException e){
			e.printStackTrace();
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();			
		}finally{	
			try{
				if(success){	//정상적으로 데이터 처리
					con.commit();

				}else{			//비정상적으로 데이터 처리
					con.rollback();
				}
			}catch(SQLException e){ e.printStackTrace(); }			
			
			//자원관리
			if( stmt!=null){ try{stmt.close();}catch(SQLException e){e.printStackTrace();} }
			if( con!=null){ try{con.close();}catch(SQLException e){e.printStackTrace();} }			
		}
	}
}
