/* Button 생성 - layout 미사용
 * 
 * import 
 * Frame 상속
 * 생성자 설정
 * 객체 생성
 * 
 * Button 추가
 * layout미사용지정	//setLayout(null)
 * 
 * button의 좌표지정(x, y 위치 지정)
 * 
 * --------------------------------------
 * 컴포넌트를 많이 쓸경우 일일이 사이즈와 좌표지정해야 되는 문제 발생
 * 
 */

package com.display;

import java.awt.Frame;
import java.awt.Button;

//Frame 상속
public class ButtonEx02 extends Frame {
	
	//생성자 설정
	public ButtonEx02(){
		//제목 생성
		super("button Test 02");		
		//크기 지정
		setSize(300,  300);	//width, height			
		
		//Button 추가하기
		Button b = new Button("확인");
		//layout미사용지정: layout 사용안하고 setSize()사용하도록 명시적으로 지정
		setLayout(null);
		b.setSize(100,  50);	//widht, height
		b.setLocation(100, 50);	//x, y 위치 지정
		//Button을 Frame에 등록
		add(b);
		
		//Frame 노출 여부 설정
		setVisible(true);
	}
	

	public static void main(String[] args) {
		// 객체 생성
		new ButtonEx02();

	}

}
