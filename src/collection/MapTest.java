package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class MapTest {

	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		
		map.put("둘리", new Integer(100));
		map.put("마이콜", 60);	//auto boxing new Integer
		map.put("도우넛", 90);
		map.put("도우너", 100);//값이 새로 세팅된다.
		Integer score1 = map.get("마이콜");
		System.out.println(score1);
		
		Integer score2=map.get("도우넛");
		System.out.println(score2);
		
		
		//평균
		Set<String> keySet= map.keySet();
		int count = keySet.size();//총개
		
		int sum=0;
		Iterator<String>it=keySet.iterator();
		while(it.hasNext()){
			String key=it.next();
		//	System.out.println(key);
			int score=map.get(key);
			System.out.println(key+":"+score);
			
			sum += score;
			
			System.out.println("평균:"+(sum/count));
		}
	}

}
