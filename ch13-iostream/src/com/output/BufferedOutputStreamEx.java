/* BufferedOutputStream
 * 
 * String -> byte[] 저장
 * 명시적 flush
 * Close()	//자원정리
 * 
 * 
 * ---------------------------
 * BufferedOutputStream하면 버퍼에 저장되는데
 * 버퍼공간이 자동으로 차면 autoflush하면 됨 
 * buffer공간을 다 채우지 못해 파일에 저장되지 않는다. 이 경우 명시적으로 flush해야 파일에 저장됨.
 *  * 
 * close()메소드가 자원정리하기 전에 buffer에 데이터가 남아있으면 flush한 후 자원정리를 하게됩니다.
 * 에러방지를 위해 만들어진 순서의 역순으로 자원정리해 줍니다. 
 * 
 * close()를 안할 경우는 반드시 명시적으로 flush()해야 합니다.
 */

package com.output;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx {

	public static void main(String[] args) {
		//명시 후 초기화
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try{
			//객체 생성
			fos = new FileOutputStream("bufferOut.txt");
			bos = new BufferedOutputStream(fos);

			String str ="BufferedOutputStream Test입니다.";
			//String -> byte[]			
			bos.write(str.getBytes());

			//buffer공간을 다 채우지 못해 파일에 저장되지 않는다.
			//버퍼의 내용을 파일에 옮기고 버퍼를 비움(명시적으로 flush)
			//bos.flush();

			System.out.println("파일 생성 및 내용 기술!");

		}catch(IOException e){
			e.printStackTrace();			
		}finally{	//자원정리			
			//close()메소드가 자원정리하기 전에 buffer에 데이터가 남아있으면 flush한 후 자원정리를 하게됩니다.
			//생성 역순으로 자원정리
			if( bos != null){ try{ bos.close(); }catch(IOException e){e.printStackTrace();} } 
			if( fos != null){ try{ fos.close(); }catch(IOException e){e.printStackTrace();} }
		}
	}
}
