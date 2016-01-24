/*
값의 사용 예제 코드
익명 내부 클래스를 사용할 때 클래스 안에 있는 메소드에서 메소드 밖의 변수를 사용해야 할 때 
해당 변수를 final로 만들어야 합니다.

TODO 1: 명시적으로 final키워드를 사용한 경우
TODO 2: final키워드를 생략한 경우
*/
import java.awt.Button;
import java.awt.Frame;

public class lambdaEx08 extends Frame{

	Button button;
	
	public lambdaEx08(String name){
		super("Lambda 테스트");
		button = new Button("Click me");
		
		//TODO 1: 명시적으로 final키워드를 사용한 경우
		//익명 내부 클래스를 사용할 때 클래스 안에 있는 메소드에서 메소드 밖의 변수를 사용해야 할 때 해당 변수를 final로 만들어야 합니다.
		//변수를 final로 만든다는 것은 이 변수에 값 을 다시 재할당할 수 없다는 의미다. 
		//즉, 이 변수에는 이미 특정 값이 할당되어 있다는 뜻이므로 이를 항상 인지하면서 final 변수를 사용해야 합니다.
//		final String user = name;
		
		//TODO 2: final키워드를 생략한 경우
		String user = name;
		//자바 8에서는 이러한 제약 사항이 다소 줄어들어서 final이 아닌 변수를 참조하는 것이 가능하다. 하지만 이 변수들은 여전히 final과 같다. 
		//변수를 final로 선언하지는 않았지만, 해당 변수가 람다식 안에서 사용되고 있다면
		//그 변수는 내부적으로 final 변수로 바뀌어 처리됩니다. 
		//변수를 final이 아닌 변수처럼 사용하는 코드를 작성하면 컴파일 에러가 발생합니다.
		//실질적으로 final 변수가 되다 보니 그 변수에는 오직 한 번만 값을 할당할 수 있습니다. 
		//이렇게 동작하는 이유는 람다식이 변수를 캡쳐하는 것이 아니라 값을 캡쳐하기 때문입니다.

		button.addActionListener( (e)->{
			button.setLabel("Your name is" + user);
		});
		
		add(button);
	}
	
	public static void main(String[] args) {
		lambdaEx08 le = new lambdaEx08("Kevin");
		le.setSize(300, 200);
		le.setVisible(true);
	}

}
