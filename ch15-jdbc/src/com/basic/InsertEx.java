/* SQL - INSERT
 * 데이터 넣기
  
JDBC 수행 1단계: 드라이버 클래스 로드
JDBC 수행 2단계: Connection 객체(URL, ID, PASSWORD)통해 계정 인증 수행
JDBC 수행 3단계: Statement 객체 생성
JDBC 수행 4단계: SQL문 실행
 */

package com.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertEx {
	public static void main(String[] args){
		//접속 정보 저장
		//JDBC사용하면서 OracleDB를 사용하며 thin드라이버를 사용하여 해당 IP및 포트로 접속 및 DB의 SID						//
		//"jdbc:oracle:thin:@192.168.0.10:1521:orcl";
//		String dbURL = "jdbc:oracle:thin:@192.168.0.10:1521:orcl";
		String dbURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "user01";
		String passwd ="oracle12";
		
		Connection con = null;
		Statement stmt = null;
		
		try{
			//JDBC 수행 1단계: 드라이버 클래스 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//JDBC 수행 2단계: Connection 객체(URL, ID, PASSWORD)통해 계정 인증 수행
			con = DriverManager.getConnection(dbURL, id, passwd);
			
			//SQL문장을 String 변수로 저장
			//String sql = "INSERT INTO test1(id, age) VALUES('prettybird', 70)";
			String sql = "INSERT INTO test1(id, age) VALUES('codedragon', 88)";
			
			//JDBC 수행 3단계: Statement 객체 생성
			//Table에 접속해서 SQL문 수행
			stmt = con.createStatement();
			
			//JDBC 수행 4단계: SQL문 실행
			//executeUpdate() 실행후 입력된 행의 갯수를 반환함
			int count = stmt.executeUpdate(sql);			
			System.out.println(count + "개의 행을 추가하였습니다.");
			
		}catch(SQLException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}finally{ //자원 관리
			if( stmt!=null){ try{stmt.close();}catch(SQLException e){e.printStackTrace();} }
			if( con!=null){ try{con.close();}catch(SQLException e){e.printStackTrace();} }			
		}		
	}
}


//출력결과
//1개의 행을 추가하였습니다.