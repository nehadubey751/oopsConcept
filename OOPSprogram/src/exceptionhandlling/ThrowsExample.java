package exceptionhandlling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {
	public static void main(String args[]) {
		try {
			readFile("example.txt");
		}catch(IOException e) {
			System.out.println("an error occured"+e.getMessage());
		}
	}
	private static void readFile(String filename) throws IOException{
		BufferedReader reader =null;
		try {
			reader =new BufferedReader(new FileReader(filename));
			String line;
			while((line=reader.readLine())!=null) {
				System.out.println(line);
			}
		}finally {
			if(reader!=null) {
				reader.close();
			}
		}
		
		
	}
	
}

