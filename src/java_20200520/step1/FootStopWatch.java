package java_20200520.step1;

public class FootStopWatch {

	public static void main(String[] args) {
	
		//1970년 1월 1일 부터 지금까지 시간을 밀리 세컨드로 반환.
		long startTime = System.currentTimeMillis();
				
		for(long i=0;i<20000_000_000l;i++) {
			
		}
	
		long endTime = System.currentTimeMillis();
		
		double elapsedTime = (double)(endTime - startTime) / 1000;
				
		System.out.printf("경과시간 : %.3f", elapsedTime);
		//소수점이하3자리까지 표시 "%.3f"
	
	}
	
}
