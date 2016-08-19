/*
// 배열 선언, 생성, 초기화(암시적으로 배열 생성)
// 배열명 출력시 16진수 유니크한 참조값(메모리 값이 아닌 가공된 참조값)이 출력됩니다.

*/
public class ArrayEx02 {

	public static void main(String[] args) {
		
		//배열선언 방법 - 암시적 배열 생성
		int[] a = {10, 20, 30, 40, 50, 60, 70};
		
		System.out.print("배열명 출력 :"); //배열명 출력 :[I@2a139a55
		System.out.println(a); //16진수 유니크한 참조값(메모리 값이 아닌 가공된 참조값)
		//배열명 출력 : char배열일때만 참조값이 아닌 배열값을 보여준다. (참조값을 배열값으로 한번 더 가공해서 보여준다)
		
		
		System.out.println();
		System.out.println("배열 출력 :");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+ "\t"); //10	20	30	40	50	60	70	
			
		}
	}
}


//출력결과
//배열명 출력 :[I@2a139a55
//
//배열 출력 :
//10	20	30	40	50	60	70	