package com.gen14;

/*
?와 제네릭 변수 선언

<? extends Info> 
<? extends Info>가 의미하는 바는 “Info을 상속하는 모든 클래스”를 지칭합니다

Person<? extends Info> person1 = new Person<StudentInfo>();
Person<? extends Info> person2 = new Person<EmplyeeInfo>();
Person<StudentInfo> 인스턴스의 참조 값도, Person<EmplyeeInfo> 인스턴스의 참조 값도
인자로 전달받을 수 있는 매개변수의 선언에는 와일드카드 문자 ?가 사용됩니다

*/
class Fruit{
	public void showYou(){ 
		System.out.println("난 과일입니다.");
	}
}

class Apple extends Fruit{
	public void showYou(){
		super.showYou();
		System.out.println("난 붉은 과일입니다.");
	}	
}

class FruitBox<T>{
	T item;
	public void store(T item) { this.item=item; }
	public T pullOut() { return item; }
}

public class GenericEx01 {
	//Fruit를 상속하는 클래스의 인스턴스라면 무엇이든지 참조 가능한 참조변수 선언
	public static void openAndShowFruitBox(FruitBox<? extends Fruit> box){
		Fruit fruit=box.pullOut();
		fruit.showYou();
	}

	public static void main(String[] args){
		FruitBox<Fruit> box1=new FruitBox<Fruit>();
		box1.store(new Fruit());

		FruitBox<Apple> box2=new FruitBox<Apple>();
		box2.store(new Apple());

		openAndShowFruitBox(box1);
		openAndShowFruitBox(box2);
	}
}
