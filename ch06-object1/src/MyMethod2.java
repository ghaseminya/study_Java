
//지역변수 우선권 확인하기
//10000이 출력되지 않는 이유가 무엇일까? 
//문제는 setInt(int var)라는 메서드(멤버함수)에 있으며 자바에서는 특정 영역의 우선권은 멤버변수가 아닌 지역변수가 가지게 되어 있습니다. 


public class MyMethod2 {

	//멤버변수
	int money;

	//인자가 정의되면서 money라는 지역변수가 선언, 지역 변수란 현재 영역(함수)을 벗어나면 소멸되는 메모리 공간을 의미 
	public void setMoney(int money){	// 메서드(멤버 함수)
		//지역변수의 이름이 멤버변수와 같을 경우에는 지역변수가 우선권을 가지므로 여기서는 멤버변수에 값 대입이 아닌 지역변수 자신에게 자신의 값을 대입한 것이다
		money = money;		// -> 0으로 출력
		//		  this.money = money; 	//지역변수 우선순위를 제어한 구문, 5580으로 출력
	}

	public int getMoney(){
		return money;
	}
	public static void main(String[] args){
		MyMethod2 mm = new MyMethod2();

		mm.setMoney(5580);
		System.out.println("money: " + mm.getMoney());
	}
}

