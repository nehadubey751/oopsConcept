package exceptionhandlling;

import java.io.IOException;
import java.nio.file.ReadOnlyFileSystemException;

public class CheckedExceptionExample {
	public static void main(String args[]) {
		int number=10;
		int number1=0;
		try {
			int result =divide(number,number1);
			System.out.println("result"+result);
		}catch(ArithmeticException e){
			System.out.println("an error occour:"+e.getMessage());
		}
		}
   private static int divide(int number, int number1) {
		return number / number1;
	}
}