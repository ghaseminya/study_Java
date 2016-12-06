/*
//this() 생성자 호출을 통한 초기화


this()
	• 현재 객체의 생성자를 의미
	• (주의) 생성자의 첫 행에 정의해야 합니다. 그렇지 않으면 컴파일시 오류가 발생합니다.
	• this()를 이용하여 한 클래스내의 특정 생성자에서 Overloading되어 있는 다른 생성자를 호출할 수 있게 합니다. 
	    이렇게 함으로써 생성자에서 코딩 내용이 중복되는 부분을 막을 수 있습니다.
	• 매개변수가 있는 경우 생성자는 입력받은 매개변수에 따라 이들 필드를 초기화합니다.

 
*/
public class ThisEx03 {
	
	public ThisEx03(){

		//초기화 작업 전에 수행문이 있으면 ERROR:Constructor call must be the first statement in a constructor
//		System.out.println("생성자 호출 전 수행문 호출(ERROR)");
	
		//생성자내에서 또 다른 생성자 호출(생성자내에서 또 다른 생성자를 호출하는 것도 초기화 작업 임)
		//this(): 현재 객체의 생성자
		//		    생성자내에서 다른 생성자를 호출(생성자내에서 코딩 중복 부분을 막을 수 있음)
		this("인자없는 생성자 ");
		System.out.println("생성자 호출 후 수행문 호출(정상)");
	}
	
	public ThisEx03(String msg){
		System.out.println(msg);
	}
	
	public ThisEx03(int a){
					//int -> String
		//String	s = String.valueOf(a);
		//System.out.println(s);
		this(String.valueOf(a)); //생성자내에서 또 다른 생성자를 호출하는 것도 초기화 작업 임	
	}	

	public static void main(String[] args) {
		ThisEx03 tt1 = new ThisEx03();
		
		System.out.println("==================");
		ThisEx03 tt2 = new ThisEx03(1000);
		
		System.out.println("==================");
		ThisEx03 tt3 = new ThisEx03("대한민국");
	}
}
