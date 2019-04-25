package com.java.basepractice.queen;

import java.util.Date;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		/** Ұ����Ů���������� */
		String[] newNameArray = { "���", "��ԲԲ", "��СС", "���", "������" };
		int newNameCount = newNameArray.length;// ��ѡ��Ů������
		/** ��������������� Ԥ����5���ռ� */
		String[] nnNameArray = { "��ʩ", "����", "���Ѿ�", "����", "�Է���", "", "", "", "", "" };
		/** �������� */
		String[] levelNames = { "����", "����", "����", "�ʹ���", "�ʺ�" };
		/** ��Ӧÿ������ļ��� */
		int[] level = new int[10];
		/** ��Ӧÿ������ĺøж� */
		int[] loves = new int[10];
		/** ����ĳ�ʼ����Ϊ5 */
		int nnCount = 5;
		int gameDays = 1; // ��ϷĬ������10��

		// �趨Ĭ�Ϻøж�Ϊ100
		for (int i = 0; i < nnCount; i++) {
			loves[i] = 100;
		}
		loves[1] = 60;
		loves[2] = 60;
		loves[3] = 60;
		// ��Ϸ��������
		JOptionPane.showMessageDialog(null, "���£�������", "��ӭ����XXX��ѡ����Ϸ", 1, new ImageIcon("images/title.jpg"));
		while (gameDays <= 10) {
			// System.out.println("��Ϸ���е���" + gameDays + "��");
			// System.out.println("1���ʵ���ּѡ��\t\t(����)");
			// System.out.println("2�����Ƴ���\t\t(�޸�״̬)");
			// System.out.println("3�������乬\t\t(ɾ��)");
			// System.out.println("4���޵İ�����?\t\t(���ҡ��޸�״̬)");
			// System.out.println("������ѡ��");
			// int choice = input.nextInt();
			String strMenu = "1���ʵ���ּѡ��\n";
			strMenu += "2�����Ƴ���\n";
			strMenu += "3�������乬\n";
			strMenu += "4���޵İ�����?\n";
			strMenu += "������ѡ��";
			Object objResult = JOptionPane.showInputDialog(null, strMenu, "��Ϸ���е���" + gameDays + "��", 0,
					new ImageIcon("images/����.jpg"), new String[] { "1", "2", "3", "4" }, 1);
					// Ҫ�ж��û�ѡ��ȡ������� - Ŀǰʡ��

			// ���û���ѡ��1-4֮����ַ�����ת��������
			// int choice = Integer.parseInt(objresult.toString());

			switch (objResult.toString()) {
			case "1":// �ʵ���ּѡ��\t\t(����)
				if (nnCount == nnNameArray.length) {
					System.out.println("�ʵ۱��£����Ѿ�����Ϊ�����ʵۼ�Ҳû�����¸��ˡ�������ʧ��");
					break;
				}
				// System.out.print("�������½���������䣺");
				// String newName = input.next();
				objResult = JOptionPane.showInputDialog(null, "��ѡ����Ů", "ѡ��", 0, new ImageIcon("images/timg.jpg"),
						newNameArray, null);
				if (objResult == null) {// �û�ѡ����ȡ��
					continue;
				}
				JOptionPane.showMessageDialog(null, objResult.toString(), "ѡ�е�����", 0,
						new ImageIcon("images/" + objResult.toString() + ".jpg"));
				// ���ӣ��������顢�øж����顢��������
				nnNameArray[nnCount] = objResult.toString();
				loves[nnCount] = 100;
				// ��������ĺøж�-10
				for (int i = 0; i < nnCount; i++) {
					loves[i] -= 10;
				}
				nnCount++;
				break;

			case "2":// ���Ƴ���\t\t(�޸�״̬)
						// System.out.println("��������������䣺");
						// String name = input.next();
				objResult = JOptionPane.showInputDialog(null, "������ѡ��", "����", 0, new ImageIcon("images/ѡ������.jpg"),
						nnNameArray, null);
				if (objResult == null) {
					continue;
				}
				String name = objResult.toString();
				// ����
				int searchIndex = Integer.MIN_VALUE;
				for (int i = 0; i < nnCount; i++) {
					if (name.compareTo(nnNameArray[i]) == 0) {// ������ȵ����
						searchIndex = i;
						break;
					}
				}
				if (searchIndex == Integer.MIN_VALUE) {
					System.out.println("���£���Ҫ�������У�Ҫ�����ʵ");
					break;
				}
				// �ҵ����������ǰ�ĺøж�+20����һ���������˺øж�-10
				loves[searchIndex] += 20;
				if (level[searchIndex] + 1 == levelNames.length) {
					System.out.println(nnNameArray[searchIndex] + "�����Ѿ�ĸ������");
					loves[searchIndex] += 10;
					// break;
				} else {

					level[searchIndex]++;

					for (int i = 0; i < nnCount; i++) {
						if (i == searchIndex) {
							continue;
						}
						loves[i] -= 10;
					}
					// System.out.println("����" + nnNameArray[searchIndex] +
					// ",�øж�+10������Ϊ" + levelNames[level[searchIndex]]);
					JOptionPane.showMessageDialog(null,
							"����" + nnNameArray[searchIndex] + ",�øж�+10������Ϊ" + levelNames[level[searchIndex]], "���ƵĽ��",
							0, new ImageIcon("images/" + objResult.toString() + ".jpg"));
				}
				break;
			case "3":

				break;
			case "4":

				break;

			default:
				System.out.println("��������1-4֮���������");
				continue;
			}
			// System.out.println("����\t����\t�øж�");
			// for (int i = 0; i < nnCount; i++) {
			// System.out.println(nnNameArray[i] + "\t" + levelNames[level[i]] +
			// "\t" + loves[i]);
			// }

			// �����3�����ϵ����Ӻøжȶ�����60����ô�������ң���Ϸǿ���˳�
			int count = 0;
			for (int i = 0; i < nnCount; i++) {
				if (loves[i] < 60) {
					count++;
				}
			}
			String reslutValue = "����3�����ϵ�����øжȵ���60���������ң�\n";
			reslutValue += new Date().toLocaleString();
			if (count >= 3) {
				JOptionPane.showMessageDialog(null, reslutValue, "ͻ���¼�����������", 0, new ImageIcon("images/���ϱ���.jpg"));
			}

			// ÿ�ս���
			String value = "û��û���������ֹ���һ�죬�󹬵�������£�\n";
			for (int i = 0; i < nnCount; i++) {
				value += String.format("%s  %s   %d\n", nnNameArray[i], levelNames[level[i]], loves[i]);
			}
			JOptionPane.showMessageDialog(null, value, "ÿ�ս���", 0, new ImageIcon("images/��Ϸ.jpg"));
			gameDays++;
		}

	}

}