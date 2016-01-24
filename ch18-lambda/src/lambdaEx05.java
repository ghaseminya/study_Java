/*
매개변수 타입 추론 - 
버튼의 이벤트 처리 (익명내부클래스로 구현)
익명의 내부 클래스를 사용하여 버튼 클릭 시 정해진 동작을 수행하는 코드

*/
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lambdaEx05 extends Frame{

	Button button;
	int count = 0;
	
	
	public lambdaEx05(){
		super("Lambda 테스트");
		
		button = new Button("Click me");
		
		//ActionListener 클래스의 구현을 담당하는 새로운 객체를 만든다.
		//이 인터페이스는 actionPerformed라는 하나의 메소드를 가지는데, 
		//이 메소드는 사용자가 화면에 있는 버튼을 눌렀을 때 버튼 인스턴스로부터 호출된다. 
		//익명 내부 클래스(Anonymous inner class)가 바로 이 메소드를 구현한 것이 람다식
		//코드가 데이터 그 자체로 사용되는 것을 보여주는 것. 다시 말하면 하나의 동작을 수행하는 객체를 버튼에 할당한 것
		//익명 내부 클래스는 코드를 데이터처럼 간단하게 넘겨주기 위해서 고안된 것
		button.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				count ++;
				button.setLabel("Button Click: " + count + " times");
				}
		});
		
		add(button);
		
	}
	
	
	public static void main(String[] args) {
		lambdaEx05 le = new lambdaEx05();
		le.setSize(300, 200);
		le.setVisible(true);
		
	}
}
