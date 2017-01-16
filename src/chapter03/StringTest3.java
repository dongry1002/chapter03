package chapter03;

public class StringTest3 {

	public static void main(String[] args) {
		
		String s="aBcAbCabcABC";
		
		//charAT
		System.out.println(s.charAt(2));
		
		//indexOf(문자열검)
		System.out.println(s.indexOf("abc"));
		System.out.println(s.indexOf("xyz")); //없으면 -1출력
		
		//length()
		System.out.println(s.length());
		
		//replace (치환)
		System.out.println(s.replace('a','R'));
		System.out.println(s);
		
		//replaceAll(치환)
		System.out.println(s.replaceAll("abc","123" ));
		
		//substring(몇개만 출력하기 주의!!)
		System.out.println(s.substring(0, 3));
		
		//toLowerCase()
		System.out.println(s.toLowerCase());
		
		String str1=" abcd";
		String str2=",efg ";
		
		//concat: 문자열
		str1=str1.concat(str2);
		System.out.println(str1);
		
		//trim:공백제거 단, 얖 뒤에 공백만 제거
		System.out.println(str1);
		System.out.println("-"+str1.trim()+"-");
		
		//split 문자열분리
		String[] result=str1.split(",");
		for(String str : result){
			System.out.println(str);
		}
		//split 예외
		
		
	}

}
