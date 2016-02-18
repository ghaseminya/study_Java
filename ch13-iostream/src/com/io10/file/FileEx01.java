package com.io10.file;
/* 
File Class - 간단 File 탐색기

강의내용
	• 파일 객체 생성
	• 파일이 존재하지 않거나 디렉토리가 아닌 경우에 대한 조건문 선언
	• 지정한 경로의 하위 디렉토리 및 파일 정보 반환

  
------------------------------------------------------------
디렉토리와 파일의 리스트를 출력합니다.
출력시 디렉토리는 [ ]표시를 해주고
파일은 파일용량을 표시해 줍니다.
 
//-------------------------------------------
File 클래스
	• 시스템에 있는 파일이나 디렉토리를 추상화한 클래스
	• 자바는 플랫폼 독립적이므로 파일 시스템이 서로 다른 운영체제에서 
	동일한 방식으로 파일처리가 가능하도록 일관된 방식으로 파일 처리가 할수 있게 해주는 클래스
	• File 클래스를 이용하면 파일의 크기, 생성, 삭제, 변경 및 마직막 수정날짜 등 
	다양한 정보를 알 수 있는 메서드를 제공하고 있습니다.
	• 파일의 정보만을 취급하며 
	파일 내용(파일명, 파일경로, 마지막으로 수정된 시간, 파일 길이, 파일 또는 디렉토리 여부)에 대한 처리는 
	입출력 스트림이나 RandomAccessFile 클래스를 사용해야 합니다.


*/


import java.io.File;

public class FileEx01 {
	public static void main(String[] args){
		
		//파일 경로 저장 변수
		String path = "C:\\";
		
		//파일 객체 생성
		File f = new File(path);
		
		//파일이 존재하지 않거나 디렉토리가 아닌 경우
		if(!f.exists() || !f.isDirectory()){
			System.out.println("유효하지 않은 디렉토리입니다.");
			//프로그램 종료
			System.exit(0);
		}
		//지정한 경로의 하위 디렉토리 및 파일 정보 반환
		File[] files = f.listFiles();
		
		for(int i=0; i<files.length; i++){
			File f2 = files[i];
			if(f2.isDirectory()){	//디렉토리 표시
				System.out.println("[" + f2.getName() + "]");
			}else{	//파일 표시				
				System.out.printf("%s\t(%,dbytes)\n", f2.getName(), f2.length());
			}
		}		
	}
}
