package com.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

/**
 * Simple program to read a text line by line using java 8
 * @author z92148
 *
 */

public class FileProcessingApp {
	private static Logger logger=Logger.getLogger(FileProcessingApp.class);
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String fileName="config/days.txt";
		  DOMConfigurator.configure("log4j.xml");
		
		beforeJava8Reader(fileName);
		System.out.println();
		
		
		
		fileStreamUsingFiles(fileName);
		
		System.out.println();
		
		
		filterFileData(fileName);
		
		
		System.out.println();
		
		fileReadingUsingBufferedReader(fileName);
		
		// file reading
		//https://www.journaldev.com/709/java-read-file-line-by-line
		
	}


	private static void beforeJava8Reader(String fileName) throws FileNotFoundException, IOException {
		System.out.println("File Reader before java 8 ");
		File file = new File(fileName);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;
		while((line = br.readLine()) != null){
		    //process the line
		    System.out.println(line);
		}
	}


	private static void fileReadingUsingBufferedReader(String fileName) {
		try {
			BufferedReader reader = Files.newBufferedReader(Paths.get(fileName));
			Stream<String> map = reader.lines().map(str->str.toUpperCase());
			logger.debug("Reading all Lines ....");
			System.out.println("Read All lines by using BufferedReader...!");
			map.forEach(System.out::println);
			map.close();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}


	private static void filterFileData(String fileName) {
		try {
			Stream<String> lines = Files.lines(Paths.get(fileName)).filter(line->line.startsWith("S"));
			System.out.println("-- Filtering the file data using java 8 filter ....");
			lines.forEach(System.out::println);
			lines.close();
			
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}

	
	//Method1
	private static void fileStreamUsingFiles(String fileName) {
		try {
			//Path path = Paths.get(fileName);
			Stream<String> lines = Files.lines(Paths.get(fileName));
			System.out.println("Read all lines as a stream --- !");
			lines.forEach(System.out::println);
			lines.close();
			
			
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	
	
}
