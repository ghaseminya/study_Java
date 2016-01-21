//참조값을 통한 인스턴스 접근 - for-each문

//for-each문의 인스턴스 배열
//	• 인스턴스 배열에 저장된 참조 값의 변경은 불가능하지만, 
//	• 참조 값을 통한 인스턴스의 접근은(데이터 변경도)가능합니다.


public class ArrayEx12 {

	public static void main(String[] args) {
		
		//인스턴스 배열 생성(=객체형 배열 생성)
		Number[] arr=new Number[]{
				new Number(2),
				new Number(4),
				new Number(6)
		};

		//arr 배열요소의 값변경 확인
		for(Number e: arr){
			e.num++;	//배열의 인스턴스의 값을 변경
//			System.out.println(e);	//참조값 출력으로 확인
		}

		//arr 배열 요소 출력
		for(Number e: arr)
			System.out.print(e.getNum()+" "); //3 5 7 
		
		
		//arr의 배열요소의 참조값을  new Number(7)의 새로운 인스턴스 참조값을 참조하도록 변경
		//3개의 요소가 모두 동일한 형태의 새로 생성되는 객체의  참조값을 가짐(새로 생성된 객체의 참조값을 저장하므로 참조값은 다름)
		//arr의 배열요소의 값이 바뀌지 않음 확인
		System.out.println("");
		for(Number e: arr){
			e=new Number(7);	//배열의 참조값 변경으로 arr 배열요소의 참조값이 변경됨
			e.num+=2;
			System.out.print(e.getNum()+" "); //9 9 9 
//			System.out.println(e);	//참조값 출력으로 확인
		}

		System.out.println("");
		for(Number e: arr)
			System.out.print(e.getNum()+" "); //3 5 7 
	}
}

class Number{
	public int num;
	
	public Number(int num){
		this.num=num;
	}
	
	public int getNum(){
		return num;
	}
}