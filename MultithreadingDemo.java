import java.util.ArrayList;

public class MultithreadingDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Let's learn about threads in Java!");
		ArrayList<ArrayList<Integer>> resultTotal = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			
			ArrayList<Integer> result = new ArrayList<Integer>();
			resultTotal.add(result);
			
			Thread t1 = new Thread(() ->  {
				int count = 0;
				while(count < 100000) {
					count++;
				}
				result.add(1);
			});
			t1.setPriority(10);
			
			Thread t2 = new Thread(() ->  {
				int count = 0;
				while(count < 100000) {
					count++;
				}
				result.add(2);
			});
			t2.setPriority(10);
			
			Thread t3 = new Thread(() ->  {
				int count = 0;
				while(count < 100000) {
					count++;
				}
				result.add(3);
			});
			t3.setPriority(10);
			
			Thread t4 = new Thread(() ->  {
				int count = 0;
				while(count < 100000) {
					count++;
				}
				result.add(4);
			});
			t4.setPriority(1);
			
			t1.start();
			t2.start();
			t3.start();
			t4.start();
		}
		
		Thread.sleep(20000);
		
		System.out.println(resultTotal);

	}

}
