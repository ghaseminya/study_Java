/* JDBC 연동테스트

JDBC 수행 1단계: 드라이버 클래스 로드
JDBC 수행 2단계: Connection 객체(URL, ID, PASSWORD)통해 계정 인증 수행

 */
package com.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEx {
	
	public static void main(String[] args){
		//접속 정보 저장
		//JDBC사용하면서 OracleDB를 사용하며 thin드라이버를 사용하여 IP및 포트로 접속하며 접속시 DB의 SID	를 사용합니다.
		//"jdbc:oracle:thin:@	192.168.0.10:1521:orcl";
//		String dbURL = "jdbc:oracle:thin:@192.168.0.2:1521:orcl"; //OK, 
																//tnsnames.ora, listener.ora파일의 설정 수정필요
		String dbURL = "jdbc:oracle:thin:@localhost:1521:orcl"; //OK
//		String dbURL = "jdbc:oracle:thin:@127.0.0.1:1521:orcl"; //OK
		String id = "user01";
		String passwd ="oracle12";
		
		try{
			//JDBC 수행 1단계: 드라이버 클래스 로드
			//지정된 드라이버 클래스를 찾아서 메모리에 로드시킴
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//JDBC 수행 2단계: Connection 객체(URL, ID, PASSWORD)통해 계정 인증 수행
			Connection con = DriverManager.getConnection(dbURL, id, passwd);
			System.out.println("Connection객체가 생성되었습니다.");
			System.out.println(con);
			
		}catch(SQLException e) {
			e.printStackTrace();
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();			
		}
	}
}


//출력결과
//Connection객체가 생성되었습니다.
//oracle.jdbc.driver.T4CConnection@4f2410ac