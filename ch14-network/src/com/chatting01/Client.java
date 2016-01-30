package com.chatting01;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
public class Client extends Frame implements Runnable {
	TextField tf;
	TextArea ta;
	Socket sock;
	DataInputStream din;
	DataOutputStream dout;
	public Client() {
		setLayout(new FlowLayout());
		ta = new TextArea(7,30);
		tf = new TextField(30);
		add(tf);
		add(ta);
		tf.addActionListener(new TfHandler());
	}
	public void run() {
		try {
			sock = new Socket("127.0.0.1", 5000);
			din = new DataInputStream(sock.getInputStream());
			dout = new DataOutputStream(sock.getOutputStream());
			ta.append("서버로 접속되었습니다.\n");
			while (true) {
				String str = din.readUTF();
				ta.append(str + "\n");
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	public void sendMsg(String msg) {
		try {
			dout.writeUTF(msg);
		} catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	public class TfHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			sendMsg(tf.getText());
			tf.setText("");
		}
	}
	public static void main(String args[]) {
		Client chap = new Client();
		chap.setSize(300,200);
		chap.setVisible(true);
		Thread t = new Thread(chap);
		t.start();
	}
}
