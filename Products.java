package assignment9;

import java.text.NumberFormat;

public class Products {
	public int productCode;
	public String description;
	public double price;
	public int productCount;

	public Products(int productCode, String description, double price, int productCount) {
		this.productCode = productCode;
		this.description = description;
		this.price = price;
		this.productCount = productCount;
	}
	
	public String getProductDescription() {
		return this.description;
	}
	
	public double getProductPrice() {
		return this.price;
	}
	
	public int getProductQty(){
		return this.productCount;
	}
	
	public void setProductDescription(String description) {
		this.description = description;
	}
	
	public void setProductPrice (double price) {
		this.price = price;
	}
	
	public void setProductQty (int productCount) {
		this.productCount = productCount;
	}
	
	public String getPriceFormatted() {
		String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
		return formattedPrice;
	}
	
}
