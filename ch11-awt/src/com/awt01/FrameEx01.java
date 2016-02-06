package com.awt01;
/*
//프레임 생성하기 1
//AWT 사용 기본 구조

AWT의 기본 개념
	• AWT(Abstract Window Toolkit)는 
	GUI 프로그래밍을 제작하기 위해 자바에서 제공하는 라이브러리를 모아놓은 것(GUI 환경을 구축하기 위한 자바 API)
	• AWT는 모든 GUI 프로그램에 사용되는 컴포넌트 및 툴킷을 제공하고 있으며 
	JFC와 같은 스윙(Swing)및 Java2D의 모태가 되는 개념
	• 버튼, 체크박스 등의 콤포넌트와 이벤트 처리를 위한 인터페이스를 포함하고 있습니다.
	• AWT는 운영체제에 구해받지 않고 쓸 수 있도록 운영체제에서 제공하는 것을 사용하지만 
	그대로 사용하지 않고 공통적이고 기본적인 컴포넌트들을 추상화시켜 제공합니다
	• 그래서 실행되는 운영체제에 따라 다르게 보이거나 동작 방식에 차이가 있을 수 있습니다.
	• 이러한 단점을 극복하기 위해 개발된 것이 JFC(Java Foundation Classes)입니다.


JFC (Java Foundation Classe)
	• JFC는 클래스 라이브러리 형태로 자바 프로그래밍 언어를 사용해 미리 작성해 놓은 코드 모음 (GUI 프로그래밍에 필요한 각종 툴킷을 모아놓은 것)
	• GUI의 기능들을 구현할 수 있는 AWT, 스윙(Swing), 2D, Accessibiliy(접근성), Drag&Drop 등을 지원합니다.


Container(컨테이너)
	• 추상클래스로서 다른 컴포넌트를 포함할 수 있는 기능을 가진 컴포넌트들의 상위 클래스
	• 컨테이너는 자신의 영역 내부에 다른 컴포넌트를 포함시키고 관리하는 역할을 합니다
	• 컨테이너가 다른 컨테이너를 포함할 수도 있습니다.
	• 컴포넌트는 컨테이너에 부착시키지 않으면 독자적으로 화면에 출력될 수가 없고 반드시 컨테이너에 부착을 시켜야만 화면에 출력이 됩니다.
	• 부착은 add() 메소드를 이용
	• 컨테이너에 컴포넌트의 위치를 결정하는 것을 배치(Layout)라고 합니다.



컨테이너 클래스의 종류
컨테이너에 컴포넌트를 부착시키기 위해서는 add()메서드를 사용해야 합니다.
	• Frame
	• Window
	• Panel
	• Applet
	• Dialog
	• FileDialog
	• ScrollPane



Frame
	• Window 클래스의 하위 클래스로 일반적인 응용프로그램에서 윈도우를 생성하기 위해 사용되는 클래스
	• Frame 클래스의 상위 클래스인 Window 클래스는 타이틀, 메뉴 등이 지원되지 않기 때문에 일반적으로 사용하지 않고 Frame 클래스를 사용합니다 
	• Frame 클래스는 기본적으로 경계선(Border), 타이틀, 메뉴, 시스템상자(최소화, 최대화, 종료 버튼) 등의 기능을 제공합니다
	• Frame은 다른 윈도우에 속해 있지 않은 윈도우(최상위 레벨 윈도우)
	• 대부분의 윈도우 Application 에서 사용되며 윈도우 화면을 나타내는 클래스
	• setSize(),  setBounds()메서드 등을 이용해서 Window의 크기를 설정한 후 setVisible(), show()메서드를 통해서 화면에 출력시킬 수 있습니다.


*/

//awt패키지 사용
import java.awt.Frame;

public class FrameEx01 {
	
	public static void main(String args[]) {
		//객체 생성
        Frame frame = new Frame("Frame Test");
        
        //프레임 사이즈 설정(가로px, 세로px)
        frame.setSize(400, 300);
        
        //프레임 보이게 설정
        frame.setVisible(true);       
  }
}
