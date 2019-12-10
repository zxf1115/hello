package ģ�����д�ȡ��ϵͳ;
import java.util.*;
public class DBUtil {
	private static DBUtil instance = null;
	private HashMap<String,User>users= new HashMap<String,User>();
	
	private DBUtil(){
		User u1 = new User();
		u1.setCardId("1001");
		u1.setCardPwd("123456");
		u1.setUserName("����");
		u1.setCall("13281525712");
		u1.setAccount(0);
		users.put(u1.getCardId(), u1);
		User u2 = new User();
		u2.setCardId("1002");
		u2.setCardPwd("234567");
		u2.setUserName("����");
		u2.setCall("13181527253");
		u2.setAccount(1000);
		users.put(u2.getCardId(), u2);
		User u3 = new User();
		u3.setCardId("1003");
		u3.setCardPwd("345678");
		u3.setUserName("�ŷ�");
		u3.setCall("13041018869");
		u3.setAccount(1000);
		users.put(u3.getCardId(), u3);
	}	
	//����ʽ����ģʽ
	public static DBUtil getInstance(){
		if (instance ==null){
			synchronized (DBUtil.class){
				if (instance ==null){
			instance = new DBUtil();
				}
		}
	}

	   return instance;
	 }  
	//�������п��Ż�ȡ��Ӧ�����ʻ�����Ϣ
	  public User getUser(String cardId){
		  User user = (User)users.get(cardId);
		  return user;
	  }
	  //��ȡ�����ʻ���Ϣ
	  public HashMap<String,User> getUsers(){
		  
		  return users;		  
	  }
}
