package chap11_1.exam11;

import java.io.IOException; //�̰� ������ IOException�� �۵��� �ȵǳ�;;.. ���� �����ΰ�?

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		byte[] bytes = new byte[100];
		
		System.out.print("�Է�: ");
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes, 0, readByteNo - 2);
		System.out.println(str);
		
		
	}

}
