/**
 * 
 */
package Recursion_and_External;

import java.io.*;
import java.util.Scanner;

/**
 * @author Adam
 *
 */
public class PrintJavaMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String path = "/Users/Adam/java_courses/1DV506/src";
		File file = new File(path);
		printAllJavaFiles(file);

	}
	
	private static void printAllJavaFiles(File directory) {
		try {
			File[] file = directory.listFiles();
			for (File f : file) {
				if (f.isDirectory()) {
					System.out.println("Directory: " + f.getCanonicalPath());
					printAllJavaFiles(f);
				}

				else {
					int line = 0;
					Scanner scan = new Scanner(f);
					while (scan.hasNextLine()) {
						line++;
						scan.nextLine();
					}

					scan.close();
					System.out.println("File: " + f.getCanonicalPath() + " + Number of lines: " + line);
				}
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
