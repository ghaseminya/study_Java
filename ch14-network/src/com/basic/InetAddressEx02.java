package com.basic;
/* InetAddress - 도메인 주소와 로컬 주소 출력


출력결과
웹사이트 주소 입력 > codedragon.tistory.com
codedragon.tistory.com/110.45.229.135
codedragon.tistory.com/180.70.134.239
Local computer's IP: 
CODEDRAGON/169.254.80.80
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx02{

	public static void main(String[] args) {
		//입력받기위해 객체 생성
		BufferedReader br = null;
		
		//입력받은  URL저장
		String url = null;
		
		//배열로 정보를 받으므로 저장할 배열 선언
		//• 배열은 같은 자료 형들끼리 모아둔 하나의 묶음(집합)입니다.
		//• 자바에서 하나의 배열은 하나의 객체로 인식됩니다.
		InetAddress[] addresses;		
		
		try{
			//InputStreamReader: 바이트를 읽어서 지정된 문자 인코딩에 따라 문자로 변환하는데 사용하며 한문자씩 읽어 들입니다.
			//BufferedReader는 입출력 스트림으로부터 버퍼를 사용하여 미리 버퍼에 데이터를 갖다 놓기 때문에 보다 효율적으로 입출력 작업을 할 수 있습니다.
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("웹사이트 주소 입력 > "); //codedragon.tistory.com
			url = br.readLine(); //한 줄 단위로 읽는 메서드
			
			//해당 도메인과 매핑되어 있는 모든 주소 구하기, Static한 메소드로 되어 있어 직접 호출 가능
			//getAllByName(): 매개변수 url에 대응되는 InetAddress배열을 반환
			addresses = InetAddress.getAllByName(url);			
			
			//도메인 주소 출력
			for(int i=0; i<addresses.length; i++){
				System.out.println(addresses[i]);
			}
			
			//로컬 주소 출력
			System.out.println("Local computer's IP: ");
			System.out.println(InetAddress.getLocalHost()); 
			//로컬컴퓨터 이름/로컬컴퓨터 IP주소 (InetAddress.getHostName()/InetAddress.getHostAddress()
			//CODEDRAGON/xxx.xxx.xxx.xxx
			
		}catch(UnknownHostException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();			
		}finally{
			if( br!=null ){ 
				try{br.close();}catch(IOException e){e.printStackTrace();} }
		}
	}
}
