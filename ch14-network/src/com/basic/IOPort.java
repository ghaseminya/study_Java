/*
//열려 있는 TCP포트를 확인하기
컴퓨터에 어떤 포트가 사용되어 지고 있는지 알아보기

ServerSocket 클래스의 생성자를 이용해서 현재 컴퓨터에 열려있는 포트를 확인할 수 있는 프로그램 작성하기
ServerSocket의 생성자는 열려져 있는 포트를 다시 열려고 할 경우 객체를 생성시키면서 IOException예외를 발생시키는데 
이를 이용하여 프로그램을 작성하도록 하겠습니다.
*/
package com.basic;

import java.io.IOException;
import java.net.ServerSocket;

public class IOPort {

	public static void main(String[] args) {

		//TCP에 열려져 있는 포트를 확인하기 위해 ServerSocket객체 생성
		//ServerSocket클래스는 1~65535번까지의 포트를 사용할 수 있습니다.
		//ServerSocket은 서버에서 창구 역할을 하는 것으로 직접적인 통신에 관여하는 것이 아니라,
		//외부 소켓 연결 요청이 오면 그 소켓과 통신할 서버측 소켓을 만들고 서로 연결하는데 
		//이때 접속이 이뤄지는 소켓의 포트를 지정하며 포트 번호는 사용하지 않는 포트 번호 중에 임의로 정해서 사용합니다.
		ServerSocket serverSocket  = null;
		
		//TCP에서 사용할 수 1~65535번까지의 포트를 확인하기위해 for반복을 하면서
		//ServerSocket이 열려있다면 그 TCP포트가 열려있다고 메시지를 출력하고
		//ServerSocket이 닫혀있다면 그 소켓을 연 다음, 바로 닫아서 확인하기
		for(int i=1; i<=65535; i++){
			try{
				//ServerSocket을 열려고 할 때 ServerSocket을 생성할 수 있는 경우(미 사용중인 포트인 경우)
				//바로 생성 후 close()한 후 try문을 빠져나옵니다.
				serverSocket = new ServerSocket(i);
				serverSocket.close();
			}catch(IOException e){
				//ServerSocket을 열려고 할 때 이 ServerSocket에 해당하는 TCP포트가 이미 열려져 있는 경우에는(사용중인 포트인 경우)
				//IOException예외가 발생하면서 아래의 메시지를 출력합니다.
				System.out.println(i + "번 TCP Port가 열려 있습니다.");
			}
		}
	} //main
} //IOPort
