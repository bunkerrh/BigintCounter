package counter;

import java.math.BigInteger;

class Counter {
	BigInteger count = new BigInteger("0");
	BigInteger one = new BigInteger("1");
	BigInteger hsand = new BigInteger("100000000"); //I want to view the output of the counter however I do not need to see every number as this will slow down the program
	//Even checking checking every 100,000 numbers will likely affect performance too much. The number we are trying toget to is 10^22,000,000. After verifying that programs works
	//I will have to bump this number up quit high
	
	BigInteger zero = new BigInteger("0");
	//The threads are syched so that the numbers do not appear out of order
	synchronized void printnumner() {
		while (true) {
			if(count.mod(hsand).equals(zero)){
			System.out.println( count );
			}
			count = count.add(one);

			
			}
		}
	}

	class myThread1 extends Thread{
		Counter c;
		myThread1(Counter c){
		this.c = c;
		}
		public void run(){
			c.printnumner();
		}
	}
	
	class myThread2 extends Thread{
		Counter c;
		myThread2(Counter c){
		this.c = c;
		}
		public void run(){
			c.printnumner();
		}
	}
	
	
	
	



	

