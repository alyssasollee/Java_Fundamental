package java_20200522;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		//ctrl + shift + o(영문자)
		//HashSet 객체의 중복을 허용하지 않고, 순서 없음.
		
		//1. 선언 및 생성
		HashSet<Integer> set = new HashSet<Integer>();
		
		//2. 할당
		set.add(1); //auto boxing(primitive를 자동 ref로 바꿔줌.)
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(9);
		set.add(8);
		set.add(4);
		set.add(1);
	
		System.out.println(set.size());
		System.out.println("========================");
		
		//3. 출력
		Iterator<Integer> i = set.iterator();
		while(i.hasNext()) {
			Integer number = i.next();
			System.out.println(number);
		}
		
		HashSet<Customer> set1 = new HashSet<Customer>();
		set1.add(new Customer("이솔1"));
		set1.add(new Customer("이솔2"));
		set1.add(new Customer("이솔3"));
		set1.add(new Customer("이솔1"));
		
		System.out.println("size : "+ set1.size());
		//*4개 ; 오버라이팅을 안해서 object에서 보기에는 다른거 
		//*3개 ; customer class에 오버라이드 해줘서 
		
		
		//로또 복권 - HashSet
		
		//TreeSet = 객체의 중복허용하지 않음, 오름차순 정렬해줌.
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		while(true) {
			int random = (int)(Math.random() * 45 ) + 1;
			lotto.add(random);
			if(lotto.size() == 6) break;
		}
		
		Iterator<Integer> iter = lotto.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+ "\t"
					);
		}
	}
}
