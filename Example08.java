package Example08;

public class Example08 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("������");
         System.out.println("1,���ѧ�ţ����֤��");
         add();
         System.out.println("2,ɾ�����֤��");
         remove();
         System.out.println("3,�޸�ѧ��");
         alter();
	}

public static void add(){
	StringBuffer sb=new StringBuffer();
	sb.append("184805040 ");
	System.out.println("append���ѧ�� "+sb);
	sb.insert(10,"410225");
	System.out.println("insert������֤�� "+sb);
}
public static void remove(){
	StringBuffer sb=new StringBuffer("184805040 410225");
	sb.delete(10,16);
	System.out.println("ɾ�����֤��: "+sb);
	sb.delete(0,sb.length());
	System.out.println("������������: "+sb);
}
public static void alter(){
	StringBuffer sb=new StringBuffer("184805040");
	sb.setCharAt(1,'9');
	System.out.println("�޸�ָ��λ���ַ����: "+sb);
	sb.replace(1,3,"410");
	System.out.println("�滻ָ��λ�ý��: "+sb);
	//System.out.println("�ַ�����ת���: "+sb);
}
}
