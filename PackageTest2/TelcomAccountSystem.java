package ���Ź���ϵͳ;

public class TelcomAccountSystem{
	
	public static void main(String[] args){
		//ʵ����һ�������û���TelcomUser
		TelcomUser telcomUser=new TelcomUser("16639167651");
		//����ͨ����¼
		telcomUser.generateCommubicateRecord();
		//��ӡͨ���굥
		telcomUser.printDetails();
	}
}
