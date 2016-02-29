/*
//함수형 인터페이스인 Interface Runnable를 통한 쓰레드 구현
인터페이스 중에서 메소드를 하나만 가지고 있는 인터페이스를 함수형 인터페이스라고 합니다.
//---------------------------------------
File Info
*lambdaEx10	• Runnable을 이용하여 쓰레드를 만들기
			• 함수형 인터페이스인 Interface Runnable를 통한 쓰레드 구현
lambdaEx11	• 람다식을 이용하여 쓰레드 만들기
			• lambdaEx10을 람다식으로 변경

//---------------------------------------
쓰레드가 실행되면 쓰레드 생성자 안에서 구현된 run()메소드가 실행됩니다.
자바는 메소드만 매개변수로 전달할 방법이 없습니다. 자바는 메소드에 인스턴스만 전달 할 수 있습니다.
그렇기 때문에 run()메소드를 가지고 있는 Runnable객체를 만들어서 전달해야 합니다.

*/
public class lambdaEx10 {

	public static void main(String[] args) {
		//Runnable을 이용하여 쓰레드를 만들기
		new Thread(new Runnable(){

			@Override
			public void run() {
				for(int i=0; i<10; i++){
					System.out.println("lambda");
				}
			}
			
		}).start();
	}
}
