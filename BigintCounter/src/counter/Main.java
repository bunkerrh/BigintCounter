package counter;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Runnable test = new Counter();
		
		Runnable test2 = new Counter();
		
		Thread thread1 = new Thread(test);
		Thread thread2 = new Thread(test);
		Thread thread3 = new Thread(test);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		
		System.out.println("Hello World");
		//OK lets see what we can get away with 
		
		//TODO: I completely forget what it was i had planned to do.
}
}