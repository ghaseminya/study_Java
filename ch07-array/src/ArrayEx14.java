//객체 배열 생성 - 문자열 객체 배열생성
//참조값을 통한 인스턴스 접근 - for-each문

//for-each문의 인스턴스 배열
//	• 인스턴스 배열에 저장된 참조 값의 변경은 불가능하지만, 
//	• 참조 값을 통한 인스턴스의 접근은(데이터 변경도)가능합니다.


public class ArrayEx14 {

	public static void main(String[] args) {
		
		//인스턴스 배열 생성(=객체형 배열 생성)
//		String[] programlist=new String[]{
//				"CSharp",
//				"Python",
//				"Java"
//		};
		
		
		String[] programlist=new String[3];
		programlist[0]=	"CSharp";
		programlist[1]=	"Python";
		programlist[2]=	"Java";

		//for-each문 형식
		//for(반복대상의 요소 : 반복대상)
		//변수 e에 컬렉션 arr의 인덱스가 하나씩 저장되며, e에 저장된 참조값을 통해 해당 객체의 인스턴스 변수를 호출하여 결과값 출력
		for(String e: programlist){
			System.out.println(e);	//출력으로 확인
		}

	}
}

