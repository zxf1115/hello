package ����ϵͳIO��;

import java.util.Scanner;	

public class Bank {
	int account;
    private static User user;
    
    public static void main(String[] args){
 	   Bank b = new Bank();
 	   b.login();
 	   b.operate();
    }
    //�˻������롢ȡ������ѯ
    public void operate(){
 	   Bank b = new Bank();
 	   while (true){
 		   System.out.println("��������Ҫ���еĲ������ͣ����س�������");
 		   System.out.println("��1" + "\t" + " ȡ� 2" + "\t" + "��3" +"�˳���0");
 		   //ϵͳ����
 		   Scanner in = new Scanner(System .in);
 		   String s = in.nextLine();//����Ĳ�������
 		   if("1".equals(s)||"2".equals(s)){
 			   int num = 0;
 			   try{
 				   System.out.print("�����ȡ�� ");
 				   num = Integer.parseInt(in.nextLine());
 			   }catch(Exception e){
 				   System.out.println("����������");
 				   continue;
 			   }
 			   
 			   switch(s){
 			   case "1"://���
 				   b.income(num);
 				   break;
 			   case"2"://ȡ��
 				   b.takeout(num);
 				   break;
 			   }
 		   }else if ("3".equals(s)){
 			   b.show();
 		   }else if ("0".equals(s)){
 			   System.out.println("�˳�ϵͳ��");
 			   return;
 		   }else{
 			   System.out.println("������0~3֮�������ѡ����ز�����");
 		   }
 	   }
    }
    //�û���¼��������
    public void login(){
 	   DBUtil dbutil = DBUtil.getInstance();
 	   Bank b = new Bank();
 	   System.out.println("------------��ӭ�����������У�--------------");
 	   System.out.println("����������ѡ��  1-ע��      0-�˳�");
 	   Scanner in = new Scanner (System.in);
 	   String s = in.nextLine();
 	   if("1".equals(s)){
 		   b.register();
 		   b.save();
 		   System.out.println("ע��ɹ���");
 	   }
 	   while(true){
 		   System.out.println("���������п��ţ�");
 		   String cardId = in.nextLine();
 		   System.out.println("���������п����룺");
 		   String cardPwd = in.nextLine();
 		   user = dbutil.getUser(cardId);
 		   //Ŀ¼
 		   if(dbutil.getUsers().containsKey(cardId)
 		       &&user.getCardPwd().equals(cardPwd)){
 			   System.out.println("��½�ɹ�����ӭ" + user.getUserName() + "Ůʿ/����");
 			   break;
 		   }else{
 			   System.out.println("���п��Ż��������");
 			   continue;
 		   }
 	   }
    }
    //ע��
    public void register(){
    	User u=new User();
		Scanner scanner=new Scanner(System.in);
		System.out.println("���뿨�ţ�");
		u.setCardId(scanner.nextLine());
		System.out.println("�����û�����");
		u.setUserName(scanner.nextLine());
		System.out.println("�������룺");
		u.setCardPwd(scanner.nextLine());
		System.out.println("�����ֻ��ţ�");
		u.setCall(scanner.nextLine());
		System.out.println("�����");
		u.setAccount(scanner.nextInt());
		DBUtil dbUtil=DBUtil.getInstance();	
		dbUtil.addUser(u);
	}
    public void save(){
    	DBUtil dbUtil=DBUtil.getInstance();
		dbUtil.update();
    }
    //���
    public void income(int num){
   	 account = user.getAccount() + num;
   	 user.setAccount(account);
   	 System.out.println("������" + num + "Ԫ�ɹ���");
    }
    //ȡ��
    public void takeout(int num){
   	 if(user.getAccount() >= num){
   		 account = user.getAccount() - num;
   		 user.setAccount(account);
   		 System.out.println("ȡ�����" + num + "Ԫ�ɹ���");
   	 }else{
   		 System.out.println("���㣬ȡ��ʧ��");
   	 }
    }
    //��ѯ���
    public void show(){
   	 account = user.getAccount();
		System.out.println("�˻������Ϊ" + account + "Ԫ");
    }
    
}
