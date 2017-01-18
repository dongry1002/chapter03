package collection;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		Stack<String> stack= new Stack<String>();
		
		stack.push("둘리");
		stack.push("마이콜");
		stack.push("도우너");
		stack.push("희동이");
		
		System.out.println(stack.isEmpty());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());//맨위에 무엇이ㅇㅆ
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
	//	System.out.println(stack.pop());  비어있는경우 예외 발
		
	}

}
