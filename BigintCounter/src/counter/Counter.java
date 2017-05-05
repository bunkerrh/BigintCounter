package counter;

import java.math.BigInteger;

public class Counter implements Runnable {
	private int b = 0;
	BigInteger count = new BigInteger("0");
	BigInteger one = new BigInteger("1");
	public void run() {
		

		while (true) {

			count = count.add(one);
			System.out.println(count);
			b++;
			
			}
		}
	}


