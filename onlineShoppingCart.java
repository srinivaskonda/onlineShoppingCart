package sri;

import java.util.List;

public class onlineShoppingCart {
	//variable to calculate the number of apples to be billed
		double totalApplesBilled = 0;
		//variable to calculate the number of oranges to be billed
		double totalOrangesBilled = 0;
		//list of all the products
		List<String> products;
	 // to get the number of products
		public int getTotalProducts() {
			return products.size();
		}
		public double getTotal() {
			
		double total = 0;	

		int i = 0;
		
		// loop through the products 
		for (i = 0; i < products.size(); i++) {

			// if the product is 'apple' 		     
			if (products.get(i).equals("apple")) {
 
				//increment totalApplesBilled;
				totalApplesBilled += 1;
			}

			if (products.get(i).equals("orange")) {
                
				//increment totalOrangesBilled;
				totalOrangesBilled += 1;
			}

		
		

		
		
		
}
		return total;
}
}