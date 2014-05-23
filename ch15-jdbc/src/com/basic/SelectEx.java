/* SQL - SELECT
 * 
 * 
 * rs.next()
 * next()가 ResulSet밖에 있는 커서를 ResulSet의 결과행으로 옭기고
 * next( )를 이용해서 행을 선택합니다.
 */

package com.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException; 
import java.sql.Statement; 

public class SelectEx {
	public static void main(String[] args){
		//접속 정보 저장
		String dbURL = "jdbc:oracle:thin:@192.168.0.10:1521:orcl";
		String id = "user06";
		String passwd ="1234";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
			//JDBC 수행 1단계: 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//JDBC 수행 2단계: Connection 객체 생성
			con = DriverManager.getConnection(dbURL, id, passwd);
			
			//수행 SQL문 선언
			//String sql ="SELECT * FROM test1";	//컬럼의 인덱스가 만들어진 순서
			//String sql ="SELECT id, age FROM test1";
			String sql ="SELECT age, id FROM test1";	
			//인덱스로 출력시 컬럼의 순서에 맞게 출력에 사용한 인덱스도 수정해 주어야 합니다. 그렇지 않으면 ERROR
			//DB의 인덱스가 아니라 
			//SELECT할 때 인덱스로 출력되므로 잘 마추어주어야 합니다. 인덱스보다는 컬럼명을 사용하면 ERROR를 줄일 수 있다. 
			
			//JDBC 수행 3단계: Statement객체 생성
			stmt = con.createStatement();
			
			//JDBC 수행 4단계: SQL문 실행
			//JDBC 수행 5단계: ResultSet 객체 생성
			//결과행을 ResultSet에 저장
			rs = stmt.executeQuery(sql);
			System.out.println("이름\t나이");
			
			//ResultSet에 저장된 결과행 출력
			while(rs.next()){	//
				//결과행 밖으로 나가게 되면 커서가 
				System.out.print(rs.getString("id")+"\t");
				System.out.print(rs.getInt("age")+ "\n");
				//DB 인덱스로 출력
//				System.out.print(rs.getString(1)+"\t");
//				System.out.print(rs.getInt(2)+ "\n");
				
			}	
		}catch(SQLException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}finally{	//자원관리
			//자원을 생성했던 역순으로 자원반납을 수행합니다.
			if( stmt!=null){ try{stmt.close();}catch(SQLException e){e.printStackTrace(); } }
			if( con!=null){ try{con.close();}catch(SQLException e){ e.printStackTrace(); } }		
		}		
	}
}
