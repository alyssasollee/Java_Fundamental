package java_20200515;

public class ArrayCopyDemo2 {
	public static void main(String[] args) {
		String[] fruits = {"apple", "banana", "watermelon", "blueberry"};
		
		String[] temp = new String[6];
		
		temp[4] = "peach";
		temp[5] = "pear";
		
		System.arraycopy(fruits,0,temp,0,4);
	
		for(String value : temp) {
			System.out.println(value);

		
		}
		
	}
	

}
