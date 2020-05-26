package java_20200526;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputOutputStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try {
			/*
			// 1. FileInputStream과 FileOutputStream을 이용하여
			// 1 바이트 읽어서 1 바이트 출력하는 예제.
			fis = new FileInputStream("c://dev//jdk-11.0.7_window-x64_bin.exe");
			fos = new FileOutputStream("c://dev//jdk3.exe");

			int readByte = 0;
			long start = System.currentTimeMillis();
			while ((readByte = fis.read()) != -1) {
				fos.write(readByte);
			}
			long end = System.currentTimeMillis();

			System.out.printf("경과시간 %d %n", end - start);
			*/
			
			//2. FileIn
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
