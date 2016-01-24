/*
매개변수 타입 추론 - 
버튼의 이벤트 처리 (람다식)

*/
import java.awt.Button;
import java.awt.Frame;

public class lambdaEx06 extends Frame{
	
	Button button;
	int count = 0;
	
	public lambdaEx06(){
		super("Lambda 테스트");
		
		button = new Button("Click me");
		
		//TODO 1: 람다식은 인터페이스의 추상메소드를 익명메소드형태로 구현합니다.
//		button.addActionListener( (ActionEvent e)->{
//			count ++;
//			button.setLabel("Button Click: " + count + " times");
//		});
		
		//리스너를 통한 인터페이스의 해당 추상메소드 형태
//		public void addActionListener( ActionListener al){
//
//			public interface ActionListener{
//				public void actionPerformed(ActionEvent e);
//			}
//		}
		
		
		//TODO 2: e라고 해도  ActionEvent e 라는 것을  매개변수 타입 추론으로 매핑시켜줍니다.
		//인터페이스를 구현한 객체를 전달하는 대신에 이름이 정해지지 않은 함수처럼 생긴 코드 블록을 전달한다. 
		//e: 파라미터의 이름이고, 익명 내부 클래스 예제에서의 파라미터와 같습니다.
		//->기호: 파라미터와 람다식을 분리하는 지시자
		//람다식은 사용자가 버튼을 클릭했을 때 실행됩니다.
		button.addActionListener( (e)->{
			count ++;
			button.setLabel("Button Click: " + count + " times");
		});
		
		//익명내부클래스에서는 ActionEvent와 같이 코드에 해당 타입을 정확하게 명시해야 합니다.
		//람다식을 활용한 예제에서는 어떠한 타입도 제공하지 않지만, 정상적으로 컴파일됩니다.
		//내부적으로 자바 컴파일러는 코드의 흐름을 통해 event 변수의 타입을 추론해서 해당 타입을 알아낸다
		//addActionListener를 통해서 추론하게 되는 것입니다. 즉, 타입이 명백한 경우 굳이 타입을 명시하지 않아도 된다는 뜻입니다.
		
		add(button);
	}
	
	public static void main(String[] args) {
		lambdaEx06 le = new lambdaEx06();
		le.setSize(300, 200);
		le.setVisible(true);
		
	}
}
