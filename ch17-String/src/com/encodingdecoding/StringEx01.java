/*
인코딩/디코딩 이해

자바 프로그래밍 특히 웹과 관련된 작업을 할때,
인코딩관련하여 생각보다 복잡한 많은 문제에 직면하게 됩니다.
인코딩 할 수 있는 문자조합이 여러가지이다 보니, 마구잡이로 이것저것 될때까지 입력해보며 해결하게 될 때가 있습니다.

문자의 깨짐현상은 인코딩 방식이 달라서 생기며
인코딩 한 방식과 디코딩한 방식이 일치해야 정상적으로 출력됩니다.


실행한 출력결과
'한글' 이라는글자를 
UTF-8 과 EUC-KR로 인코딩 후 디코딩한 결과는 정상적으로 확인가능하지만 
ISO-8859-1 의 경우 확인이 불가능했다.


Charset이 맞지 않아서 ??로 보이는 것이 아니라 실제 데이터가 손실된 것입니다. 
이럴 경우 charset을 아무리 바꿔보아도 복원도 할 수 없습니다.
이러한 데이터를 가지고 있으므로 select한 후 아무리 JAVA인코딩을 변경해보아도 정상적인 결과를 얻지못합니다.

이럴때 쿼리를 
insert into member values(new String("아이디".getBytes("EUC-KR")."latin1"),new String("비밀번호".getBytes("EUC-KR")."latin1"));
처럼 하면, 실제로 깨진 글자가 들어간 것처럼 보이지만 깨져있게 보이는 문자들은 실제로 latin1의 코드표에 해당하는 값이 들어있기 때문에 복원이 가능합니다.
*/
package com.encodingdecoding;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;

public class StringEx01 {

	public static void main(String[] args) {
		
		String [] types = {"UTF-8","EUC-KR","ISO-8859-1"};
		String testValue = "한글";
		System.out.println("원본 글자 : " + testValue);
		System.out.println("기본 Charset: " + Charset.defaultCharset());	
		String encode_result = null;
		
		System.out.println("----------------------------------------");	
		try {
			for(String type : types){
			encode_result = URLEncoder.encode(testValue, type);
			System.out.println("encode with " + type +" : "+ URLEncoder.encode(testValue, type));
				for(String type2 : types){
					System.out.println("decode with " + type2 +" : "+ URLDecoder.decode(encode_result, type2));		
				}
				System.out.println("----------------------------------------");		
			}	
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
	}

}
