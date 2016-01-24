/*
값의 사용 예제 코드
실질적 final 변수의 잘못된 사용으로 컴파일 에러가 발생하는 코드

변수에 여러 번 값을 할당하고, 이 변수를 람다식에 사용하면 컴파일 에러가 발생
변수를 final이 아닌 변수처럼 사용하는 코드를 작성하면 컴파일 에러가 발생하는 것 확인

이런 특성 때문에 어떤 이들은 람다식을 ‘클로저closures’라고도 합니다. 
클로저는 해당 상황에 따라 약간씩 의미가 달라진다. 여기서는 변수일 때를 예로 드는데, 
아직어딘가에 할당되지 않은 상태이지만 어떤 값으로 사용하기 위해서 특정 구문 안에 위치한 변수라고 설명할 수 있습니다.

*/
import java.awt.Button;
import java.awt.Frame;

public class lambdaEx09 extends Frame{
	Button button;
	
	public lambdaEx09(String name){
		super("Lambda 테스트");
		button = new Button("Click me");
		
		//변수에 여러 번 값을 할당하고, 이 변수를 람다식에 사용하면 컴파일 에러가 발생
		//변수를 final이 아닌 변수처럼 사용하는 코드를 작성하면 컴파일 에러가 발생하는 것 확인
		String user = name;
//		user = "Alice";

		button.addActionListener( (e)->{
			//ERROR-Local variable user defined in an enclosing scope must be final or effectively final
			button.setLabel("Your name is" + user);
		});
		
		add(button);
	}
	
	public static void main(String[] args) {
		lambdaEx09 le = new lambdaEx09("Kevin");
		le.setSize(300, 200);
		le.setVisible(true);
	}
}
