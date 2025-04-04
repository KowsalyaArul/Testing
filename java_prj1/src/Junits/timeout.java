package Junits;

import org.junit.Test;

public class timeout {
	@Test(timeout=1600)
	public void testTimeout() throws InterruptedException {
		Thread.sleep(1500);
	}

}
