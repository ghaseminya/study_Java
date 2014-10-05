/* InetAddress - 도메인 주소와 로컬 주소 출력
 *  
 */

package com.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx{

	public static void main(String[] args) {
		//입력받기위해 객체 생성
		BufferedReader br = null;
		//입력받은  URL저장
		String url = null;
		
		//배열로 정보를 받으므로 저장할 배열 선언
		InetAddress[] addresses;		
		
		try{
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("웹사이트 주소 입력 > ");
			url = br.readLine();
			
			//해당 도메인과 매핑되어 있는 모든 주소를 구함, Static한 메소드로 되어 있어 직접 호출
			addresses = InetAddress.getAllByName(url);			
			
			//도메인 주소 출력
			for(int i=0; i<addresses.length; i++){
				System.out.println(addresses[i]);
			}
			
			//로컬 주소 출력
			System.out.println("Local computer's IP: ");
			System.out.println(InetAddress.getLocalHost());
		}catch(UnknownHostException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();			
		}finally{
			if( br!=null ){ try{br.close();}catch(IOException e){e.printStackTrace();} }
		}
	}
}
