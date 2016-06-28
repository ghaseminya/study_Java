/* SQL - DELETE 
 * 
 * -----------------------------------
 * 자바는 AUTO COMMIT이다.
 * 그래서, 롤백(ROLLBACK)이 되지 않습니다.
 */


package com.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeleteEx {

	public static void main(String[] args) {
		//접속 정보 저장
//		String dbURL = "jdbc:oracle:thin:@192.168.0.10:1521:orcl";
		String dbURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "user01";
		String passwd ="oracle12";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql="";		
		
		try{
			//JDBC 1단계: Driver 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//JDBC 2단계: Connection 객체 생성
			con = DriverManager.getConnection(dbURL, id, passwd);
			//JDBC 3단계: Statement객체 생성
			stmt = con.createStatement();			
			
			//DELETE시 WHERE쓰지 않고 삭제할 경우 복구 불가능합니다.
			//자바는 자동커밋되기 때문에 롤백이 되지 않습니다.
//			sql="DELETE FROM test1 WHERE id='bigbird'"; //조건에 맞는 데이터 없는 경우
			sql="DELETE FROM test1 WHERE id='prettybird'"; //조건에 맞는 데이터가 있는 경우
			
			//JDBC 4단계: SQL문 실행
			//결과는 int형으로 반환
			int count = stmt.executeUpdate(sql);
			//반환된 정수값을 출력해서 SQL문이 실행된 후 적용된 레코드의 개수를 확인할 수 있습니다.
			System.out.println(count +"개의 행이 삭제되었습니다");
			
			sql="SELECT * FROM test1";
			//JDBC 5단계: 결과 ResultSet에 저장
			rs = stmt.executeQuery(sql);
			System.out.println("ID\tAGE");
			
			//결과행 출력
			while(rs.next()){
				System.out.print(rs.getString("id") + "\t" + rs.getInt("age") + "\n");				
			}			
		}catch(SQLException e){
			e.printStackTrace();
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			
		}finally{	//자원관리
			if( stmt!=null){ try{stmt.clearBatch();}catch(SQLException e){e.printStackTrace(); } };
			if( con!=null){ try{con.close();}catch(SQLException e){e.printStackTrace();} }			
		}
	}
}


//출력결과
//1개의 행이 삭제되었습니다
//ID	AGE
//codedragon	88