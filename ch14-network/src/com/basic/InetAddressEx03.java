//URL통해 IP주소 확인하기

package com.basic;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class InetAddressEx03 {

	public static void main(String[] args) {

		//import java.util.Scanner;
		Scanner scanner = new Scanner(System.in);
		
		//import java.net.InetAddress;
		//InetAddress: 도메인 주소와 IP주소를 표현하는 클래스
		InetAddress inetAddress[] = null;
		
		System.out.println("URL 주소를 입력하세요 > ");
		//문자 또는 문자열 한라인 전체를 입력 받습니다.
		String str = scanner.nextLine();
		
		try{
			//getAllByName(): 호스트(str)에 대한 모든 IP 주소를 InetAddress 객체 배열로 반환
			inetAddress = InetAddress.getAllByName(str);
		}catch(UnknownHostException e){
			e.printStackTrace();
		}
		
		for(int i=0; i<inetAddress.length; i++){
			//컴퓨터이름(호스트 이름, 도메인명)을 나타내는 문자열로 반환합니다.
			System.out.println("getHostName: " + inetAddress[i].getHostName());
			
			//IP주소를 문자열로 반환합니다. IP주소를 점으로 구분하는 10진수 형태로 반환합니다.
			System.out.println("getHostAddress: " + inetAddress[i].getHostAddress());
			
			//IP 주소를 스트링 문자열로 오버라이딩한 메소드, 스트링 문자열의 형식은 '호스트이름/IP주소'
			System.out.println("toString: " + inetAddress[i].toString());
			System.out.println("---------------------------------");
		}
		
		scanner.close();
	}
} //InetAddressEx03


//출력결과
//URL 주소를 입력하세요 > 
//www.naver.com
//getHostName: www.naver.com
//getHostAddress: 125.209.222.142
//toString: www.naver.com/125.209.222.142
//---------------------------------
//getHostName: www.naver.com
//getHostAddress: 202.179.177.21
//toString: www.naver.com/202.179.177.21
//---------------------------------