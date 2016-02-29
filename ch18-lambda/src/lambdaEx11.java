/*
람다식을 이용하여 쓰레드 만들기
lambdaEx10 -> 람다표현식으로 변경

File Info
lambdaEx10	• Runnable을 이용하여 쓰레드를 만들기
			• 함수형 인터페이스인 Interface Runnable를 통한 쓰레드 구현
*lambdaEx11	• 람다식을 이용하여 쓰레드 만들기
			• lambdaEx10을 람다식으로 변경


자바는 메소드만 매개변수로 전달할 수 있는 방법이 없기때문에 매번 객체를 생성해서 매개변수로 전달해야 합니다. 
이 부분을 해결한 것이 람다표현식입니다.

JVM은 Thread생성자를 보고 ()->{} 이 무엇인지 대상을 추론합니다. 그래서,
JVM은 Thread생성자가 Runnable인터페이스를 구현한 것을 알게 되고 
내부적으로 람다식을 Runnable을 구현하는 객체로 자동으로 만들어서 매개변수로 넣어주게 됩니다.
*/
public class lambdaEx11 {

	public static void main(String[] args) {
		//Runnable을 이용하여 쓰레드를 만들기
		new Thread(() -> {
				for(int i=0; i<10; i++){
					System.out.println("lambda");
				}
			}
		).start();
	}
}
