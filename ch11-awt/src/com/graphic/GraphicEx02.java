/* 이미지 불러오기
 * 
 * x버튼 이벤트처리 - 익명내부 클래스로
 * 
 * ch11-awt에 bird.jpg에 복사해 넣습니다. 
 * 
 * 읽어온 이미지를 이미지 객체에 저장하기
 * @Override public void paint(Graphics g){ }
 */

package com.graphic;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;


public class GraphicEx02 extends Frame{
	
	Image img = null;
	
	public GraphicEx02(){
		super("그래픽 테스트2");
		
		//x버튼 이벤트처리 - 익명내부 클래스로
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}			
		});		
				
		//이미지 읽기
		//읽어온 이미지를 이미지 객체에 저장하기
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("bird.jpg");	//300x200
		
		//Frame 설정
		setBounds(100, 100, 400, 400);
		setVisible(true);
		
	}
	@Override
	public void paint(Graphics g){
		
		//이미지가 null경우 
		if(img == null) 
			return;
		
		//drawImage(Image 객체, x, y, width, height, ImageObserver객체)
		//g.drawImage(img, 300, 200,  this);
		//g.drawImage(img, 0, 0, 300, 200,  this);
		// 이미지를 늘이면 이미지 깨짐이 발생
		//g.drawImage(img, 0, 0, 450, 300,  this);
		//이미지를 줄일경우 비율로 줄인다. 위에 있는 것도 좌표로 인식한다.
		//g.drawImage(img, 0, 0, 150, 100,  this);
		
		//이미지를 줄일경우 비율로 줄인다. 위에 있는 것도 좌표로 인식한다.
		g.drawImage(img, 10, 10, 300, 200,  this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicEx02();
	}
}
