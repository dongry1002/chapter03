package chapter03;

public class SBTest {

	public static void main(String[] args) {
		
		//생성
		StringBuffer sb=new StringBuffer("This");
		
		//문자열 덧 붙이기
		sb.append( " is pencil");
		
		//문자열 삽입
		sb.insert(7, " my");
		System.out.println(sb);
		
		//치환	
		sb.replace(8, 10, "yours");
		System.out.println(sb);
		
		//버퍼크기조정
		sb.setLength(5);
		System.out.println(sb);

		
		//더 중요한 것은 문자열 + 연산은
		//내부적으STringBuffer 객체로 변환된다.
		String s1="Hello"+"World"+10+true;
		String s2="Hello"+"World"+new Integer(10)+new Boolean(true);
		String s3=new StringBuffer("Hello").append("World").append(10).append(true).toString();
		
		System.out.println(s1);
		System.out.println(s3);
	
	
	}

}
