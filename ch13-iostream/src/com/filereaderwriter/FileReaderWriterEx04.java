//콘솔에서 문자열을 입력 받아 지정된 파일에 그 내용을 출력하는 프로그램

package com.filereaderwriter;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FileReaderWriterEx04 {

	public static void main(String[] args) {

		String fname, buff, tmp;
		
		//파일명 지정
		fname = "frw.txt";
		
		//콘솔에서 문자열을 계속 입력 받아 buff 변수에 저장하기
		try{
			
			System.out.println("입력이 끝나면 CTRL-Z키를 누르세요");
			//표준 입력 장치인 키보드로부터 문자를 입력받는 스트림을 생성하여 BufferedReader 클래스의 인자로 넘겨줍니다.
			BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
			
			//buf 변수를 비워놓습니다 (초기화)
			buff = "";
			//tmp 변수에 버퍼에서 한 행을 읽어 저장
			tmp = r.readLine();
			
			while(tmp !=null){
				//buf 변수에 문자열을 추가
				buff += tmp;
				//버퍼에서 다음 행을 읽어 tmp 변수에 저장
				tmp = r.readLine();
			}
			
			//파일명을 인자로 하여 FileWriter 객체를 생성
			//FileWriter(): 문자단위로 출력하는 메소드. 파일명을 인자로 받아 파일에 쓰는 스트림을 생성합니다.
			FileWriter fw = new FileWriter(fname);
			
			//버퍼에 들어있는 문자열을 처음 위치부터 버퍼의 크기만큼 출력한다. 
			//buff 변수의 길이만큼 파일객체에 출력함으로써 간단하게 텍스트 파일을 생성할 수 있
			//write(배열, 문자열의 시작위치, 출력할 문자열의 개수): 
			//	버퍼에 들어 있는 문자열을 0(처음)부터 buff변수의 길이만큼 파일 객체에 출력하는 메소드
			fw.write(buff, 0, buff.length());
			fw.close();
			
		}catch(Exception e){ //예외가 발생했을 경우 예외의 내용을 출력
			System.err.println(e.toString());
		}
	}
}
