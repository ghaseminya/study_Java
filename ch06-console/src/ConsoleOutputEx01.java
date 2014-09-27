/*
System.out.print vs System.out.println

*/

public class ConsoleOutputEx01 {

	public static void main(String[] args)
	{		
		Friend myFriend1=new Friend("홍길동");
		Friend myFriend2=new Friend("일지매");
		
		//인스턴스의 참조값을 전달받아서 출력됩니다.
		System.out.println(myFriend1);
		System.out.println(myFriend2);
		
		System.out.print("출력이 ");
		System.out.print("종료되었습니다.");
		System.out.println("");
		System.out.print("끝");
	}
}


class Friend
{
	String name;
	public Friend(String name)
	{
		this.name=name;
	}
	
	public String toString()
	{
		return "제 친구의 이름은 "+ name +"입니다.";
		//println 메소드에 인스턴스의참조값이 전달되면, 
		//인스턴스의 toString 메소드가 반환하는 문자열이 출력됩니다.
	}	
}

