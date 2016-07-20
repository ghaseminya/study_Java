/*
DatagramPacket과 DatagramSocket을 이용한 프로그램
DatagramPacket, DatagramSocket 클래스 이용하여 오늘의 점심 메뉴를 서버에 요청해서 가져오는 프로그램

File Info
MenuMgmt	메뉴를 뽑아내는 클래스
UDPServer	UDP 서버 클래스
UDPClient	UDP Client 클래스

*/
package com.datagrampacket01;

import java.util.Random;

public class MenuMgmt {
	//메뉴를 배열 형태로 저장
	private static final String[] MenuLists = {
			"짜장면", "김치찌개", "짬뽕", "김밥", "우동", 
			"스씨", "돈까스", "스파게티"};

	//메뉴를 랜덤으로 뽑아내는 메소드
	public static String selectMenu(){
		//return MenuLists[new Random().nextInt(8)];
		//배열을 크기를 자동으로 알아내기
		return MenuLists[new Random().nextInt(MenuLists.length)];
	}
}
