package com.basic;
/*
인자로 넘겨준 호스트에 대한 정보를 출력하는 프로그램


InetAddress 클래스
	• 자바에서 인터넷 주소에 관한 정보를 다루는 클래스
	• InetAddress 클래스는 IP 주소를 표현하고 제어하는 기능을 제공하는 클래스(모델링한 클래스)
	• 자바에서는 모든 IP 주소를 InetAddress 클래스를 사용하여 표현할 수 있습니다. 
	즉 주소와 관련된 다양한 메소드를 제공하고 있습니다.
	• InetAddress클래스는 내부적으로 
	컴퓨터에 설정된 Host Name서버 자체를 가지고  주소를 표현해 그에 관련된 기능을 제공합니다.


호스트명(Host Name)
codedragon.tistory.com과 같이 인터넷 상에서 특정 컴퓨터를 가리키는 명칭

//--------------------
try{
    // 예외 발생 가능한 문장들;
} catch(예상되는_예외객체1 변수명){
    // 해당 예외가 발생했을 때 수행할 문장들;
} catch(예상되는_예외객체2 변수명){
    // 해당 예외가 발생했을 때 수행할 문장들;
}
finally{
    // 예외발생 여부와 상관없이 수행할 문장들;

} 

finally의 필요성
	• 무조건, 항상 실행되는 것이 아니라, finally와 연결되어 있는 try 블록으로 일단 진입을 하면, 
	     무조건 실행되는 영역이 바로 finally 블록입니다.
	• try문의 중간에 return 문을 실행하더라도 finally 블록이 실행된 다음에 메소드를 빠져 나가게 됩니다.
	• 정리하면 예외가 발생하든 발행하지 않든 무조건 수행하는 부분이 바로 finally영역입니다
	• finally는 Database처리나 File처리를 할때 꼭 필요한 부분입니다. 
	     이유는 Database를 열거나 또는 File을 열었다면 꼭 닫아주고 난 후 프로그램이 종료되어야 하는 데 이 부분을 finally에서 수행해 주기 때문입니다.

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
		//BufferedReader: 문자 입력 스트림으로부터 
		//문자를 읽어 들이거나 문자 출력 스트림으로 문자를 내보낼 때 버퍼링을 함으로써
		//문자, 문자 배열, 문자열 라인 등을 보다 효율적으로 처리합니다.
		BufferedReader br = null;
		
		//입력받은  URL저장
		String url = null;

		// 선언
		InetAddress address;		

		//반드시 예외 처리 해야 합니다.
		try{
			//InputStreamReader: 바이트를 읽어서 지정된 문자 인코딩에 따라 문자로 변환하는데 사용하며
			//					한문자씩 읽어 들입니다.
			//BufferedReader는 입출력 스트림으로부터 버퍼를 사용하여 미리 버퍼에 데이터를 갖다 놓기 때문에 보다 효율적으로 입출력 작업을 할 수 있습니다.
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("웹사이트 주소 입력 > "); //codedragon.tistory.com
			url = br.readLine();

			//Static한 메소드로 되어 있어 직접 호출하여 InetAddress 객체를 생성하고 있습니다.
			//getByName() : 매개변수 host(url)에 대응되는 InetAddress객체를 반환
			address = InetAddress.getByName(url);			

			//getHostName(): 호스트 이름을 문자열로 반환합니다.
			//호스트명(Host Name): 	codedragon.tistory.com과 같이 인터넷 상에서 특정 컴퓨터를 가리키는 명칭
			System.out.println("호스트 네임: " + address.getHostName());
			
			//getHostAddress(): IP주소를 문자열로 반환합니다.
			System.out.println("호스트 주소: " + address.getHostAddress());
			

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	} //main
} //InetAddressEx01


/*//출력결과
웹사이트 주소 입력 > codedragon.tistory.com
호스트 네임: codedragon.tistory.com
호스트 주소: 180.70.134.239
*/