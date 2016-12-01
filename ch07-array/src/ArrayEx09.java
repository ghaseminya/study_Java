//배열과 메소드
//배열도 인스턴스이기 때문에
//메소드 호출시의 인자전달 및 반환 과정은 일반적인 인스턴스들과 크게 다르지 않습니다.

//{1, 2, 3, 4, 5} 인스턴스는  arr 에 저장, 
//ref는 addArray함수의 반환값인  arr의 참조값을 가지고 있어 arr에 의해 참조되고 있으며 
//arr과 ref는 동일한 참조값을 가집니다.

public class ArrayEx09 {

	public static void main(String[] args) {
		//배열 생성
		int[] arr={1, 2, 3, 4, 5};
		int[] ref;
		
		//배열 arr의 참조값이 인자로 전달
		//메소드 호출 후 반환시 arr의 참조값을 다시 반환
		ref=addArray(arr, 3);
		
		if(arr==ref)
			System.out.println("동일 배열 참조");
		else
			System.out.println("다른 배열 참조");
		//유니크한 참조값(메모리 값이 아닌 가공된 참조값) 확인하기
		System.out.println(arr); //[I@15db9742
		System.out.println(ref); //[I@15db9742
		
		//배열 출력
		for(int i=0; i<ref.length; i++)
			System.out.println("arr[" + i + "]: " + arr[i]);
	}	
	
	//arr배열 요소에  addVal값 더하기
	public static int[] addArray(int[] arr, int addVal)
	{
		for(int i=0; i<arr.length; i++)
			arr[i]+=addVal;
		
		return arr;	//참조값 arr을 반환한 후 addArray메소드내의 arr은 소멸됩니다.
	}
}


/*
동일 배열 참조
[I@15db9742
[I@15db9742
arr[0]: 4
arr[1]: 5
arr[2]: 6
arr[3]: 7
arr[4]: 8

*/