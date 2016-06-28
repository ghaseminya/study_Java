/* SQL - SELECT

ResultSet
	• SQL문에 대한 결과를 처리할 수 있는 객체
 
 
커서(cursor)
	• 모든 데이터를 한번에 가져올 수 없기 때문에 cursor의 개념을 가지고 있습니다.
	• cursor는 ResultSet 객체가 가져올 수 있는 행의 위치을 지정해 줍니다. 
	• 처음 커서의 위치는 결과물(필드)에 위치하지 않기 때문에 cusror를 이동해야 합니다. 
	• 커서를 이동하는 역할은 ResultSet 의 next() 메서드가 수행합니다. 
	• next() 메서드의 리턴 타입은 boolean 인데 이는 다음 행의 결과물(필드)이 있으면 true, 없으면 false를 리턴 합니다.


ResultSet.getxxx()
	• ResultSet 객체가 결과물(필드)을 가져올 수 있는 행으로 이동이 되었다면 해당 행의 실제 결과물(필드)을 가져와야 합니다. 
	• ResultSet 인터페이스에는 결과물(필드)을 가져오는 수많은 메서드(getXXX())를 제공합니다.
	• getXXX() 메서드는 XXX에 oracle의 자료형 타입에 따라 호출해주면 됩니다. 
	• 예를 들어 id 컬럼이 varchar2 타입이면 getString() 메서드를 사용 하고, age 컬럼이 number 타입이면 getInt() 메서드를 사용하면 됩니다.
	• getXXX() 메서드는 두개씩 오버로드 되어 정의 되어 있는데 하나는 정수를 인자로 받는 것과 String 타입으로 인자를 받는 메서드를 제공하고 있습니다.


ResultSet.next()
	• 커서(cursor)를 이동하는 메서드가 ResultSet 의 next() 메서드이다. 
	• 첫번째 정수를 받는 타입은 select 문 다음에 쓰는 컬럼명의 인덱스를 지정하는데 인덱스의 처음번호는 1부터 시작하게 된다. 

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
//		String dbURL = "jdbc:oracle:thin:@192.168.0.2:1521:orcl";
		String dbURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "user01";
		String passwd ="oracle12";
		
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
			rs = stmt.executeQuery(sql); //executeQuery() 메서드를 실행한 결과로 ResultSet 객체를 리턴
			System.out.println("이름\t나이");
			
			//ResultSet에 저장된 결과행 출력
			while(rs.next()){
				//next()가 ResulSet밖에 있는 커서를 ResulSet의 결과행으로 옭기고 next()를 이용해서 행을 이동합니다.
//				System.out.print(rs.getString("id")+"\t");
//				System.out.print(rs.getInt("age")+ "\n");
				
				//DB 인덱스로 출력 (동일한 출력결과) 
				//인텍스는 1부터 시작하며 열이 나열만 반대순으로 번호가 붙습니다.
				//ID(2), AGE(1)
//				System.out.print(rs.getString(2)+"\t");
//				System.out.print(rs.getInt(1)+ "\n");

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



//출력결과
//이름	나이
//codedragon	88
//prettybird	70