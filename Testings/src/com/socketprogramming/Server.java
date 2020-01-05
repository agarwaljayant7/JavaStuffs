package com.socketprogramming;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		ServerSocket ss=new ServerSocket(9990);
		Socket s=ss.accept();
		FileInputStream fis=new FileInputStream("/Users/jayantagarwal/Desktop/Book1.xlsx");
		byte[] b=new byte[10000];
		fis.read(b, 0, b.length);
		
		OutputStream os=s.getOutputStream();
		os.write(b, 0, b.length);
		os.close();
		fis.close();
		s.close();
		ss.close();
	}

}
