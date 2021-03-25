package co.tyss.wrapperClass.test;

public class Test {
public static void main(String[] args) {
	int x= 10;
	@SuppressWarnings("deprecation")
	Integer integer = new Integer(x);
	System.out.println(integer.toString());
}
}
