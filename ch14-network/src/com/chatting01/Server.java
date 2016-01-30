package com.chatting01;
import java.net.*;
import java.util.*;
public class Server {
	ServerSocket serv;
	Socket sock;
	Vector vector;
	public Server() {
		vector = new Vector();
		try {
			serv = new ServerSocket(5000);
			while (true) {
				sock = serv.accept();
				ServerThread client = new ServerThread(this, sock);
				client.start();
				vector.addElement(client);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	void sendAll(String msg) {
		for (int i = 0; i < vector.size(); i++) {
			ServerThread client = (ServerThread)vector.get(i);
			client.sendMsg(msg);
		}
	}
	public static void main(String args[]) {
		Server chap = new Server();
	}
}
