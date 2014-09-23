
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


class Person
{

	private String personName;
	private int personID;
	private int personAge;

	
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
		else
			System.out.println("미성년자 입니다 \n");
	}
}