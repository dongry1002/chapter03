package chapter03;

public class WrapperClassTest {

	public static void main(String[] args) {
		Integer i = new Integer(10);
		Character c = new Character('a');
		Float f =new Float(3.14);
		Boolean v= new Boolean(true);
		
		//auto boxing
		//자동으로 new Integer(10);
		Integer j=10;
		
		//auto unboxing
		//int k =10+j.intValue();
		int k=10+j;
		
	//	swap(new Integer(10),new Integer(20));
		swap(10,20);

	}

	private static void swap(int i, int j) {
		//이런방식으로는 객체이지만
		//절대바뀌지 않는다.
		//이유는 wrapper 객체는 내부를 수정할수 없다.
		
	}

}
