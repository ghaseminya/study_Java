/*
{1, 2, 3, 4, 5} 인스턴스는
arr, ref, addArray함수의 arr에 의해 참조되고 있으며 동일한 참조값을 가집니다.

*/
public class ArrayEx09 {

	public static void main(String[] args) {
		int[] arr={1, 2, 3, 4, 5};
		int[] ref;
		
		//배열 arr의 참조값 이 인자로 전달
		ref=addArray(arr, 3);
		
		if(arr==ref)
			System.out.println("동일 배열 참조");
		else
			System.out.println("다른 배열 참조");
		
		for(int i=0; i<ref.length; i++)
			System.out.println("arr[" + i + "]: " + arr[i]);
	}	
	
	
	public static int[] addArray(int[] arr, int addVal)
	{
		for(int i=0; i<arr.length; i++)
			arr[i]+=addVal;
		
		return arr;		//참조값 arr을 반환된 후 addArray메소드내의 arr은 소멸됩니다.
	}

}
