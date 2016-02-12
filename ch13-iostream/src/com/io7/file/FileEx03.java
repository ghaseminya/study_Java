/* File Class - 디렉토리


강의내용
	• 디렉토리 생성
	• 디렉토리 삭제


 
 */

package com.io7.file;

import java.io.File;

public class FileEx03 {
	public static void main(String[] args){
		System.out.println("===디렉토리 생성===");
		File f = new File("C:" + File.separator + "javanAndroid" + File.separator + "javaSample");
		
		//디렉토리 생성후 성공시 true 실패시 false
		System.out.println(f.mkdir());
		
		//디렉토리 삭제
		System.out.println("\n===디렉토리 생성===");
		if(f.delete())
			System.out.println(f.getName() + " 디렉토리 삭제");
		else{
			System.out.println("디렉토리가 존재하지 않습니다.");
		}		
	}
}
