/*
//System.out.print vs System.out.println

System.out.println()
System.out.println()은 Sytem 클래스의 멤버 out이 참조하는 인스턴스의 println 메소드를 호출하는 문장

System		out				println
클래스 이름		static 참조 변수	메소드


System
	• java.lang 패키지에 묶여있는 클래스의 이름
//	• import java.lang.*; 구문이 자동 삽입되어 있어 System이란 이름을 직접 쓸 수 있습니다. (full name을 쓰지 않아도)

out
	• static 변수이되 인스턴스를 참조하는 참조변수
	• PrintStream이라는 클래스의 참조변수

public class System{
        public static final PrintStream out;
        
}
static final로 선언되어 있어, 
인스턴스의 생성 없이 system.out 이라는 이름으로 접근 가능


System.out.print vs System.out.println
	• print 메소드는 출력 후에 개행을 하지 않습니다.
	• println 메소드는 출력 후에 개행합니다.
	• println, print 메소드의 인자로 인스턴스의 참조값이 전달 될 수 있습니다.


TODO :표준 출력만 실습할 경우
- 객체를 배우지 않은 경우 Friend클래스 활용하지 않고 표준 출력 실습
- 객체를 배운 경우 Friend클래스 활용하여 표준 출력 실습

*/
public class ConsoleOutputEx01 {

	public static void main(String[] args){	
		//참조변수의 선언 = 인스턴스 생성
		Friend myFriend1=new Friend("홍길동");
		Friend myFriend2=new Friend("일지매");
		
		//인스턴스의 참조값을 전달받아서 출력됩니다.
		System.out.println(myFriend1);
		System.out.println(myFriend2);
		
		
		//TODO :표준 출력만 실습할 경우
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
		//println 메소드에 인스턴스의 참조값이 전달되면, 
		//인스턴스의 toString 메소드가 반환하는 문자열이 출력됩니다.
	}	
}

