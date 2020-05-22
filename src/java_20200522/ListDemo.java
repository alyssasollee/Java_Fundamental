package java_20200522;

import java.util.ArrayList;

public class ListDemo {
	public static void main(String[] args) {
		//ArrayList : 순서가 있고, 객체의 중복을 허용한다.
		ArrayList<Integer> list = new ArrayList<Integer>() ;
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		for(int i=0;i<list.size();i++) {
			Integer i1 = list.get(i);
			System.out.println(i1);
		}
		
		//list 모두 삭제 => remove(int index)
		
		for(int i=0;i<list.size();) {
			list.remove(i);
		// size()i++이고, remove(i)이면2,4 값이 남음 / remove(0)이면 3,4 남음
		
		}
		
		for(int i=0;i<list.size();i++) {
			Integer i1 = list.get(i);
			System.out.println(i1);
		}
		
		for(Integer value : list) {
			System.out.println(value);
		}
		
		int[] temp = {1,2,3,4};
		
		//enhance for loop는 배열을 출력할 대 사용가능.
		for(int v : temp) {
			System.out.println(v);
		}
		
	}
}
