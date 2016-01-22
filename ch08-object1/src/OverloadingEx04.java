/*
//생성자 오버로딩
//인자값을 가진 생성자를 통해 다양한 인스턴스 생성


생성자 오버로딩
	• 생성자의 Overloading은 객체를 생성할 수 있는 방법의 수를 제공하는 것
	• 메서드 오버로딩법과 다를 것이 없어 각 생성자의 구분은 인자로 구별하게 됩니다. 
	• 생성자의 오버로딩은 하나의 클래스를 기반으로 다양한 형태의 인스턴스 생성을 가능하게 합니다.

*/
public class OverloadingEx04 {

	public static void main(String[] args) {

		//3개 인자값을 가진 생성자를 통해 인스턴스 생성
		Person man=new Person("일지매", 880102, 32);
		//2개 인자값을 가진 생성자를 통해 인스턴스 생성
		Person idol=new Person("홍길동", 18);	
		man.showInfo();
		idol.showInfo();
		
	}
}


class Person{
	private String personName;
	private int personID;
	private int personAge;

	//생성자 오버로딩
	public Person(String name, int pID, int age)
	{
		personName =name;
		personID=pID;
		personAge=age;
	}
	
	public Person(String name, int age)
	{
		personName=name;
		personID=0;
		personAge=age;
	}
	public void showInfo()
	{
		System.out.println(personName + "님 안녕하세요!!!");
		if(personID!=0){
			System.out.println("당신의 ID: "+ personID);
			System.out.println("입장하세요\n");
		}
		else{
			System.out.println("당신의 나이는: "+ personAge);
			System.out.println("미성년자 입니다 \n");
		}
	}
}