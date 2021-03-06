/*
//키워드this()를 이용한 다른생성자의호출
//키워드this를 이용한 멤버변수 호출


[this의 용법]
형식				의미
this			• 객체 자신
				• 파라미터 값으로 객체 자신의 참조값을 넘겨줄때에도 this 사용
				
this.멤버변수		• 매개변수와 객체 자신이 가지고 있는 변수(멤버변수)의 이름이 같은 경우 이를 구분하기 위해 자신의 멤버변수에 this를 사용

this(매개변수);		• 생성자내에서 다른 생성자를 호출


*/
public class OverloadingEx05 {

	public static void main(String[] args) {

		Human human1 = new Human("배태랑", 123456789, 42, 1, "과장");	//6명
		Human human2 = new Human("강아지", 52, 0, "부장"); //5명
		
		human1.showInfo();
		human2.showInfo();
	}
}

class Human{
	private String name;	//이름
	private int personID;	//개인식별번호
	private int age;		//나이
	private int sex;		//성별
	private String position; //직책
	

	//5인자값을 가진 생성자
	public Human(String name, int personID, int age, int sex, String position)
	{
		//this		: 현재 인스턴스를 의미
		//this.name	: 인스턴스의 멤버변수
		//name		: 매개변수
		this.name =name;
		this.personID=personID;
		this.age=age;
		this.sex=sex;
		this.position=position;
	}
	
	//4인자값을 가진 생성자
	public Human(String name, int age, int sex, String position)
	{
		//생성자 내에서 다른 생성자를 다시 호출 가능, 메소드에서 다른 생성자의 호출을 얘기하는 것 아님!
		//5개의 인자값을 가진 다른 생성자를 다시 호출
		this(name, 0, age, sex, position);
		
		//this생성자 말고 생성할 수는 없습니다. Human()는 외부에서 객체를 생성할때 호출하는 것이므로
//		Human(name, 0, age, sex, position); //ERROR-The method Human(String, int, int, int, String) is undefined for the type Human
	}
	

	//this()아닌 오버로딩으로 작업할 경우 아래와 같이
	//중복된 코드의 삽입이 많아질수 있습니다.
	//초기화 과정의 중복작업을 줄일 수 있습니다.
//	public Human(String name, int personID, int age, int sex, String position)
//	{
//		//this	: 현재 인스턴스를 의미
//		this.name =name;
//		//personID에 0을 저장한 후 초기화하여 야 합니다.
//		personID=0;
//		this.personID=personID;
//		this.age=age;
//		this.sex=sex;
//		this.position=position;
//	}
	
	
	public void showInfo() {
		System.out.println(name + "님 안녕하세요!!!");
		if(personID!=0){
			System.out.println("당신의 ID: "+ personID);
			System.out.println("입장하세요\n");
		}
		else
			System.out.println("미성년자 입니다 \n");
	}
}