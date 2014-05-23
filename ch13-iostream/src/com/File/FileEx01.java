/* File Class - 간단 File 탐색기
 * 
 *  파일 객체 생성
 *  파일이 존재하지 않거나 디렉토리가 아닌 경우에 대한 조건문 선언
 *  지정한 경로의 하위 디렉토리 및 파일 정보 반환
 *  
 * ------------------------------------------------------------
 * 디렉토리와 파일의 리스트를 출력합니다.
 * 출력시 디렉토리는 [ ]표시를 해주고
 * 파일은 파일용량을 표시해 줍니다.
 * 
 */

package com.File;

import java.io.File;

public class FileEx01 {
	public static void main(String[] args){
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
