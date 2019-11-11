package Example08;

public class Example08 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("赵晓飞");
         System.out.println("1,添加学号，身份证号");
         add();
         System.out.println("2,删除身份证号");
         remove();
         System.out.println("3,修改学号");
         alter();
	}

public static void add(){
	StringBuffer sb=new StringBuffer();
	sb.append("184805040 ");
	System.out.println("append添加学号 "+sb);
	sb.insert(10,"410225");
	System.out.println("insert添加身份证号 "+sb);
}
public static void remove(){
	StringBuffer sb=new StringBuffer("184805040 410225");
	sb.delete(10,16);
	System.out.println("删除身份证号: "+sb);
	sb.delete(0,sb.length());
	System.out.println("清除缓冲区结果: "+sb);
}
public static void alter(){
	StringBuffer sb=new StringBuffer("184805040");
	sb.setCharAt(1,'9');
	System.out.println("修改指定位置字符结果: "+sb);
	sb.replace(1,3,"410");
	System.out.println("替换指定位置结果: "+sb);
	//System.out.println("字符串翻转结果: "+sb);
}
}
