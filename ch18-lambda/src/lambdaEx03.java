/*
대상 타입 추론

아래의 함수형(Functional)인터페이스의 임의 객체를 람다식으로 표현한 것입니다.
대상타입을 함수형 인터페이스로 하는 값으로 아래 같이 추론합니다. 
public interface Runnable{
        public abstract void run();
}

*/
import java.io.PrintStream;

public class lambdaEx03 {

	public static void main(String[] args) {

		new Thread( new Runnable(){

			@Override
			public void run() {
				System.out.println("Hi Lambda1");
			}
			
		}).start();
		
		
		//()->에 대상 타입은 추론해서 넣어줍니다.
		new Thread( ()->{
			System.out.println("Hi Lambda2");
		}).start();
	}
	
	public void sayLambda(PrintStream out){
		out.println("Hi Lambda");
	}

	
}
