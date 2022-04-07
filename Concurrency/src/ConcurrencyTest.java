import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ConcurrencyTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	private static int totalSum=0;
	@Test
	final void testIncsum() {
		totalSum = totalSum + 6;
		System.out.println(totalSum);
		assertEquals(6, totalSum);
	}

	@Test
	final void testMain() {
				//Random rand = new Random();
				int[] arr = new int[] {1,2,3};
				//for (int i = 0; i < arr.length; i++) {
				//	arr[i] = rand.nextInt();
					System.out.println(arr[0]);
					System.out.println(arr[1]);
					System.out.println(arr[2]);
				//	}	
				
				int tSum = 0;
				for (int i = 0; i<arr.length; i++) {
					tSum = tSum+arr[i];
					}
				assertEquals(6, tSum);
				System.out.println(tSum);
			}
		
	}

