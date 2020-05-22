package java_20200520.step1;
//나노 세컨드로 경과시간을 알려주는 애플리케이션 만들어주세요.
public class FootNanoStopWatch {
	long startTime;
	long endTime;
	
	long startNanoTime;
	long endNanoTime;
	
	public double getElapsedTime() {
		return (double)(endTime - startTime) / 1000;
	}
	public double getElapsedNanoTime() {
		return (double)(startNanoTime - endNanoTime) / 1000;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
