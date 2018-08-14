package testNGpackage;

import org.testng.annotations.Test;

public class TestNGPriority {

	@Test(priority=1)
	public void Abc() {
		char c = 'A';
		System.out.println("1");
		int asci = (int) c;
		System.out.println(asci);

		System.out.println("Abc");
	}

	@Test(priority=5)
	public void xyz() {
		char c = 'x';
		System.out.println("5");
		int asci = (int) c;
		System.out.println(asci);
		System.out.println("xyz");
	}

	@Test(priority=5)
	public void ABC() {
		char c = 'A';
		System.out.println("4");
		int asci = (int) c;
		System.out.println(asci);
		c = 'a';
		asci = (int) c;
		System.out.println(asci);
		c = 'Z';

		asci = (int) c;
		System.out.println(asci);
		System.out.println("ABC");
	}

	@Test(priority=-3)
	public void bcd() {
		char c = 'b';
		System.out.println("-3");
		int asci = (int) c;
		System.out.println(asci);
		System.out.println("bcd");
	}

	@Test(priority=2)
	public void zya() {
		char c = 'z';
		System.out.println("2");
		int asci = (int) c;
		System.out.println(asci);
		System.out.println("zya");
	}

}
