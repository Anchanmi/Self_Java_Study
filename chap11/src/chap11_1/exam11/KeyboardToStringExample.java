package chap11_1.exam11;

import java.io.IOException; //이게 없으면 IOException이 작동이 안되네;;.. 버전 문제인가?

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		byte[] bytes = new byte[100];
		
		System.out.print("입력: ");
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes, 0, readByteNo - 2);
		System.out.println(str);
		
		
	}

}
