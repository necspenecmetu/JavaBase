package com.java.baseframing;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListAndLinkedListDemo {
	/**
	 * ��ʵ�ʿ����У��п������������������ʺ�ɾ�������룩�������
	 * ����ʹ�ø��ӿ�List�����ù��ľ����ʵ��
	 * �ھ��������£������ת������Ӧ�������ͽ���ʹ�ü���
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		//list.addAll(c)
		System.out.println("ArrayList��ʱ��" + CostTime(new ArrayList<>()));
		
		System.out.println("LinkedList��ʱ��" + CostTime(new LinkedList<>()));
	}
	
	public static long CostTime(List<Object> list){
		Object obj = new Object();
		final int N = 150000;
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < N; i++) {
			list.add(obj);			//ÿ���ڼ��ϵ����һ��λ������Ԫ��
			//list.add(0, obj);   	//ÿ���򼯺ϵ�0��λ������Ԫ��
		}
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}

}