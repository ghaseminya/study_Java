//this() 생성자 호출을 통한 초기화
 

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
		this(String.valueOf(a));	//생성자내에서 또 다른 생성자를 호출하는 것도 초기화 작업 임	
	}	

	public static void main(String[] args) {
		ThisEx03 tt1 = new ThisEx03();
		
		System.out.println("==================");
		ThisEx03 tt2 = new ThisEx03(1000);
		
		System.out.println("==================");
		ThisEx03 tt3 = new ThisEx03("대한민국");
	}
}
