package Junits;

import java.util.HashMap;

import org.junit.Test;

import Hashmap.Flip;

import static org.junit.Assert.*;

public class testflip {
	public static HashMap<Integer,Flip> hn=new HashMap<>();
	
	Object productMap;
	
	@Test
	public void test() {
		Flip f= new Flip(10, "Kurtis", 18000, "Dior", 1);
		 
		hn.put(f.product_id, f);
		FlipFunct ff=new FlipFunct();
		assertEquals(ff.product_id,hn);
		assertTrue(hn.equals(productMap));
		
		
	}

}
