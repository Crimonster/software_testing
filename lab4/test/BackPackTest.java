import static org.junit.Assert.*;

import org.junit.Test;

public class BackPackTest {
	BackPack back;
	@Test
	public void test() {
		int m = 100;
		int n = 5;
		int w[] = {77,22,29,50,99};
		int p[] = {92,22,87,46,90};
		int c[][]= back.BackPack_Solution(m, n, w, p);
		assertEquals(133,c[n-1][m-1]);
	}

}
