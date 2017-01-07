package sri;

import static org.junit.Assert.*;


import org.junit.Test;

public class onlineShoppingTest {

	@Test
	public void testemptyCart()
	{
		onlineShoppingCart onlineShoppingcart = new onlineShoppingCart();
		assertEquals(onlineShoppingcart.getTotalProducts(),0);
		assertEquals(onlineShoppingcart.getTotal(),0.0,0.0);
		
	}
	@Test
	public void testCartApplesOranges() {
		onlineShoppingCart onlineShoppingcart = new onlineShoppingCart();
		onlineShoppingcart.add("apple");
		onlineShoppingcart.add("apple");
		onlineShoppingcart.add("apple");
		onlineShoppingcart.add("apple");
		onlineShoppingcart.add("apple");
		onlineShoppingcart.add("apple");
		onlineShoppingcart.add("apple");

		onlineShoppingcart.add("orange");
		onlineShoppingcart.add("orange");
		onlineShoppingcart.add("orange");
		onlineShoppingcart.add("orange");
		onlineShoppingcart.add("orange");
		onlineShoppingcart.add("orange");
		onlineShoppingcart.add("orange");
		onlineShoppingcart.add("orange");
		assertEquals(onlineShoppingcart.getTotal(), 3.9d, 0);

	}

	@Test
	public void testCartApples() {
		onlineShoppingCart onlineShoppingcart = new onlineShoppingCart();
		onlineShoppingcart.add("apple");
		onlineShoppingcart.add("apple");
		onlineShoppingcart.add("apple");
		onlineShoppingcart.add("apple");
		onlineShoppingcart.add("apple");
		onlineShoppingcart.add("apple");
		onlineShoppingcart.add("apple");
		assertEquals(onlineShoppingcart.getTotal(), 2.4d, 0);

	}
	@Test
	public void testCart3Oranges() {
		onlineShoppingCart onlineShoppingcart = new onlineShoppingCart();
		onlineShoppingcart.add("orange");
		onlineShoppingcart.add("orange");
		onlineShoppingcart.add("orange");
		assertEquals(onlineShoppingcart.getTotal(), 0.50d, 0);

	}

	@Test
	public void testCart1Apple1Orange() {
		onlineShoppingCart onlineShoppingcart = new onlineShoppingCart();
		onlineShoppingcart.add("apple");
		onlineShoppingcart.add("orange");
		assertEquals(onlineShoppingcart.getTotal(), 0.85d, 0);		
		
		

	}
	@Test
	public void testCart2Apples1Orange() {
		onlineShoppingCart onlineShoppingcart = new onlineShoppingCart();
		onlineShoppingcart.add("apple");
		onlineShoppingcart.add("apple");
		onlineShoppingcart.add("orange");
		assertEquals(onlineShoppingcart.getTotal(), 0.85d, 0);

	}
	@Test
	public void testCart2Apples3Orange() {
		onlineShoppingCart onlineShoppingcart = new onlineShoppingCart();
		onlineShoppingcart.add("apple");
		onlineShoppingcart.add("apple");
		onlineShoppingcart.add("orange");
		onlineShoppingcart.add("orange");
		onlineShoppingcart.add("orange");
		assertEquals(onlineShoppingcart.getTotal(), 1.10d, 0);

	}
}
