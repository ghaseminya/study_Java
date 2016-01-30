package com.chatting01;
import java.net.*;
import java.io.*;
public class ServerThread extends Thread {
	Server server;
	Socket sock;
	DataInputStream din;
	DataOutputStream dout;
	String ipAddr;
	public ServerThread(Server server, Socket socket) {
		try {
			this.server = server;
			sock = socket;
			din = new DataInputStream(sock.getInputStream());
			dout = new DataOutputStream(sock.getOutputStream());
			ipAddr = sock.getInetAddress().toString();
			System.out.println(ipAddr + "에서 접속하였습니다.");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	public void sendMsg(String msg) {
		try {
			dout.writeUTF(msg);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	public void run() {
		String str;
		try {
			while (true) {
				str = din.readUTF();
				server.sendAll(str);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
