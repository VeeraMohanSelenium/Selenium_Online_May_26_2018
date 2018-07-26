package ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int a = 20;
		int b = 0;
		// Checked Exception
		Thread.sleep(2000);

		File f = new File("");
		// unchecked exception
		try {
			int c = a / b;
			System.out.println(c);
			FileInputStream fis = new FileInputStream(f);

		} catch (IndexOutOfBoundsException e) {
			System.out.println("World");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");

		} catch (FileNotFoundException e) {
			System.out.println("Hello");

		} catch (Throwable e) {
			System.out.println(e);

		}

		System.out.println();
		try {

			FileInputStream fis = new FileInputStream(f);

		} catch (IndexOutOfBoundsException e) {
			System.out.println("World");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");

		} catch (FileNotFoundException e) {
			System.out.println(e);

		} catch (Exception e) {
			System.out.println(e);

		}

		// System.out.println("Hello");

		// System.out.println("Hyderabd");
		// try
		// {
		// System.out.println("INdia");
		// System.out.println(10/0);
		// System.out.println("Hello");
		// }
		// catch(Exception e)
		// {
		// System.out.println("World");
		// }
		//
		//
		// System.out.println("Testing");

	}

}
