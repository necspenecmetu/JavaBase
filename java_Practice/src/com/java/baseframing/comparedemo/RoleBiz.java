package com.java.baseframing.comparedemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
/**
 * ��ɫҵ����
 * @author Administrator
 *
 */
public class RoleBiz {
	List<Role> roleList = null;
	
	public RoleBiz(){
		roleList = new ArrayList<>();
	}
	
	public void add(Role role){
		if(role != null){
			roleList.add(role);
		}
	}
	
	public void delete(Role role){
		roleList.remove(role);
	}
	
	/**
	 * ������Ľ�ɫ�����ڼ����н����޸�
	 * @param role
	 */
	public void update(Role role){
		//1���ڼ������ҵ�����
		//2���޸Ķ���
		int index = roleList.indexOf(role);
		if(index != -1){
			roleList.set(index, role);
		}
	}
	
	public void sort(){
		//ʹ�����õĹ������������--ǰ�ᣬ����ʵ�ֱȽ����ӿ�
		//1��ʵ����ʵ��compareble�ӿ�
//		Collections.sort(roleList);
//		Collections.reverse(roleList);//����
		//2���Զ���һ���Ƚ����ӿڶ���
//		Collections.sort(roleList, new Rolecomparator_Attack());
		//���ڱȽ���RoleComparator_Attack������
		Collections.sort(roleList, Collections.reverseOrder(new Rolecomparator_Attack()));
		//����
//		Collections.shuffle(roleList);
	}
	
	public void show(){
		System.out.println("��ɫ\t�ƺ�\t\t��Ѫ\t������");
		System.out.println("--------------------------------------");
		Iterator<Role> roleIt = roleList.iterator();
		while(roleIt.hasNext()){
			Role role = roleIt.next();
			System.out.println(role.getName() + "\t" + role.getTitle() + "\t" + role.getHp() + "\t" + role.getAttack());
		}
		
	}
}

/**
 * ��ɫ���й������ıȽ���
 * @author Administrator
 *
 */
class Rolecomparator_Attack implements Comparator<Role>{

	@Override
	public int compare(Role role1, Role role2) {
		if(role1.getAttack() > role2.getAttack()) return 1;
		if(role1.getAttack() < role2.getAttack()) return -1;
		return 0;
	}
	
}
