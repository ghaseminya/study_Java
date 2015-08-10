//생성자 호출을 통한 초기화 ( this() )
 

public class ThisTest4 {
	
	public static void main(String[] args) {

		People pp1 = new People();
		People pp2 = new People(18);
		People pp3 = new People("Hiro", 27);
		People pp4 = new People("Claire", 23, "Student");
		People pp5 = new People("Niki", 32, 0, "Secretary");

	}
}


class People
{
	private String name;
	private int age;
	private int sex;
	private String job;
	
	
	//인가값이 없는 기본 생성자
	public People(){
		this(null, 0, 1, null);	// 생성자내에서 4인자값을 가진 생성자를 다시 호출
	}

	//1인자값을 가진 생성자
	public People(int age){
		this(null, age, 1, null);
	}

	//2인자값을 가진 생성자
	public People(String name, int age){
		this(name, age, 1, null);
	}

	//3인자값을 가진 생성자
	public People(String name, int age, String job)
	{
		//생성자 내에서 다른 생성자를 다시 호출 가능, 메소드에서 다른 생성자의 호출을 얘기하는 것 아님!
		//5개의 인자값을 가진 다른 생성자를 다시 호출
		//this()
		this(name, age, 1, job);
	}

	
	//4인자값을 가진 생성자
	public People(String name, int age, int sex, String job)
	{
		//this		: 현재 인스턴스를 의미
		//this.name	: 인스턴스의 멤버변수
		//name		: 매개변수
		this.name =name;
		this.age=age;
		this.sex=sex;
		this.job=job;
		
		showInfo();
	}

	
	public void showInfo()
	{
		System.out.println(name + "\t" +
				age +"\t" + 
				sex + "\t" + 
				job);
	}
}