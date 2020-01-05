package com.socketprogramming;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s=new Socket("localhost",9990);
		InputStream is=s.getInputStream();
		FileOutputStream fos=new FileOutputStream("/Users/jayantagarwal/Desktop/Jayant.xlsx");
		
		byte[] b=new byte[10000];
		is.read(b, 0, b.length);
		fos.write(b, 0, b.length);
		fos.close();is.close();s.close();
		
	}

}
