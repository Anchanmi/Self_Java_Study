package chap13_1.Prac09;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			Integer value = map.get(key);
			
			if(value > maxScore) {
				maxScore = value;
				name = key;
			}
			
			totalScore += value;
		}
		
		System.out.println("��� ����: " + (totalScore / map.size()));
		System.out.println("�ְ� ����: " + maxScore);
		System.out.println("�ְ� ������ ���� ���̵�: " + name);
		
	}

}
