package chap13_2.exam02;

import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Message> messageQueue = new LinkedList<>();
		
		messageQueue.offer(new Message("sendMail", "ȫ�浿"));
		messageQueue.offer(new Message("sendSMS", "�ſ��"));
		messageQueue.offer(new Message("sendKakaoTalk", "ȫ�β�"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to + "�Կ��� ������ �����ϴ�.");
				break;
			case "sendSMS":
				System.out.println(message.to + "�Կ��� SMS�� �����ϴ�.");
				break;
			case "sendKakaoTalk":
				System.out.println(message.to + "�Կ��� īī������ �����ϴ�.");
				break;
			}
		}
	}

}
