package counter;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Counter test1 = new Counter();
		
		myThread1 t1 = new myThread1(test1);
		myThread2 t2 = new myThread2(test1);
		
		t1.start();
		t2.start();
		
		
		
		
		/*This is a very barebones counter. The idea is to count to a very very large number as large as possible Think 10^22,000,000
		 * 
		 */
		
	
}
}