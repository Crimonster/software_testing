import static org.junit.Assert.*;

import org.junit.Test;

public class BubbleSortTest {
	BubbleSort bubble;
	@Test
	public void test() {
		int arr[] = new int[]{1,6,2,2,5};
		int ans[] = new int[]{1,2,2,5,6};
		int result[] = bubble.BubbleSort(arr);
		for(int i=0; i<arr.length; ++i) {
			assertEquals(ans[i],result[i]);
		}
	}

}
