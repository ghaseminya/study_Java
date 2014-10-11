/* 구구단 출력후 파일 저장 - BufferedReader, FileWriter를 활용하여
 * 
 * ------------------------------------------------------------
실습:  구구단 출력 저장

1)단 입력 (BufferedReader) : String -> int
2)콘솔에 구구단 출력 후
3)파일에 저장 (FileWriter)
 
 */

package com.practice;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FilterStreamGuGuDan {

	public static void main(String[] args) {
		//변수 선언
		BufferedReader br = null;		
		FileWriter fw = null;
		
		String str = null;
		String gugu = null;
		
		//단 저장 변수
		int dan = 1;
		
		try{
			//객체 생성
			fw = new FileWriter("FileWriterGGdan.txt");
			
			System.out.println("단입력 >");
			br = new BufferedReader(new InputStreamReader(System.in));
			
			//단 입력 받기
			str = br.readLine();			
			
			dan = Integer.parseInt(str);
			
			//구구단 출력
			for(int i =1; i<=9; i++){	
				
				//gugu = dan + "*" +  i + "=" + (dan*i) + "\n";
				gugu = dan + "*" +  i + "=" + (dan*i);				
				
				System.out.println( gugu );
				//파일 저장				
				fw.write(gugu + System.getProperty("line.separator"));
			}			
		}catch(IOException e){
			e.printStackTrace();
			
		}finally{	//자원관리 
				if( br != null){ try{br.close();} catch(IOException e){e.printStackTrace();} }
				if( fw != null){ try{fw.close();} catch(IOException e){e.printStackTrace();} }			
		}		
	}
}
