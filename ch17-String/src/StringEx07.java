//String 클래스 - 중요 메소드 확인
 
//학습내용
//• 문자열 객체 생성
//• 인덱스 추출
//• 문자 추출
//• 문자열 추출
//• 특정문자에서 부터 문자열 끝까지추출
//• 인텍스만큼 문자열 가져오기
//• 문자열 길이 구하기
//• 구분자를 이용한 문자열 추출


public class StringEx07 {

	public static void main(String[] args) {

		//문자열 객체 생성
		String name ="Hong Kil Dong";
		//Hong	 Kil   D o  n  g	  
		//0123 4 567 8 9 10 11 12
		
		//문자 인덱스 추출
		int index = name.indexOf('n');
		System.out.println("맨 처음 문자 n의 위치: " + index);
		
		//문자열 인덱스 추출
		index = name.indexOf("Kil");
		System.out.println("문자열 Kil의 위치: " + index);			
		
		//마지막 문자의 인덱스 추출
		index = name.lastIndexOf('n');
		System.out.println("마지막 문자 n의 위치: " + index); System.out.println();
		
		
		//문자 추출
		char c = name.charAt(index);
		System.out.println("추출한 문자: " +c);
		System.out.println();

		
		//문자열 추출
		index = name.indexOf('K');
		System.out.println("문자 K의 위치: " + index);
		
		//대문자 K로부터 문자열 끝까지 추출
		String str = name.substring(index);
		System.out.println("대문자 K로부터 문자열 끝까지 추출: " + str);
		System.out.println();
		
		
		index = 5;
		//인덱스 만큼 문자열 가져오기(endindex는 index -1)
							// 5  ,	 8 -> index 5 6 7
		str = name.substring(index, index+3);
		System.out.println("인덱스 5~7: " + str);
		System.out.println();
		
		//문자열 길이 구하기
		int length = name.length();
		System.out.println("name의 문자열 길이: " + length);
		System.out.println();
		
		//구분자를 이용한 문자열 추출
		String[] arr = name.split(" ");
		for(int i=0; i<arr.length; i++){
			System.out.println("arr["+i+"]: " + arr[i]);
		}		
	}
}


/*//출력결과
맨 처음 문자 n의 위치: 2
문자열 Kil의 위치: 5
마지막 문자 n의 위치: 11

추출한 문자: n

문자 K의 위치: 5
대문자 K로부터 문자열 끝까지 추출: Kil Dong

인덱스 5~7: Kil

name의 문자열 길이: 13

arr[0]: Hong
arr[1]: Kil
arr[2]: Dong
*/
