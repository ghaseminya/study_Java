package com.basic;
/*
인자로 넘겨준 호스트에 대한 정보를 출력하는 프로그램


InetAddress 클래스
	• InetAddress 클래스는 IP 주소를 표현한 클래스(모델링한 클래스)
	• 자바에서는 모든 IP 주소를 InetAddress 클래스를 사용하여 표현할 수 있습니다.


*/

//java.net 패키지에는 네트워크 관련 클래스들이 포함되어 있습니다. InetAddress 클래스를 사용하려면 이 패키지를 임포트 해야 합니다.
//import java.net.InetAddress;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class InetAddressEx01 {

	public static void main(String[] args) {

		//입력받기위해 객체 생성
		BufferedReader br = null;
		
		//입력받은  URL저장
		String url = null;

		// 선언
		InetAddress address;		

		//반드시 예외 처리 해야 합니다.
		try{
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("웹사이트 주소 입력 > "); //codedragon.tistory.com
			url = br.readLine();

			//Static한 메소드로 되어 있어 직접 호출하여 InetAddress 객체를 생성하고 있습니다.
			address = InetAddress.getByName(url);			

			//getHostName(): 호스트 이름을 문자열로 반환합니다.
			System.out.println("호스트 네임: " + address.getHostName());
			
			//getHostAddress(): IP주소를 문자열로 반환합니다.
			System.out.println("호스트 주소: " + address.getHostAddress());
			

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if( br!=null ){ try{br.close();}catch(IOException e){e.printStackTrace();} }
		}
	}
}

/*//출력결과
웹사이트 주소 입력 > codedragon.tistory.com
호스트 네임: codedragon.tistory.com
호스트 주소: 180.70.134.239
*/