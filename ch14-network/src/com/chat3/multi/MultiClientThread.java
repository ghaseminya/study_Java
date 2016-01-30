/* MultiClient
 * 
 *  MultiClient
 *  MultiClientThread
 *  MultiServer
 *  MultiServerThread
 * 
 * ----------------------------------------------------------------
 * 다른 클라이언트의 메시지를 받기 위한 클래스
 * 
 */

package com.chat3.multi;

public class MultiClientThread extends Thread{
	private MultiClient mc;
	
	public MultiClientThread(MultiClient mc){
		this.mc = mc;
	}
	@Override
	public void run(){
		//전송할 
		String message = null;
		//받은
		String[] receivedMsg = null;
		boolean isStop = false;
		
		//무한루프
		while(!isStop){
			
			try{
				//서버에서 전송된 데이터
				//readObject 역직렬화하여 데이터를 읽어옴
				message = (String)mc.getOis().readObject();
				//#으로 메시지 분리
				//receiveMsg[0]: ID 
				//[1]: message 
				receivedMsg = message.split("#");
				
			}catch(Exception e){
				e.printStackTrace();
				//예외가 발생한 경우 while문을 빠져나옴
				isStop = true;				
			}
			System.out.println(receivedMsg[0] + ", " + receivedMsg[1]);
			
			//데이터를 전송한 유저가 종료한 경우
			if(receivedMsg[1].equals("exit")){
				if(receivedMsg[0].equals(mc.getId())){
					//현재 사용자와 동일한 ID이면 프로그램 종료
					mc.exit();
				}else{	//타user 종료시
					mc.getJta().append(receivedMsg[0] + "님이 종료하였습니다." + System.getProperty("line.separator"));
					//Caret = cursor
					//커서의 위치를 보정
					//전체 글을 읽어들여서 그 다음위치에 커서가 놓이게 위치시킴
					mc.getJta().setCaretPosition(mc.getJta().getDocument().getLength());
				}				
			}else{	//데이터를 전송한 유저가 계속 채팅중인 경우
				mc.getJta().append(receivedMsg[0] + ": " + receivedMsg[1] + System.getProperty("line.separator"));
				//커서 위치 보정
				mc.getJta().setCaretPosition(mc.getJta().getDocument().getLength());
			}
		}		
	}
}
