package assignment9;

import java.text.NumberFormat;

public class Products {
	private int productCode;
	private String description;
	private double price;
	private int productCount;

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

	public int getProductQty() {
		return this.productCount;
	}

	public void setProductDescription(String description) {
		this.description = description;
	}

	public void setProductPrice(double price) {
		this.price = price;
	}

	public void setProductQty(int productCount) {
		this.productCount = productCount;
	}

	public String getPriceFormatted() {
		String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
		return formattedPrice;
	}

	public String toString() {
		return ("Product # " + productCode + " is " + description + '\n' + "Currently " + productCount + " on hand \n"
				+ "Price: $" + price);

	}

	public void selling(int sold) {
		this.productCount = productCount - sold;
	}

	public void buying(int bought) {
		this.productCount = productCount + bought;
	}

	public void discount(double discountedAmount) {
		double newPrice = (price - discountedAmount / 100 * price);
		this.price = (Math.round(newPrice * 100.0) / 100.0); // TWO DECIMAL formatting
	}


}
