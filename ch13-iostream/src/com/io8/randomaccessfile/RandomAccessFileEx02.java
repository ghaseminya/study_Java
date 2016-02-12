/*
RamdomAccessFile 클래스를 사용하여 텍스트 파일의 내용을 읽어오는 프로그램


*/
package com.io8.randomaccessfile;

import java.io.RandomAccessFile;

public class RandomAccessFileEx02 {

	public static void main(String[] args) {
		
		try{
			//RandomAccessFile 클래스 객체를 읽기 모드로 생성
			RandomAccessFile f = new RandomAccessFile("MissionStatement.txt", "r");
			
			//파일포인터가 파일의 전체 길이보다 작은 동안 계속 반복하면서 행 단위로 파일의 내용을 출력
			while(f.getFilePointer() < f.length()){
				//TODO 1: 인코딩 문제 확인 - 한글 깨짐
//				System.out.println(f.readLine());
				
				//TODO 2: 한글 저장 출력
				System.out.println(new String(f.readLine().getBytes("8859_1"), "KSC5601"));
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}

	}

}

/*
//				System.out.println(new String(f.readLine().getBytes("EUC_KR"), "8859_1"));
//				System.out.println(new String(f.readLine().getBytes("KSC5601"),"ISO8859_1"));
//				System.out.println(new String(f.readLine().getBytes("ISO8859_1"),"KSC5601"));

*/