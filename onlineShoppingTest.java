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

}
