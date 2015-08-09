//객체 배열 생성
//참조값을 통한 인스턴스 접근 - for-each문

//for-each문의 인스턴스 배열
//	• 인스턴스 배열에 저장된 참조 값의 변경은 불가능하지만, 
//	• 참조 값을 통한 인스턴스의 접근은(데이터 변경도)가능합니다.


public class ArrayEx15 {

	public static void main(String[] args) {

		//인스턴스 배열 생성(=객체형 배열 생성)
		//객체형 배열은 객체를 가리킬 수 있는 참조 값(주소)들의 묶음
		Num[] arr=new Num[3];

		//배열의 요소에 객체의 참조값 저장
		arr[0] = new Num(10);
		arr[1] = new Num(20);
		arr[2] = new Num(30);


		for(Num e: arr){
			System.out.println(e.getNum());	//참조값 출력으로 확인
		}
	}
}


class Num{
	public int num;

	public Num(int num){
		this.num=num;
	}

	public int getNum(){
		return num;
	}
}