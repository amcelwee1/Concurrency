import java.util.Random;


public class Concurrency {
	private static int totalSum=0;
	
	//synchronizing the threads with each other
	public static synchronized void incsum(int sum) {
		totalSum = totalSum + sum;
	}

	public static void main(String[] args) {
		//creating a min and max integer to prevent roll-over
		int max = 10;
		int min = 1;
		
		//instantiating 1/4 of 200000000
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				Random rand = new Random();
				int[] arr = new int[50000000];
				for (int i = 0; i < arr.length; i++) {
					arr[i] = rand.nextInt(max - min + 1)+min;
					}	
				
				int tSum = 0;
				for (int i = 0; i<arr.length; i++) {
					tSum = tSum+arr[i];
					}
				System.out.println(tSum);
				incsum(tSum);
			}
			
		});
		
		//instantiating 2/4 of 200000000
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				Random rand = new Random();
				int[] arr = new int[50000000];
				for (int i = 0; i < arr.length; i++) {
					arr[i] = rand.nextInt(max - min + 1)+min;
					}
				
				int tSum = 0;
				for (int i = 0; i<arr.length; i++) {
					tSum = tSum+arr[i];
					}
				System.out.println(tSum);
				incsum(tSum);
			}
			
		});
		
		//instantiating 3/4 of 200000000
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				Random rand = new Random();
				int[] arr = new int[50000000];
				for (int i = 0; i < arr.length; i++) {
					arr[i] = rand.nextInt(max - min + 1)+min;
					}
					
				int tSum = 0;
				for (int i = 0; i<arr.length; i++) {
					tSum = tSum+arr[i];
					}
				System.out.println(tSum);
				incsum(tSum);
			}
			
		});
		
		//instantiating 4/4 of 200000000
		Thread t4 = new Thread(new Runnable() {
			@Override
			public void run() {
				Random rand = new Random();
				int[] arr = new int[50000000];
				for (int i = 0; i < arr.length; i++) {
					arr[i] = rand.nextInt(max - min + 1)+min;
					}
				
				int tSum = 0;
				for (int i = 0; i<arr.length; i++) {
					tSum = tSum+arr[i];
					}
				System.out.println(tSum);
				incsum(tSum);
			}
			
		});
		
		//starting threads
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		//ensuring that the end result of each thread is finished and joined together with other threads before output to console
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Total Sum = " + totalSum);
		
		}
		
		
}
