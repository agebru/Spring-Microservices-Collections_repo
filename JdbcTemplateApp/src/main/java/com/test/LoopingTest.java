package com.test;

import java.io.File;

public class LoopingTest {

	public static void main(String[] args) {
		drawTriangle();
		
		System.out.println();
		demoWhileLoop();
		
		// changing file permissions
		
		File file=new File("src\\main\\java\\com\\test\\sample.txt");
		if(file.exists()) {
			System.out.println(file.getName());
			
			// change file permission
			file.setReadable(false);
			file.setWritable(false);
			
			// set permission for other users also
			file.setReadable(true, false);
	        file.setWritable(true, false);
	        file.setExecutable(true, true);
		}

	}

	private static void demoWhileLoop() {
		int count=0;
		
		while(true) {
			count++;
			System.out.println("True! "+count);
			if(count>=10)
				break;
			
		}
	}

	private static void drawTriangle() {
		for(int i=1;i<=7;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
