package chapter03;

public class StringTest {

	public static void main(String[] args) {
		
		//escape문->출
		String s="i say \"hello\" ";
		System.out.println(s);

		//문자형에서 ' ->출
		char c='\'';
		System.out.println(c);
		
		//c:\dowork
		String s1="c:\\dowork";
		System.out.println(s1);
		
		
		//+연산이 가능하다.
		String s2="Hello"+"JAVA";
		System.out.println(s2);
		System.out.println(s2.charAt(5));
		
		String a1="hello";
		String a2="hello";
		
		String a3=new String("hello");
		String a4=new String("hello");
		
		System.out.println(a1==a2);
		System.out.println(a3==a4);
		System.out.println(a2==a4);
		
		
		
	
	}

}
