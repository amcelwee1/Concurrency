import java.util.Random;

public class Nonthreaded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 1000;
		int min = -1000;
		Random rand = new Random();
		int[] arr = new int[200000000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(max - min + 1)+min;
			}
			
		int sum = 0;
		for (int i = 0; i<arr.length; i++) {
			sum = sum+arr[i];
			}
		System.out.println(sum);

	}

}
