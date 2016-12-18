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

		//TODO : 문자열 객체 생성
		String name ="Hong Kil Dong";
		//Hong	 Kil   D o  n  g	  
		//0123 4 567 8 9 10 11 12
		
		
		
/*
int indexOf(char ch)
• 현재 문자열 객체에서 ch문자가 첫번째로 발견된 위치를 반환합니다.
• 일치하는 문자가 없으면 -1 반환


int indexOf(String str)
• 현재 문자열 객체에서 str를 찾아서 존재하면 첫째문자 위치를 반환합니다.
• 일치하는 문자열이 없으면 -1 반환


int lastindexOf(String str)
• 문자열에 지정한 문자가 마지막 몇번째에 있는지 그 위치를 반환합니다

*/
		//TODO : 문자 인덱스 추출
		int index = name.indexOf('n');
		System.out.println("맨 처음 문자 n의 위치: " + index);

		
		//TODO : 문자열 인덱스 추출
		index = name.indexOf("Kil");
		System.out.println("문자열 Kil의 위치: " + index);			
		
		
		//TODO : 마지막 문자의 인덱스 추출
		index = name.lastIndexOf('n');
		System.out.println("마지막 문자 n의 위치: " + index); System.out.println();
		
		
	
/*		
char charAt(int index)
• 특정문자 반환


String substring(int begin)
• 시작위치(begin)부터 문자열 끝까지에 해당하는 문자열을 반환합니다.
• 한 문자열에서 내용의 일부를 추출하는 메서드
• 메소드명은 subString이 아니라 substring으로 모두 소문자입니다.


String substring(int begin, int end)
• 시작위치(begin)부터 끝 위치(end) 범위에 포함된 문자열을 반환합니다.
• 문자열에서 각 문자의 위치를 뜻하는 index가 0부터 시작한다는 것과 start부터 end의 범위 중 end위치에 있는 문자는 결과에 포함되지 않는다는 것이다. (start <= index < end)
• end에서 start값을 빼면 substring에 의해 추출될 글자의 수가   됩니다.

		
*/		
		//TODO : 문자 추출
		char c = name.charAt(index);
		System.out.println("추출한 문자: " +c);
		System.out.println();

		
		//TODO : 문자열 추출
		index = name.indexOf('K');
		System.out.println("문자 K의 위치: " + index);
		//문자 K의 위치: 5
		
		
		//TODO : 대문자 K로부터 문자열 끝까지 추출
		String str = name.substring(index);
		System.out.println("대문자 K로부터 문자열 끝까지 추출: " + str);
		System.out.println();
		//대문자 K로부터 문자열 끝까지 추출: Kil Dong
		
		
		//TODO : 인덱스 만큼 문자열 가져오기
		//String substring(int begin, int end) : 시작위치(begin)부터 끝 위치(end) 범위에 포함된 문자열을 반환합니다.

		index = 5;
		//endindex는 index -1
		// 5  ,	 8(5+3) -> 5 6 7
		str = name.substring(index, index+3);
		System.out.println("인덱스 5~7: " + str);
		System.out.println();
		//인덱스 5~7: Kil
		

		
		
/*		
String length()
• 문자열 길이 반환


String[] split(String regex)
• 문자열을 지정된 분리자(regex)로 나누어 문자열 배열에 담아 반환합니다.

*/
		//TODO : 문자열 길이 구하기
		int length = name.length();
		System.out.println("name의 문자열 길이: " + length);
		System.out.println();
		//name의 문자열 길이: 13
		
		
		//TODO : 구분자를 이용한 문자열 추출
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
