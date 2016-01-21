/*
//객체 배열 생성 - 문자열 객체 배열생성
//참조값을 통한 인스턴스 접근 - for-each문

for-each문
	• 배열의 일부가 아닌, 배열의 전체를 참조할 필요가 있는 경우에 유용하게 사용할 수 있습니다.
	• for-each 문을 통한 값의 변경은 실제 배열에 반영되지 않으니, 값의 참조를 목적으로만 사용해야 합니다
	• 자바 5.0 이상(JDK 1.5 이상)에서 사용 가능


for-each문 형식
	• 콜론(:) 왼쪽에는 배열의 값이 반복 저장될 변수가 오고,
	• 오른쪽에는 배열이 옵이다.
	• 중괄호는 일반적인 for문과 역할이 같습니다. 

for(반복대상의 요소 : 반복대상)


*/

public class ArrayEx14 {

	public static void main(String[] args) {
		
		//인스턴스 배열 생성(=객체형 배열 생성) 방법1
//		String[] programlist=new String[]{
//				"CSharp",
//				"Python",
//				"Java"
//		};
		
		//인스턴스 배열 생성(=객체형 배열 생성) 방법2
		String[] programlist=new String[3];
		programlist[0]=	"CSharp";
		programlist[1]=	"Python";
		programlist[2]=	"Java";

		//for-each문 형식
		//for(반복대상의 요소 : 반복대상)
		//변수 e에 컬렉션 programlist의 인덱스가 하나씩 저장되며, 
		//e에 저장된 참조값을 통해 해당 객체의 인스턴스 변수를 호출하여 결과값 출력
		for(String e: programlist){
			System.out.println(e);	//출력으로 확인
		}

	}
}

