/* Chatting 프로그램 - MultiServer
 * 
 *  MultiClient
 *  MultiClientThread
 *  MultiServer
 *  MultiServerThread
 * 
 * ------------------------------------------------------------------
 * 모든 클라이언트의 TCP요청을 받아 소켓 객체를 생성한 후 소켓을 유지하기 위한 스레드를 생성하고
 * 이 스레드를 저장할 Collection(ArrayList)을 생성하는 클래스
 */

package com.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MultiServer {
	private ArrayList<MultiServerThread> list;
	private Socket socket;
	public MultiServer() throws IOException{
		list = new ArrayList<MultiServerThread>();
		ServerSocket serverSocket = new ServerSocket(5000);
		MultiServerThread mst = null;
		boolean isStop = false;
		while(!isStop){
			System.out.println("Server ready ....");
			socket = serverSocket.accept();
			mst = new MultiServerThread(this);
			//
			list.add(mst);
			//스레드 생성
			Thread t = new Thread(mst);
			t.start();
		}
	}
	//MultiServerThread타입의 Arraylist 반환
	public ArrayList<MultiServerThread> getList(){
		return list;
	}
	
	public Socket getSocket(){
		return socket;
	}
	
	public static void main(String[] args) throws IOException{
		new MultiServer();

	}

}
