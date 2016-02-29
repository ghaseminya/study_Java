package lambda02;
/*
내부클래스, 익명클래스, 람다를 왜 사용하는지 자바를 처음 시작할 때는 이해하기 어려울 수 있습니다.
예제코드를 보면서 "저렇게도 쓸 수 있구나" 하고는 이해 수준으로 학습하기시 바랍니다.
내부클래스, 익명클래스, 람다를 이용해서 같은 작업을 어떻게 다르게 할 수 있는지 살펴보면서 코드 형태가 어떻게 이뤄져 있는지 확인하시기 바랍니다.

*/
public class Car{
	//이어지는 예제에서 사용할 Car클래스입니다.
	//이름, 탑승인원, 가격, 사용년수를 필드로 가집니다.
	public String name;
	public int capacity;  
	public int price;
	public int age;

	//각각의 필드를 생성자에서 받아서 초기화합니다.
	public Car(String name, int capacity, int price, int age){
		this.name = name;
		this.capacity = capacity;
		this.price = price;
		this.age = age;
	}

	//Car 객체를 문자열로 출력하면 이름을 출력합니다.
	public String toString(){
		return name;
	}
	
}