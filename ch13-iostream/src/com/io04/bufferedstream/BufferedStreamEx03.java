/* 
BufferedOutputStream
  
String -> byte[] 저장
명시적 flush
Close()	//자원정리
 
//---------------------------
TODO : 명시적으로 flush하지 않으므로써 buffer공간을 다 채우지 못해 파일에 써지지않는 문제점 확인

[명시적으로 flush하는 방법]
TODO : 명시적 flush //버퍼비우기 방법
TODO : Close()	//자원정리 방법

[버퍼 비우기]
BufferedOutputStream하면 버퍼에 저장되는데  버퍼공간이 자동으로 차면 autoflush 됩니다.
buffer공간을 다 채우지 못채우면 autoflush가 되지 않아 파일에 저장되지 않는다. 이 경우 명시적으로 flush해야 파일에 저장됩니다.

[자원정리]
close()메소드가 자원정리하기 전에 buffer에 데이터가 남아있으면 flush한 후 자원정리를 하게 됩니다.
에러방지를 위해 만들어진 순서의 역순으로 자원정리해 줍니다. 
close()를 안할 경우는 반드시 명시적으로 flush()해야 합니다.

 
 */

package com.io04.bufferedstream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamEx03 {

	public static void main(String[] args) {
		//명시 후 초기화
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try{
			//객체 생성
			fos = new FileOutputStream("bufferOut.txt");
			bos = new BufferedOutputStream(fos);

			String str ="BufferedOutputStream Test입니다.";
			//getBytes(): String -> byte[]			
			bos.write(str.getBytes());

			//TODO : 명시적 flush //버퍼비우기 방법
			//buffer공간을 다 채우지 못해 파일에 저장되지 않는다.
			//버퍼의 내용을 파일에 옮기고 버퍼를 비움(명시적으로 flush)
//			bos.flush();

			System.out.println("파일 생성 및 내용 기술!");

		}catch(IOException e){
			e.printStackTrace();			
		}finally{ //TODO : 자원정리 전/후 결과확인하기	
			//close()메소드가 자원정리하기 전에 buffer에 데이터가 남아있으면 flush한 후 자원정리를 하게됩니다.
			//생성 역순으로 자원정리
			if( bos != null){ 
//				try{ bos.close(); }catch(IOException e){e.printStackTrace();} 
				} 
			if( fos != null){ 
//				try{ fos.close(); }catch(IOException e){e.printStackTrace();} 
				}
		}
	}
}
