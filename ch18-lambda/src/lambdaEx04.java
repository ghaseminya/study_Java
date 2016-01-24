/*
매개변수 타입 추론 - 
버튼의 이벤트 처리 (Java 7)

스윙Swing은 그래픽 사용자 인터페이스GUI, graphical user interfaces를 만드는 플랫폼 독립적인 자바 라이브러리다. 
스윙은 다른 GUI 라이브러리들처럼 사용자가 수행하는 일을 알아내기 위한 이벤트 리스너를 등록하는 보편적인 방식을 사용한다. 
이벤트 리스너는 사용자의 입력에 적절한 응답을 하기 위해서 몇 가지 동작을 수행합니다.

*/
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lambdaEx04 extends Frame{

	Button button;
	int count = 0;
	
	
	public lambdaEx04(){
		super("Lambda 테스트");
		
		button = new Button("Click me");
		
		button.addActionListener( new ButtonHandler());
		
		add(button);
		
	}
	
	public class ButtonHandler implements ActionListener {

		//actionPerformed() 메소드를 반드시 작성해야 한다. 인자도 반드시 이와 똑 같이 작성해야 합니다. 
		//이러한 내용은 ActionLIstener 인터페이스에 이미 정의되어 있습니다.
		@Override
		public void actionPerformed(ActionEvent e) { //ActionEvent: Button이 눌려졌을 때 발생되는 이벤트
			count ++;
			button.setLabel("Button Click: " + count + " times");
		}
	}
	
	
	public static void main(String[] args) {
		lambdaEx04 le = new lambdaEx04();
		le.setSize(300, 200);
		le.setVisible(true);
		
	}
}
