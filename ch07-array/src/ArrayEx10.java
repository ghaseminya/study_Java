/*
//1차원 배열 길이확인

배열 길이확인
배열 인스턴스의 멤버변수 length에는 배열의 길이정보가 저정되어 있습니다.

배열명.length

*/

public class ArrayEx10 {

	public static void main(String[] args) {
		//int[] arr = {1, 2, 3, 4};
		int arr[]={1, 2, 3, 4};

		System.out.println("arr.length: " +arr.length);	//arr.length: 4
		//배열요소의 크기바뀌면 같이 수정해 주어야 에러가 발생하지 않습니다.
//		for(int i=0; i<4; i++)
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
	}
}


//출력결과
//arr.length: 4
//1
//2
//3
//4