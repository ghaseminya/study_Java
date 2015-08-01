/*
Object클래스의 equals()메소드 재정의

ObjectClassEx02에서 별도의 isEquals메소드를 정의하는 것이 아니라
Object클래스의 equals()메소드를 재정의하여 내용비교하도록 처리
*/
class IntNumber3 {
	int num;
	
	public IntNumber3(int num) {
		this.num=num;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.num==((IntNumber3)obj).num)
			return true;
		else
			return false;
	}
}

public class ObjectClassEx03 {
	public static void main(String[] args) {
		IntNumber3 num1=new IntNumber3(10);
		IntNumber3 num2=new IntNumber3(15);
		IntNumber3 num3=new IntNumber3(10);
		
		if(num1.equals(num2))
			System.out.println("num1과 num2는 같은 정수");
		else
			System.out.println("num1과 num2는 다른 정수");
		
		if(num1.equals(num3))
			System.out.println("num1과 num3는 같은 정수");
		else
			System.out.println("num1과 num3는 다른 정수");
	}

}
