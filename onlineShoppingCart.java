package sri;

import java.util.ArrayList;
import java.util.List;

public class onlineShoppingCart {
	//variable to calculate the number of apples to be billed
	double totalApplesBilled = 0;
	//variable to calculate the number of oranges to be billed
	double totalOrangesBilled = 0;
	//list of all the products
	List<String> products;

	public onlineShoppingCart() {

		//empty arrayList of products 
		products = new ArrayList<String>();

	}
       // method to add products
	public void add(String product) {
		products.add(product);
	}
      // to get the number of products
	public int getTotalProducts() {
		return products.size();
	}

	//get the total amount to be paid
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
		//if the totalOrangesbilled are more than 1 then use this code
		//special offer for orange buy 3 get 1 free
		if (totalOrangesBilled > 1) {
			if (totalOrangesBilled % 3 == 0) {
				
				totalOrangesBilled = (totalOrangesBilled/3)*2;
						
			}
			else if(totalOrangesBilled % 3 == 1) {
					totalOrangesBilled = (((totalOrangesBilled-1)/3)*2)+1;
				}
			else if(totalOrangesBilled % 3 == 2) {
				totalOrangesBilled = (((totalOrangesBilled-2)/3)*2)+2;
			}
		}
		//if totalOrangesBilled <=1 use this code
		total = total + ((totalOrangesBilled) * 0.25);

		//special offer for Apples 
		if (totalApplesBilled % 2 == 0) {

			totalApplesBilled = totalApplesBilled*0.5;
			total = total + (totalApplesBilled *0.60);
		} else {
			totalApplesBilled = (totalApplesBilled-1) * 0.5;
			total = total + (totalApplesBilled*0.60)+0.60;
		}

		
		return total;
	}

	public static void main(String s[]) {
		onlineShoppingCart onlineShoppingcart = new onlineShoppingCart();
		onlineShoppingcart.add("apple");		
		onlineShoppingcart.add("orange");
		
		double totalBill = 0;
		totalBill = onlineShoppingcart.getTotal();
		System.out.println("Total Products :"+onlineShoppingcart.getTotalProducts());
		System.out.println(onlineShoppingcart.products);
		System.out.println(totalBill);
	}
}