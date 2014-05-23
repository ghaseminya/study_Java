/* BufferedReader
 *  
 * -------------------------------------------------------------
 * 
 * System.in: 기본입력(byte입력)
 * 
 * BufferedReader 클래스
 * -BufferedReader가 문자열(String)로 처리
 * -입력데이터의 개수의 상관없이 라인바이라인으로 읽어들인다. 
 * 
 */

package com.reader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderEx {

	public static void main(String[] args){
		BufferedReader br = null;
		String line ="";
		
		try{
			//데코레이션 패턴
			//InputStream형의 System.in을 InputStreamReader생성자의 인자로 지정하여 byte처리를 char처리로 변경시켰으며, 
			//다시 BufferedRedaer를 사용하여 한 라인씩 입력데이터를 처리할 수 있도록 함
			br = new BufferedReader(new InputStreamReader(System.in));
			
			do{
				System.out.print("문자 입력(종류: q/Q 입력)> ");
				//IOExceoption이 날수 있어서 try~catch
				line = br.readLine();
				System.out.println("입력하신 문장: " + line );
			//}while( !line.equals("q"));	// q만 가능
			}while( !line.equalsIgnoreCase("q"));	// q, Q 모두 가능
			System.out.println("프로그램 종료!!");
			
		}catch(IOException e){
			e.printStackTrace();
		}finally{	//자원관린
			if( br!=null ){ try{br.close();}catch(IOException e){e.printStackTrace();} }
		}		
	}
}
