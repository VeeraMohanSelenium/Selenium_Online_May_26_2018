package Interface;

import AccessSpecfiers.ClassA;

public class Nokia extends ClassA{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile sam = new Samsung();
		sam.camera();
		sam.display();
		sam.flash();
		sam.mp3();

		System.out.println();
		System.out.println();
		//Parent Class object
		ClassA c=new ClassA();
		//c.
		
		//Childclass Object
		Nokia a=new Nokia();
			
		a.m1();
		a.m3();
		
		
		Mobile moto = new Motrola();

		moto.camera();
		moto.display();
		moto.flash();
		moto.mp3();

	}

}
