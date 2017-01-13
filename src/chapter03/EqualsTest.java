package chapter03;

public class EqualsTest {

	public static void main(String[] args) {
		//Poin객체비교
		//(equals,hashCode 오버라이딩이 안된경우)
		Point pt1=new Point(10,20);
		Point pt2=new Point(10,20);
		Point pt3=pt2;
		
		//== 연산자에서 두 개의 항이 객체 참조 변수인 경우에는
		// 두 객체의 동일 여부	
		System.out.println(pt1==pt2);
		System.out.println(pt2==pt3);
		
		//동질성 비교(값)시에는 == 대신에 equals메소드 사용해야한다. 그러나 오버라이딩안하면 같은기능!!!
		System.out.println(pt1.equals(pt2));  //hashCode값이 같은지 비교하게 되어있다.(기본)
		System.out.println(pt2.equals(pt3));  
	
		
		
		//String객체비교
		//(equals,hashCode 오버라이딩이 된 경우)
		
		String s1= new String("hello");
		String s2= new String("hello");
		String s3= s1;
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		
		
		//hashCode()비교
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());//내용으로 hashing을 하게끔 오버라이드 되어있다.
		
		
		//참조값(객체 ID)
		System.out.println(System.identityHashCode(s1));
		
		//객체의 내용을 기반으로 hashCode()를 오버라이드하면
		//참조변수가 가지고 있는 참조값과 다른 값을 가지게 된다.
		
	
		
		/*
		 Literal을 사용할 경우
		JVM안의 리터럴 풀에서 객체 생성을 관리하기 때문에
		문자열의 해싱값이 같은 문자열 객체는 2개 이상 만들지 않는다.
		
		 */
		
		String str1="hello";
		String str2="hello";
		String str3=str1;
		
		
		System.out.println(str1==str2);
		System.out.println(str2==str3);
		 
		
	
	}
			
}
