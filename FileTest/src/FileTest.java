

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;


public class FileTest {
	
	public static void main(String[] args) {
		Scanner scanner = null;
		PrintWriter printer = null;
		try {
			File file1 = new File("file1.txt");
			File file2 = new File("file2.txt");
			
			scanner = new Scanner(file1);
			printer = new PrintWriter(file2);
			
			for(int i = 1; i <= 10; i++) {
				printer.print(scanner.nextInt() + 100);
				printer.print(" ");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			scanner.close();
			printer.close();
		}
		
		
		
	}
}
